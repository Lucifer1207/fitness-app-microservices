package com.fitness.userservice.services;

import com.fitness.userservice.UserRepository;
import com.fitness.userservice.dto.RegisterRequest;
import com.fitness.userservice.dto.UserResponse;
import com.fitness.userservice.models.User;
import lombok.AllArgsConstructor;
import org.apache.coyote.Request;
import org.jspecify.annotations.Nullable;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {
    private final UserRepository repository;
    public UserResponse register(RegisterRequest request) {

        if(repository.existsByEmail(request.getEmail())){
            User existingUser=repository.findByEmail(request.getEmail());
            UserResponse response=new UserResponse();
            response.setId(existingUser.getId());
            response.setEmail(existingUser.getEmail());
            response.setFirstName(existingUser.getFirstName());
            response.setLastName(existingUser.getLastName());
            response.setPassword(existingUser.getPassword());
            response.setCreatedAt(existingUser.getCreatedAt());
            response.setUpdatedAt(existingUser.getUpdatedAt());
            return response;
        }

        User user = new User();
        user.setEmail(request.getEmail());
        user.setPassword(request.getPassword());
        user.setKeycloakId(request.getKeycloakId());
        user.setFirstName(request.getFirstName());
        user.setLastName(request.getLastName());

        User savedUser=repository.save(user);
        UserResponse response=new UserResponse();
        response.setId(savedUser.getId());
        response.setEmail(savedUser.getEmail());
        response.setKeycloakId(savedUser.getKeycloakId());
        response.setFirstName(savedUser.getFirstName());
        response.setLastName(savedUser.getLastName());
        response.setPassword(savedUser.getPassword());
        response.setCreatedAt(savedUser.getCreatedAt());
        response.setUpdatedAt(savedUser.getUpdatedAt());
        return response;
    }

    public UserResponse getUserProfile(String userId) {
        User user=repository.findById(userId)
                .orElseThrow(()-> new RuntimeException("User Not Found"));
        UserResponse response=new UserResponse();
        response.setId(user.getId());
        response.setEmail(user.getEmail());
        response.setKeycloakId(user.getKeycloakId());
        response.setFirstName(user.getFirstName());
        response.setLastName(user.getLastName());
        response.setPassword(user.getPassword());
        response.setCreatedAt(user.getCreatedAt());
        response.setUpdatedAt(user.getUpdatedAt());
        return response;
    }

    public Boolean existByUserId(String userId) {
        return repository.existsByKeycloakId(userId);
    }
}
