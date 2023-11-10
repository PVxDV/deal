package model.dto;

import model.enums.ApplicationStatus;
import model.enums.ChangeType;

import java.time.LocalDate;

public class ApplicationStatusHistoryDTO {
    ApplicationStatus status;
    LocalDate time;
    ChangeType changeType;
}
