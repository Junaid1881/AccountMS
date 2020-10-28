package ibm.ob.api.services.impl;
 
import java.util.*;
 
import ibm.ob.api.model.ListDirectDebitsP;
import ibm.ob.api.model.ListDirectDebitsResponseWrapper;
import ibm.ob.api.services.ListDirectDebitsI;
 
import org.springframework.stereotype.Service;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

 
@Service
public class ListDirectDebitsImpl implements ListDirectDebitsI {
 
    private static final Log logger = LogFactory.getLog(ListDirectDebitsImpl.class);
   
    public ListDirectDebitsResponseWrapper reliable(ListDirectDebitsP pojo, Throwable exception){ 
        //TODO
        logger.info("Reliable method triggered with exception : "+exception.getMessage());
        return new ListDirectDebitsResponseWrapper();
	}

	@Override
    @HystrixCommand(fallbackMethod = "reliable" , commandProperties = {
		@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "10000")})
	public ListDirectDebitsResponseWrapper execute(ListDirectDebitsP requestParams){
        //TODO
        return new ListDirectDebitsResponseWrapper();
    }

              
    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException {
        //TODO to write error response //NOSONAR
        return type.newInstance();
    }
              
  }
