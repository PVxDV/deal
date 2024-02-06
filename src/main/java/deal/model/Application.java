package deal.model;

import deal.dto.LoanOfferDTO;
import deal.model.enums.ApplicationStatus;
import deal.model.jsonObj.ApplicationStatusHistory;
import io.hypersistence.utils.hibernate.type.json.JsonBinaryType;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.hibernate.annotations.Type;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "application")
@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
public class Application extends BaseEntity {
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "client_id", foreignKey = @ForeignKey(name = "fk_application_client_id"))
    private Client client;
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "credit_id", foreignKey = @ForeignKey(name = "fk_application_credit_id"))
    private Credit credit;
    @Enumerated(EnumType.STRING)
    @Column(name = "status", columnDefinition = "varchar")
    private ApplicationStatus status;
    @Column(name = "creation_date", columnDefinition = "TIMESTAMP")
    private LocalDate creationDate;
    @Type(JsonBinaryType.class)
    @Column(name = "applied_offer", columnDefinition = "jsonb")
    private LoanOfferDTO appliedOffer;
    @Column(name = "sign_date", columnDefinition = "TIMESTAMP")
    private LocalDate signDate;
    @Column(name = "ses_code")
    private String secCode;
    @Type(JsonBinaryType.class)
    @Column(name = "status_history", columnDefinition = "jsonb")
    private List<ApplicationStatusHistory> applicationStatusHistory = new ArrayList<>();
}
