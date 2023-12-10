package deal.dto;

import deal.model.enums.Gender;
import deal.model.enums.MaritalStatus;

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