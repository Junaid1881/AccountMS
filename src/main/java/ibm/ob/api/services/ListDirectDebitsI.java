package ibm.ob.api.services;

import ibm.ob.api.model.ListDirectDebitsP;
import ibm.ob.api.model.ListDirectDebitsResponseWrapper;

public interface ListDirectDebitsI {

    public ListDirectDebitsResponseWrapper execute(ListDirectDebitsP requestParams);

    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException;

}
