package model;

import model.enums.EmploymentStatus;
import model.enums.Position;

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
