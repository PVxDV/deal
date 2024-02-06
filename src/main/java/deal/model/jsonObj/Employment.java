package deal.model.jsonObj;

import deal.model.enums.EmploymentStatus;
import deal.model.enums.Position;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.experimental.Accessors;

import java.math.BigDecimal;
@Data
@Accessors(chain = true)
public class Employment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long employmentId;
    private EmploymentStatus employmentStatus;
    private String employerINN;
    private BigDecimal salary;
    private Position position;
    private Integer workExperienceTotal;
    private Integer workExperienceCurrent;
}
