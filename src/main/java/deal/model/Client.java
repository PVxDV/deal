package deal.model;

import deal.model.enums.Gender;
import deal.model.enums.MaritalStatus;
import deal.model.jsonObj.Employment;
import deal.model.jsonObj.Passport;
import io.hypersistence.utils.hibernate.type.json.JsonBinaryType;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.hibernate.annotations.Type;

import java.time.LocalDate;

@Entity
@Table(name = "client")
@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
public class Client extends BaseEntity{
    @Column(name = "last_name", columnDefinition = "varchar")
    private String lastName;
    @Column(name = "first_name", columnDefinition = "varchar")
    private String firstName;
    @Column(name = "middle_name", columnDefinition = "varchar")
    private String middleName;
    @Column(name = "birth_date", columnDefinition = "DATE")
    private LocalDate birthdate;
    @Column(name = "email", columnDefinition = "varchar")
    private String email;
    @Enumerated(EnumType.STRING)
    @Column(name = "gender", columnDefinition = "varchar")
    private Gender gender;
    @Enumerated(EnumType.STRING)
    @Column(name = "marital_status", columnDefinition = "varchar")
    private MaritalStatus maritalStatus;
    @Column(name = "dependent_amount")
    private Integer dependentAmount;
    @Type(JsonBinaryType.class)
    @Column(name = "passport_id", columnDefinition = "jsonb")
    private Passport passport;
    @Type(JsonBinaryType.class)
    @Column(name = "employment_id", columnDefinition = "jsonb")
    private Employment employment;
    @Column(name = "account")
    private String account;
}
