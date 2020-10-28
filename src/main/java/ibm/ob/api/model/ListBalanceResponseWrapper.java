package ibm.ob.api.model;

import org.springframework.util.MultiValueMap;

import org.springframework.util.LinkedMultiValueMap;

import org.springframework.http.ResponseEntity;
import ibm.ob.api.model.ResponseBankingAccountsBalanceById;


public class ListBalanceResponseWrapper {

	private ResponseBankingAccountsBalanceById response;

        public MultiValueMap<String, String> getHeaders(){
            final MultiValueMap<String, String> map=new LinkedMultiValueMap<String, String>();
            return map;
	}

	public void setHeaders(){
            
	}
 
	public ResponseBankingAccountsBalanceById getResponse(){
            return response;
	}
 
	public void setResponse(ResponseBankingAccountsBalanceById response){
            this.response=response;
	} 
}
