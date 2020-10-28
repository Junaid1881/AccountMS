package ibm.ob.api.model;

import org.springframework.util.MultiValueMap;

import org.springframework.util.LinkedMultiValueMap;

import org.springframework.http.ResponseEntity;
import ibm.ob.api.model.ResponseBankingAccountsBalanceList;


public class ListBalancesBulkResponseWrapper {

	private ResponseBankingAccountsBalanceList response;

        public MultiValueMap<String, String> getHeaders(){
            final MultiValueMap<String, String> map=new LinkedMultiValueMap<String, String>();
            return map;
	}

	public void setHeaders(){
            
	}
 
	public ResponseBankingAccountsBalanceList getResponse(){
            return response;
	}
 
	public void setResponse(ResponseBankingAccountsBalanceList response){
            this.response=response;
	} 
}
