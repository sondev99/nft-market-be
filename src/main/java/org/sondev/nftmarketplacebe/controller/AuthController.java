package org.sondev.nftmarketplacebe.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.sondev.nftmarketplacebe.constance.ResponseStatus;
import org.sondev.nftmarketplacebe.dto.request.LoginRequest;
import org.sondev.nftmarketplacebe.dto.request.RegisterRequest;
import org.sondev.nftmarketplacebe.dto.response.ApiResponse;
import org.sondev.nftmarketplacebe.dto.response.AuthResponse;
import org.sondev.nftmarketplacebe.service.AuthService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@Slf4j
@RequiredArgsConstructor
public class AuthController {
    private final AuthService authService;

    @PostMapping("/login")
    public ResponseEntity<ApiResponse> login(@Valid @RequestBody LoginRequest loginRequest) {
        log.info("*** Controller; login *");
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(
                        ApiResponse.<AuthResponse>builder()
                                .code(200)
                                .message("Login successful")
                                .result(authService.login(loginRequest))
                                .build()
                );
    }

    @PostMapping("/register")
    public ResponseEntity<ApiResponse> register(@Valid @RequestBody RegisterRequest registerRequest) {
        log.info("*** UserDto List, controller; login *");
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(
                        ApiResponse.builder()
                                .code(200)
                                .message("Register successful")
                                .result(authService.register(registerRequest))
                                .build()
                );
    }


}
