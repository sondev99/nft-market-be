package org.sondev.nftmarketplacebe.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class LoginRequest {
    @NotEmpty(message = "Email can not be a null or empty")
    @Email(message = "Email address should be a valid value")
    private String email;

    @Size(min = 5, message = "The length of the password should be great than 5")
    private String password;
}
