package deal.service;

import deal.command.ClientResponse;
import deal.dto.LoanApplicationRequestDTO;
import deal.model.Client;

public interface ClientService {
    ClientResponse createClient (LoanApplicationRequestDTO loanApplicationRequestDTO);
}
