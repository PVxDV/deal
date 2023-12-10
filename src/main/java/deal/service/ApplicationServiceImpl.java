package deal.service;

import deal.command.ApplicationResponse;
import deal.command.ClientResponse;
import deal.model.Application;
import deal.model.Client;
import deal.repository.ApplicationRepository;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
public class ApplicationServiceImpl implements ApplicationService {
    private final ApplicationRepository applicationRepository;
    @NotNull
    @Override
    @Transactional
    public ApplicationResponse createApplication(ClientResponse clientResponse) {

        return null;
    }

    /*

      public ClientResponse createClient(@NotNull LoanApplicationRequestDTO loanApplicationRequestDTO) {
        Client client = buildClientRequest(loanApplicationRequestDTO);
        return buildClientResponse(clientRepository.save(client));
    }

    @NotNull
    private Client buildClientRequest(@NotNull LoanApplicationRequestDTO loanApplicationRequestDTO) {
        return new Client().setLastName(loanApplicationRequestDTO.getLastName())
                .setFirstName(loanApplicationRequestDTO.getFirstName())
                .setMiddleName(loanApplicationRequestDTO.getMiddleName())
                .setBirthdate(loanApplicationRequestDTO.getBirthdate())
                .setEmail(loanApplicationRequestDTO.getEmail())
                .setDependentAmount(loanApplicationRequestDTO.getAmount().intValueExact())
                .setPassport(new Passport()
                        .setPassportNumber(loanApplicationRequestDTO.getPassportNumber())
                        .setPassportSeries(loanApplicationRequestDTO.getPassportSeries()));

    }

    @NotNull
    private ClientResponse buildClientResponse(@NotNull Client client) {
        return new ClientResponse().setClientId(client.getClientId())
                .setLastName(client.getLastName())
                .setFirstName(client.getFirstName())
                .setMiddleName(client.getMiddleName())
                .setBirthdate(client.getBirthdate())
                .setEmail(client.getEmail())
                .setDependentAmount(client.getDependentAmount())
                .setPassport(new Passport()
                        .setPassportNumber(client.getPassport().getPassportNumber())
                        .setPassportSeries(client.getPassport().getPassportSeries()));
    }
     */
}
