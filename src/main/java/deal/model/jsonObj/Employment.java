package deal.model.jsonObj;

import deal.model.enums.EmploymentStatus;
import deal.model.enums.Position;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.math.BigDecimal;
@Getter
@Setter
@Accessors(chain = true)
public class Employment {
    private Long employmentId;
    private EmploymentStatus employmentStatus;
    private String employerINN;
    private BigDecimal salary;
    private Position position;
    private Integer workExperienceTotal;
    private Integer workExperienceCurrent;
}
