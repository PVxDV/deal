package deal.model;

import deal.model.enums.Gender;
import deal.model.enums.MaritalStatus;

import java.time.LocalDate;

public class Client {
    Long clientId;
    String lastName;
    String firstName;
    String middleName;
    LocalDate birthdate;
    String email;
    Gender gender;
    MaritalStatus maritalStatus;
    Integer dependentAmount;
    Long passportId;
    Long employmentId;
    String account;


}
