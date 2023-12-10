package deal.dto;


import deal.model.enums.EmploymentStatus;
import deal.model.enums.Position;

import java.math.BigDecimal;

public class EmploymentDTO {
    EmploymentStatus employmentStatus;
    String employerINN;
    BigDecimal salary;
    Position position;
    Integer workExperienceTotal;
    Integer workExperienceCurrent;
}
