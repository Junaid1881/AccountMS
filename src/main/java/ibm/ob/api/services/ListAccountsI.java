package ibm.ob.api.services;

import ibm.ob.api.model.ListAccountsP;
import ibm.ob.api.model.ListAccountsResponseWrapper;

public interface ListAccountsI {

    public ListAccountsResponseWrapper execute(ListAccountsP requestParams);

    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException;

}
