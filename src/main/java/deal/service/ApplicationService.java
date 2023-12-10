package deal.service;

import deal.command.ApplicationResponse;
import deal.command.ClientResponse;
import deal.model.Application;
import deal.model.Client;

public interface ApplicationService {
    ApplicationResponse createApplication (ClientResponse clientResponse);
}
