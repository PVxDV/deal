# deal

## Логика работы API:
  * *POST: /deal/application*
  1. По API приходит *LoanApplicationRequestDTO*
  2. На основе *LoanApplicationRequestDTO* создаётся сущность *Client* и сохраняется в БД.
  3. Создаётся *Application* со связью на только что созданный *Client* и сохраняется в БД.
  4. Отправляется *POST* запрос на */conveyor/offers МС conveyor* через *FeignClient*. 
     Каждому элементу из списка *List<LoanOfferDTO>* присваивается id созданной заявки (*Application*)
  5. Ответ на API - список из 4х *LoanOfferDTO* от "худшего" к "лучшему".
  * *PUT: /deal/offer*
  1. По API приходит *LoanOfferDTO*
  2. Достаётся из БД заявка(*Application*) по *applicationId* из *LoanOfferDTO*.
  3. В заявке обновляется статус, история статусов(*List<ApplicationStatusHistoryDTO>*),
     принятое предложение *LoanOfferDTO* устанавливается в поле *appliedOffer*.
  4. Заявка сохраняется.
  * *PUT: /deal/calculate/{applicationId}*
  1. По API приходит объект *FinishRegistrationRequestDTO* и параметр *applicationId*.
  2. Достаётся из БД заявка(*Application*) по *applicationId*.
  3. *ScoringDataDTO* насыщается информацией из *FinishRegistrationRequestDTO* и *Client*, который хранится в *Application*
  4. Отправляется *POST* запрос на */conveyor/calculation МС conveyor* с телом *ScoringDataDTO* через *FeignClient*.
  5. На основе полученного из кредитного конвейера *CreditDTO* создаётся сущность *Credit* и сохраняется в базу со статусом *CALCULATED*.
  6. В заявке обновляется статус, история статусов.
  7. Заявка сохраняется.