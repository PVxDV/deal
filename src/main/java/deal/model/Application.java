package deal.model;

import deal.model.dto.ApplicationStatusHistoryDTO;
import deal.model.dto.LoanOfferDTO;
import deal.model.enums.ApplicationStatus;

import java.time.LocalDate;
import java.util.List;

public class Application {
    Long applicationId;
    Long clientId;
    Long creditId;
    ApplicationStatus status;
    LocalDate creationDate;
    LoanOfferDTO appliedOffer;
    LocalDate signDate;
    String secCode;
    List<ApplicationStatusHistoryDTO> applicationStatusHistory;
}
