package model;

import model.dto.ApplicationStatusHistoryDTO;
import model.dto.LoanOfferDTO;
import model.enums.ApplicationStatus;

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
