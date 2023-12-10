package deal.model;

import deal.model.enums.Gender;
import deal.model.enums.MaritalStatus;
import deal.model.jsonObj.Employment;
import deal.model.jsonObj.Passport;
import io.hypersistence.utils.hibernate.type.basic.PostgreSQLEnumType;
import io.hypersistence.utils.hibernate.type.json.JsonBinaryType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import jakarta.persistence.*;
import org.hibernate.annotations.Type;

import java.time.LocalDate;

@Getter
@Setter
@Accessors(chain = true)
@Entity
@Table(name = "client")
@NoArgsConstructor
@AllArgsConstructor
public class Client extends BaseEntity{
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "middle_name")
    private String middleName;
    @Column(name = "birth_date", columnDefinition = "DATE")
    private LocalDate birthdate;
    @Column(name = "email")
    private String email;
    @Enumerated(EnumType.STRING)
    @Type(PostgreSQLEnumType.class)
    @Column(name = "gender", columnDefinition = "varchar")
    private Gender gender;
    @Enumerated(EnumType.STRING)
    @Type(PostgreSQLEnumType.class)
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
