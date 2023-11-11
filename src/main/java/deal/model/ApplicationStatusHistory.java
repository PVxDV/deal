package deal.model;

import deal.model.enums.ApplicationStatus;
import deal.model.enums.ChangeType;

import java.time.LocalDate;

public class ApplicationStatusHistory {
    ApplicationStatus status;
    LocalDate time;
    ChangeType changeType;
}
