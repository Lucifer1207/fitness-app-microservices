package com.fitness.activityservice.service;

import com.fitness.activityservice.ActivityRepository;
import com.fitness.activityservice.dto.ActivityRequest;
import com.fitness.activityservice.dto.ActivityResponse;
import com.fitness.activityservice.model.Activity;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.jspecify.annotations.Nullable;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ActivityService {
    private final ActivityRepository activityRepository;
    private final UserValidationService userValidationService;
    private final KafkaTemplate<String, Activity> kafkaTemplate;

    @Value("${kafka.topic.name}")
    private String topicName;

    public ActivityResponse trackActivity(ActivityRequest request) {

        boolean isValidUser = userValidationService.validateUser(request.getUserId());
        if(!isValidUser) {
            throw new RuntimeException("Invalid User : User does not exist " + request.getUserId());
        }

        Activity activity= Activity.builder()
                .userId(request.getUserId())
                .type(request.getType())
                .duration(request.getDuration())
                .caloriesBurned(request.getCaloriesBurned())
                .startTime(request.getStartTime())
                .additionalMetrics(request.getAdditionalMetrics())
                .build();
        Activity savedActivity = activityRepository.save(activity);

        //publish the saved activity to kafka
        try{
            kafkaTemplate.send(topicName, savedActivity.getUserId(), savedActivity);
        } catch(Exception e){
            e.printStackTrace();
        }


        return mapToResponse(savedActivity);
    }

    private ActivityResponse mapToResponse(Activity savedActivity) {
        ActivityResponse activityResponse = new ActivityResponse();
        activityResponse.setId(savedActivity.getId());
        activityResponse.setUserId(savedActivity.getUserId());
        activityResponse.setType(savedActivity.getType());
        activityResponse.setDuration(savedActivity.getDuration());
        activityResponse.setStartTime(savedActivity.getStartTime());
        activityResponse.setAdditionalMetrics(savedActivity.getAdditionalMetrics());
        activityResponse.setCaloriesBurned(savedActivity.getCaloriesBurned());
        activityResponse.setCreatedAt(savedActivity.getCreatedAt());
        activityResponse.setUpdatedAt(savedActivity.getUpdatedAt());
        return activityResponse;
    }
}
