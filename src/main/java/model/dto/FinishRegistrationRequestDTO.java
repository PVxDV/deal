package model.dto;

import model.dto.EmploymentDTO;
import model.enums.Gender;
import model.enums.MaritalStatus;

import java.time.LocalDate;

public class FinishRegistrationRequestDTO {
    Gender gender;
    MaritalStatus maritalStatus;
    Integer dependentAmount;
    LocalDate passportIssueDate;
    String passportIssueBrach;
    EmploymentDTO employment;
    String account;
}