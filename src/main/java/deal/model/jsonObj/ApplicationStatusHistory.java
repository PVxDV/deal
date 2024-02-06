package deal.model.jsonObj;

import deal.model.enums.ApplicationStatus;
import deal.model.enums.ChangeType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.time.LocalDate;

@Data
@Accessors(chain = true)
public class ApplicationStatusHistory {
    private ApplicationStatus status;
    private LocalDate time;
    private ChangeType changeType;
}
