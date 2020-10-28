package ibm.ob.api.model;

import org.springframework.util.MultiValueMap;

import org.springframework.util.LinkedMultiValueMap;

import org.springframework.http.ResponseEntity;
import ibm.ob.api.model.ResponseBankingAccountList;


public class ListAccountsResponseWrapper {

	private ResponseBankingAccountList response;

        public MultiValueMap<String, String> getHeaders(){
            final MultiValueMap<String, String> map=new LinkedMultiValueMap<String, String>();
            return map;
	}

	public void setHeaders(){
            
	}
 
	public ResponseBankingAccountList getResponse(){
            return response;
	}
 
	public void setResponse(ResponseBankingAccountList response){
            this.response=response;
	} 
}
