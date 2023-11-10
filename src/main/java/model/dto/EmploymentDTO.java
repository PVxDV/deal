package model.dto;


import model.enums.EmploymentStatus;
import model.enums.Position;

import java.math.BigDecimal;

public class EmploymentDTO {
    EmploymentStatus employmentStatus;
    String employerINN;
    BigDecimal salary;
    Position position;
    Integer workExperienceTotal;
    Integer workExperienceCurrent;
}
