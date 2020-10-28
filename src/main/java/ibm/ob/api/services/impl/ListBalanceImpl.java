package ibm.ob.api.services.impl;
 
import java.util.*;
 
import ibm.ob.api.model.ListBalanceP;
import ibm.ob.api.model.ListBalanceResponseWrapper;
import ibm.ob.api.services.ListBalanceI;
 
import org.springframework.stereotype.Service;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

 
@Service
public class ListBalanceImpl implements ListBalanceI {
 
    private static final Log logger = LogFactory.getLog(ListBalanceImpl.class);
   
    public ListBalanceResponseWrapper reliable(ListBalanceP pojo, Throwable exception){ 
        //TODO
        logger.info("Reliable method triggered with exception : "+exception.getMessage());
        return new ListBalanceResponseWrapper();
	}

	@Override
    @HystrixCommand(fallbackMethod = "reliable" , commandProperties = {
		@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "10000")})
	public ListBalanceResponseWrapper execute(ListBalanceP requestParams){
        //TODO
        return new ListBalanceResponseWrapper();
    }

              
    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException {
        //TODO to write error response //NOSONAR
        return type.newInstance();
    }
              
  }
