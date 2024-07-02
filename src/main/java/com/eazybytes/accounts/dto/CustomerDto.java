package com.eazybytes.accounts.dto;

import com.eazybytes.accounts.entity.Accounts;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class CustomerDto {

    @NotEmpty(message = "Name cannot be empty")
    @Size(min=5, max=30, message = "size is incorrect")
    private String name;

    @NotEmpty(message = "Email cannot be empty")
    @Email(message = "Email address not valid")
    private String email;

    @Pattern(regexp = "(^$|[0-9]{10})", message = "Mobile number must be 10 digits")
    private String mobileNumber;

    private AccountsDto accountsDto;
}
