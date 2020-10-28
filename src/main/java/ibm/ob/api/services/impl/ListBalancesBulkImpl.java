package ibm.ob.api.services.impl;
 
import java.util.*;
 
import ibm.ob.api.model.ListBalancesBulkP;
import ibm.ob.api.model.ListBalancesBulkResponseWrapper;
import ibm.ob.api.services.ListBalancesBulkI;
 
import org.springframework.stereotype.Service;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

 
@Service
public class ListBalancesBulkImpl implements ListBalancesBulkI {
 
    private static final Log logger = LogFactory.getLog(ListBalancesBulkImpl.class);
   
    public ListBalancesBulkResponseWrapper reliable(ListBalancesBulkP pojo, Throwable exception){ 
        //TODO
        logger.info("Reliable method triggered with exception : "+exception.getMessage());
        return new ListBalancesBulkResponseWrapper();
	}

	@Override
    @HystrixCommand(fallbackMethod = "reliable" , commandProperties = {
		@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "10000")})
	public ListBalancesBulkResponseWrapper execute(ListBalancesBulkP requestParams){
        //TODO
        return new ListBalancesBulkResponseWrapper();
    }

              
    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException {
        //TODO to write error response //NOSONAR
        return type.newInstance();
    }
              
  }
