package org.sondev.nftmarketplacebe.service;

import com.nimbusds.jose.JOSEException;
import org.sondev.nftmarketplacebe.dto.request.IntrospectRequest;
import org.sondev.nftmarketplacebe.dto.request.LoginRequest;
import org.sondev.nftmarketplacebe.dto.request.RefreshRequest;
import org.sondev.nftmarketplacebe.dto.request.RegisterRequest;
import org.sondev.nftmarketplacebe.dto.response.AuthResponse;
import org.sondev.nftmarketplacebe.dto.response.IntrospectResponse;

import java.text.ParseException;

public interface AuthService {
    IntrospectResponse introspect(IntrospectRequest request) throws JOSEException, ParseException;

    AuthResponse login(LoginRequest categoryRequest);

    String register(RegisterRequest registerRequest);

    AuthResponse refreshToken(RefreshRequest request) throws ParseException, JOSEException;
}
