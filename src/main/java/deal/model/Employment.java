package deal.model;

import deal.model.enums.EmploymentStatus;
import deal.model.enums.Position;

import java.math.BigDecimal;

public class Employment {
    Long employmentId;
    EmploymentStatus employmentStatus;
    String employerINN;
    BigDecimal salary;
    Position position;
    Integer workExperienceTotal;
    Integer workExperienceCurrent;
}
