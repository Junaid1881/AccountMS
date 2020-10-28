package ibm.ob.api.services;

import ibm.ob.api.model.ListBalancesBulkP;
import ibm.ob.api.model.ListBalancesBulkResponseWrapper;

public interface ListBalancesBulkI {

    public ListBalancesBulkResponseWrapper execute(ListBalancesBulkP requestParams);

    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException;

}
