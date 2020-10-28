package ibm.ob.api.services;

import ibm.ob.api.model.GetAccountDetailP;
import ibm.ob.api.model.GetAccountDetailResponseWrapper;

public interface GetAccountDetailI {

    public GetAccountDetailResponseWrapper execute(GetAccountDetailP requestParams);

    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException;

}
