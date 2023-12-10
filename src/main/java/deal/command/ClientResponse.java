package deal.command;

import deal.model.enums.Gender;
import deal.model.enums.MaritalStatus;
import deal.model.jsonObj.Employment;
import deal.model.jsonObj.Passport;
import lombok.Data;
import lombok.experimental.Accessors;

import java.time.LocalDate;

@Data
@Accessors(chain = true)
public class ClientResponse {
    private Long clientId;
    private String lastName;
    private String firstName;
    private String middleName;
    private LocalDate birthdate;
    private String email;
    private Gender gender;
    private MaritalStatus maritalStatus;
    private Integer dependentAmount;
    private Passport passport;
    private Employment employment;
    private String account;
}
