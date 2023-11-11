package deal.model;




import deal.model.enums.CreditStatus;

import java.math.BigDecimal;
import java.util.List;


public class Credit {
    Long creditId;
    BigDecimal amount;
    Integer term;
    BigDecimal monthlyPayment;
    BigDecimal rate;
    BigDecimal psk;
    List<PaymentScheduleElement> paymentSchedule;
    Boolean isInsuranceEnabled;
    Boolean isSalaryClient;
    CreditStatus status;

}

