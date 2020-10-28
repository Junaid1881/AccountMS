package ibm.ob.api.model;

import org.springframework.http.ResponseEntity;
import ibm.ob.api.model.ResponseBankingAccountsBalanceList;

public class ListBalancesBulkP {

    private String xV;
    private String productCategory;
    private String openStatus;
    private Boolean isOwned;
    private Integer page;
    private Integer pageSize;
    private String xMinV;
    private String xFapiInteractionId;
    private String xFapiAuthDate;
    private String xFapiCustomerIpAddress;
    private String xCdsUserAgent;
    private String xCdsSubject;

    public ListBalancesBulkP() {

    }

    public ListBalancesBulkP(String xV,String productCategory,String openStatus,Boolean isOwned,Integer page,Integer pageSize,String xMinV,String xFapiInteractionId,String xFapiAuthDate,String xFapiCustomerIpAddress,String xCdsUserAgent,String xCdsSubject) {
        this.xV = xV;
        this.productCategory = productCategory;
        this.openStatus = openStatus;
        this.isOwned = isOwned;
        this.page = page;
        this.pageSize = pageSize;
        this.xMinV = xMinV;
        this.xFapiInteractionId = xFapiInteractionId;
        this.xFapiAuthDate = xFapiAuthDate;
        this.xFapiCustomerIpAddress = xFapiCustomerIpAddress;
        this.xCdsUserAgent = xCdsUserAgent;
        this.xCdsSubject = xCdsSubject;
    }

    public String getXV () {
        return xV;
    }

    public void setXV (String xV) {
        this.xV = xV;
    }
    public String getProductCategory () {
        return productCategory;
    }

    public void setProductCategory (String productCategory) {
        this.productCategory = productCategory;
    }
    public String getOpenStatus () {
        return openStatus;
    }

    public void setOpenStatus (String openStatus) {
        this.openStatus = openStatus;
    }
    public Boolean getIsOwned () {
        return isOwned;
    }

    public void setIsOwned (Boolean isOwned) {
        this.isOwned = isOwned;
    }
    public Integer getPage () {
        return page;
    }

    public void setPage (Integer page) {
        this.page = page;
    }
    public Integer getPageSize () {
        return pageSize;
    }

    public void setPageSize (Integer pageSize) {
        this.pageSize = pageSize;
    }
    public String getXMinV () {
        return xMinV;
    }

    public void setXMinV (String xMinV) {
        this.xMinV = xMinV;
    }
    public String getXFapiInteractionId () {
        return xFapiInteractionId;
    }

    public void setXFapiInteractionId (String xFapiInteractionId) {
        this.xFapiInteractionId = xFapiInteractionId;
    }
    public String getXFapiAuthDate () {
        return xFapiAuthDate;
    }

    public void setXFapiAuthDate (String xFapiAuthDate) {
        this.xFapiAuthDate = xFapiAuthDate;
    }
    public String getXFapiCustomerIpAddress () {
        return xFapiCustomerIpAddress;
    }

    public void setXFapiCustomerIpAddress (String xFapiCustomerIpAddress) {
        this.xFapiCustomerIpAddress = xFapiCustomerIpAddress;
    }
    public String getXCdsUserAgent () {
        return xCdsUserAgent;
    }

    public void setXCdsUserAgent (String xCdsUserAgent) {
        this.xCdsUserAgent = xCdsUserAgent;
    }
    public String getXCdsSubject () {
        return xCdsSubject;
    }

    public void setXCdsSubject (String xCdsSubject) {
        this.xCdsSubject = xCdsSubject;
    }

}
