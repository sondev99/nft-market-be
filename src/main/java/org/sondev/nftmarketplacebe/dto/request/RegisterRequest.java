package org.sondev.nftmarketplacebe.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class RegisterRequest {
    @NotEmpty(message = "First name can not be a null or empty")
    private String firstName;

    @NotEmpty(message = "Last name can not be a null or empty")
    private String lastName;

    @NotEmpty(message = "Email can not be a null or empty")
    @Email(message = "Email address should be a valid value")
    private String email;

    @Pattern(regexp = "(^$|[0-9]{10})", message = "Mobile number must be 10 digits")
    private String phone;

    @Size(min = 5, message = "The length of the password should be great than 5")
    private String password;

}
