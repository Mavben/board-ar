package com.example.boardar.service;

import com.example.boardar.dto.UserDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    public void addUser(String name, String email, String password) {
    }

    public UserDto getUser(String email) {
        return null;
    }

    public List<String> getRoles(Object userId) {
        return null;
    }
}
