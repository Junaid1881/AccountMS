package ibm.ob.api.services.impl;
 
import java.util.*;
 
import ibm.ob.api.model.GetAccountDetailP;
import ibm.ob.api.model.GetAccountDetailResponseWrapper;
import ibm.ob.api.services.GetAccountDetailI;
 
import org.springframework.stereotype.Service;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

 
@Service
public class GetAccountDetailImpl implements GetAccountDetailI {
 
    private static final Log logger = LogFactory.getLog(GetAccountDetailImpl.class);
   
    public GetAccountDetailResponseWrapper reliable(GetAccountDetailP pojo, Throwable exception){ 
        //TODO
        logger.info("Reliable method triggered with exception : "+exception.getMessage());
        return new GetAccountDetailResponseWrapper();
	}

	@Override
    @HystrixCommand(fallbackMethod = "reliable" , commandProperties = {
		@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "10000")})
	public GetAccountDetailResponseWrapper execute(GetAccountDetailP requestParams){
        //TODO
        return new GetAccountDetailResponseWrapper();
    }

              
    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException {
        //TODO to write error response //NOSONAR
        return type.newInstance();
    }
              
  }
