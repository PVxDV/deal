package deal.model.dto;

import deal.model.enums.ApplicationStatus;
import deal.model.enums.ChangeType;

import java.time.LocalDate;

public class ApplicationStatusHistoryDTO {
    ApplicationStatus status;
    LocalDate time;
    ChangeType changeType;
}
