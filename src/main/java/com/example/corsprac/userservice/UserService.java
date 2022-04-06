package com.example.corsprac.userservice;

import com.example.corsprac.dto.UserRequestDto;
import com.example.corsprac.model.User;
import com.example.corsprac.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public User signup(UserRequestDto userRequestDto){
        userRequestDto.setPassword(passwordEncoder.encode(userRequestDto.getPassword()));
        User user = new User(userRequestDto);
        return userRepository.save(user);
    }
}
