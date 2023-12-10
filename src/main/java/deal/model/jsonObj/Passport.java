package deal.model.jsonObj;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.time.LocalDate;
@Getter
@Setter
@Accessors(chain = true)
public class Passport {
    private Long passportId;
    private String passportSeries;
    private String passportNumber;
    private LocalDate passportIssueDate;
    private String passportIssueBranch;
}
