package model;

import model.enums.ApplicationStatus;
import model.enums.ChangeType;

import java.time.LocalDate;

public class ApplicationStatusHistory {
    ApplicationStatus status;
    LocalDate time;
    ChangeType changeType;
}
