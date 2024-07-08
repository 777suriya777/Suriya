package com.suriya.springboot.cademy.user;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class WebUser {
    @NotNull(message = "is required")
    @Size(min = 1,message = "is required")
    private String userName;

    @NotNull(message = "is required")
    @Size(min = 1,message = "is required")
    private String password;

    @NotNull(message = "is required")
    @Size(min = 1,message = "is required")
    private String firstName;

    @NotNull(message = "is required")
    @Size(min = 1,message = "is required")
    private String lastName;

    @NotNull(message = "is required")
    @Size(min = 1,message = "is required")
    @Pattern(regexp = "^[A-Za-z0-9]+@[A-Za-z0-9]+.com$",message = "Invalid email format")
    private String email;

    public WebUser(){}

    public @NotNull(message = "is required") @Size(min = 1, message = "is required") String getUserName() {
        return userName;
    }

    public void setUserName(@NotNull(message = "is required") @Size(min = 1, message = "is required") String userName) {
        this.userName = userName;
    }

    public @NotNull(message = "is required") @Size(min = 1, message = "is required") String getPassword() {
        return password;
    }

    public void setPassword(@NotNull(message = "is required") @Size(min = 1, message = "is required") String password) {
        this.password = password;
    }

    public @NotNull(message = "is required") @Size(min = 1, message = "is required") String getFirstName() {
        return firstName;
    }

    public void setFirstName(@NotNull(message = "is required") @Size(min = 1, message = "is required") String firstName) {
        this.firstName = firstName;
    }

    public @NotNull(message = "is required") @Size(min = 1, message = "is required") String getLastName() {
        return lastName;
    }

    public void setLastName(@NotNull(message = "is required") @Size(min = 1, message = "is required") String lastName) {
        this.lastName = lastName;
    }

    public @NotNull(message = "is required") @Size(min = 1, message = "is required") @Pattern(regexp = "^[A-Za-z0-9]+@[A-Za-z0-9]+.com$") String getEmail() {
        return email;
    }

    public void setEmail(@NotNull(message = "is required") @Size(min = 1, message = "is required") @Pattern(regexp = "^[A-Za-z0-9]+@[A-Za-z0-9]+.com$") String email) {
        this.email = email;
    }
}
