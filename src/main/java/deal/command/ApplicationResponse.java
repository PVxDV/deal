package deal.command;

import deal.dto.ApplicationStatusHistoryDTO;
import deal.dto.LoanOfferDTO;
import deal.model.enums.ApplicationStatus;
import deal.model.Client;
import deal.model.Credit;
import lombok.Data;
import lombok.experimental.Accessors;

import java.time.LocalDate;
import java.util.List;

@Data
@Accessors(chain = true)
public class ApplicationResponse {
    Long applicationId;
    Client client;
    Credit credit;
    ApplicationStatus status;
    LocalDate creationDate;
    LoanOfferDTO appliedOffer;
    LocalDate signDate;
    String secCode;
    List<ApplicationStatusHistoryDTO> applicationStatusHistory;
}
