package com.example.reservehaja.controller;

import com.example.reservehaja.data.dto.user.UserJoinResponseDto;
import com.example.reservehaja.service.user.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/auth")
public class AuthController {

    private final UserService userService;

    @PostMapping("/join")
    public boolean join(UserJoinResponseDto userJoinResponseDto){
        return userService.addUser(userJoinResponseDto);

    }

}
