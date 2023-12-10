package deal.model;


import deal.model.enums.CreditStatus;
import deal.model.jsonObj.PaymentScheduleElement;
import io.hypersistence.utils.hibernate.type.basic.PostgreSQLEnumType;
import io.hypersistence.utils.hibernate.type.json.JsonBinaryType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.hibernate.annotations.Type;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Accessors(chain = true)
@Entity
@Table(name = "credit")
public class Credit extends BaseEntity {
    @Column(name = "amount", columnDefinition = "decimal")
    private BigDecimal amount;
    @Column(name = "term")
    private Integer term;
    @Column(name = "monthly_payment", columnDefinition = "decimal")
    private BigDecimal monthlyPayment;
    @Column(name = "rate", columnDefinition = "decimal")
    private BigDecimal rate;
    @Column(name = "psk", columnDefinition = "decimal")
    private BigDecimal psk;
    @Type(JsonBinaryType.class)
    @Column(name = "payment_schedule", columnDefinition = "jsonb")
    private List<PaymentScheduleElement> paymentSchedule = new ArrayList<>();
    @Column(name = "insurance_enable")
    private Boolean isInsuranceEnabled;
    @Column(name = "salary_client")
    private Boolean isSalaryClient;
    @Enumerated(EnumType.STRING)
    @Type(PostgreSQLEnumType.class)
    @Column(name = "credit_status", columnDefinition = "varchar")
    private CreditStatus status;
}

