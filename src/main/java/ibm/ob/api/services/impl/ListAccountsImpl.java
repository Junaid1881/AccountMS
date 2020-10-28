package ibm.ob.api.services.impl;
 
import java.util.*;
 
import ibm.ob.api.model.ListAccountsP;
import ibm.ob.api.model.ListAccountsResponseWrapper;
import ibm.ob.api.services.ListAccountsI;
 
import org.springframework.stereotype.Service;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

 
@Service
public class ListAccountsImpl implements ListAccountsI {
 
    private static final Log logger = LogFactory.getLog(ListAccountsImpl.class);
   
    public ListAccountsResponseWrapper reliable(ListAccountsP pojo, Throwable exception){ 
        //TODO
        logger.info("Reliable method triggered with exception : "+exception.getMessage());
        return new ListAccountsResponseWrapper();
	}

	@Override
    @HystrixCommand(fallbackMethod = "reliable" , commandProperties = {
		@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "10000")})
	public ListAccountsResponseWrapper execute(ListAccountsP requestParams){
        //TODO
        return new ListAccountsResponseWrapper();
    }

              
    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException {
        //TODO to write error response //NOSONAR
        return type.newInstance();
    }
              
  }
