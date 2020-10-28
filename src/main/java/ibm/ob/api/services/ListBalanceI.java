package ibm.ob.api.services;

import ibm.ob.api.model.ListBalanceP;
import ibm.ob.api.model.ListBalanceResponseWrapper;

public interface ListBalanceI {

    public ListBalanceResponseWrapper execute(ListBalanceP requestParams);

    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException;

}
