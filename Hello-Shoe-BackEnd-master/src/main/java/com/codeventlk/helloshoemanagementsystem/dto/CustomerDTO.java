package com.codeventlk.helloshoemanagementsystem.dto;

import com.codeventlk.helloshoemanagementsystem.Enum.Gender;
import com.codeventlk.helloshoemanagementsystem.Enum.Level;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDTO implements SuperDTO {

    @Null(message = "Customer Id generate by the program")
    private String customerId;

    @NotBlank(message = "Customer name cannot be blank")
    @Size(min = 2, max = 50, message = "Customer name must be between 2 and 50 characters")
    private String customerName;

    @NotNull(message = "Gender cannot be null")
    private Gender gender;

    private Level level;

    @NotNull(message = "Join date cannot be null")
    @PastOrPresent(message = "Join date must be in the past or present")
    private Date joinDate;

    @PositiveOrZero(message = "Total points must be positive or zero")
    private Integer totalPoint;

    @Past(message = "Date of birth should be in the past")
    @NotNull(message = "Date of birth cannot be null")
    private Date dob;

    @NotBlank(message = "Address 1 cannot be blank")
    private String address1;

    @NotBlank(message = "Address 2 cannot be blank")
    private String address2;

    @NotBlank(message = "Address 3 cannot be blank")
    private String address3;

    @NotBlank(message = "Address 4 cannot be blank")
    private String address4;

    @NotBlank(message = "Postal code cannot be blank")
    @Pattern(regexp = "\\d{5}", message = "Postal code must be 5 digits")
    private String postalCode;

    @NotBlank(message = "Contact No cannot be blank")
    @Pattern(regexp = "^\\+?[0-9\\-\\s]+$", message = "Invalid contact number format")
    private String contactNo;

    @Email(message = "Invalid email format")
    @NotBlank(message = "Email cannot be blank")
    private String email;

    @NotNull(message = "Recent purchased date cannot be null")
    private Timestamp recentPurchasedDate;

}
