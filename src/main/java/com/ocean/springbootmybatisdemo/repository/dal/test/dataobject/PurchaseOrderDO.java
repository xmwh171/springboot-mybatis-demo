package com.ocean.springbootmybatisdemo.repository.dal.test.dataobject;

import java.util.Date;
import java.math.BigDecimal;

/**
 * The table PURCHASE_ORDER
 */
public class PurchaseOrderDO{

    /**
     * id ID.
     */
    private Long id;
    /**
     * prop1 PROP1.
     */
    private String prop1;
    /**
     * prop2 PROP2.
     */
    private String prop2;
    /**
     * telno TELNO.
     */
    private String telno;
    /**
     * remark REMARK.
     */
    private String remark;
    /**
     * contact CONTACT.
     */
    private String contact;
    /**
     * outerNo OUTER_NO.
     */
    private String outerNo;
    /**
     * providerNo PROVIDER_NO.
     */
    private String providerNo;
    /**
     * purchaseNo PURCHASE_NO.
     */
    private String purchaseNo;
    /**
     * warehouseNo WAREHOUSE_NO.
     */
    private String warehouseNo;
    /**
     * providerName PROVIDER_NAME.
     */
    private String providerName;
    /**
     * receiveAddress RECEIVE_ADDRESS.
     */
    private String receiveAddress;
    /**
     * status STATUS.
     */
    private Integer status;
    /**
     * purchaseId PURCHASE_ID.
     */
    private Integer purchaseId;
    /**
     * logisticsType LOGISTICS_TYPE.
     */
    private Integer logisticsType;
    /**
     * created CREATED.
     */
    private Date created;
    /**
     * modified MODIFIED.
     */
    private Date modified;
    /**
     * checkTime CHECK_TIME.
     */
    private Date checkTime;
    /**
     * gmtCreate GMT_CREATE.
     */
    private Date gmtCreate;
    /**
     * gmtModify GMT_MODIFY.
     */
    private Date gmtModify;
    /**
     * expectArriveTime EXPECT_ARRIVE_TIME.
     */
    private Date expectArriveTime;
    /**
     * postFee POST_FEE.
     */
    private BigDecimal postFee;
    /**
     * otherFee OTHER_FEE.
     */
    private BigDecimal otherFee;
    /**
     * goodsAmount GOODS_AMOUNT.
     */
    private BigDecimal goodsAmount;
    /**
     * taxGoodsAmount TAX_GOODS_AMOUNT.
     */
    private BigDecimal taxGoodsAmount;

    /**
     * Set id ID.
     */
    public void setId(Long id){
        this.id = id;
    }

    /**
     * Get id ID.
     *
     * @return the string
     */
    public Long getId(){
        return id;
    }

    /**
     * Set prop1 PROP1.
     */
    public void setProp1(String prop1){
        this.prop1 = prop1;
    }

    /**
     * Get prop1 PROP1.
     *
     * @return the string
     */
    public String getProp1(){
        return prop1;
    }

    /**
     * Set prop2 PROP2.
     */
    public void setProp2(String prop2){
        this.prop2 = prop2;
    }

    /**
     * Get prop2 PROP2.
     *
     * @return the string
     */
    public String getProp2(){
        return prop2;
    }

    /**
     * Set telno TELNO.
     */
    public void setTelno(String telno){
        this.telno = telno;
    }

    /**
     * Get telno TELNO.
     *
     * @return the string
     */
    public String getTelno(){
        return telno;
    }

    /**
     * Set remark REMARK.
     */
    public void setRemark(String remark){
        this.remark = remark;
    }

    /**
     * Get remark REMARK.
     *
     * @return the string
     */
    public String getRemark(){
        return remark;
    }

    /**
     * Set contact CONTACT.
     */
    public void setContact(String contact){
        this.contact = contact;
    }

    /**
     * Get contact CONTACT.
     *
     * @return the string
     */
    public String getContact(){
        return contact;
    }

    /**
     * Set outerNo OUTER_NO.
     */
    public void setOuterNo(String outerNo){
        this.outerNo = outerNo;
    }

    /**
     * Get outerNo OUTER_NO.
     *
     * @return the string
     */
    public String getOuterNo(){
        return outerNo;
    }

    /**
     * Set providerNo PROVIDER_NO.
     */
    public void setProviderNo(String providerNo){
        this.providerNo = providerNo;
    }

    /**
     * Get providerNo PROVIDER_NO.
     *
     * @return the string
     */
    public String getProviderNo(){
        return providerNo;
    }

    /**
     * Set purchaseNo PURCHASE_NO.
     */
    public void setPurchaseNo(String purchaseNo){
        this.purchaseNo = purchaseNo;
    }

    /**
     * Get purchaseNo PURCHASE_NO.
     *
     * @return the string
     */
    public String getPurchaseNo(){
        return purchaseNo;
    }

    /**
     * Set warehouseNo WAREHOUSE_NO.
     */
    public void setWarehouseNo(String warehouseNo){
        this.warehouseNo = warehouseNo;
    }

    /**
     * Get warehouseNo WAREHOUSE_NO.
     *
     * @return the string
     */
    public String getWarehouseNo(){
        return warehouseNo;
    }

    /**
     * Set providerName PROVIDER_NAME.
     */
    public void setProviderName(String providerName){
        this.providerName = providerName;
    }

    /**
     * Get providerName PROVIDER_NAME.
     *
     * @return the string
     */
    public String getProviderName(){
        return providerName;
    }

    /**
     * Set receiveAddress RECEIVE_ADDRESS.
     */
    public void setReceiveAddress(String receiveAddress){
        this.receiveAddress = receiveAddress;
    }

    /**
     * Get receiveAddress RECEIVE_ADDRESS.
     *
     * @return the string
     */
    public String getReceiveAddress(){
        return receiveAddress;
    }

    /**
     * Set status STATUS.
     */
    public void setStatus(Integer status){
        this.status = status;
    }

    /**
     * Get status STATUS.
     *
     * @return the string
     */
    public Integer getStatus(){
        return status;
    }

    /**
     * Set purchaseId PURCHASE_ID.
     */
    public void setPurchaseId(Integer purchaseId){
        this.purchaseId = purchaseId;
    }

    /**
     * Get purchaseId PURCHASE_ID.
     *
     * @return the string
     */
    public Integer getPurchaseId(){
        return purchaseId;
    }

    /**
     * Set logisticsType LOGISTICS_TYPE.
     */
    public void setLogisticsType(Integer logisticsType){
        this.logisticsType = logisticsType;
    }

    /**
     * Get logisticsType LOGISTICS_TYPE.
     *
     * @return the string
     */
    public Integer getLogisticsType(){
        return logisticsType;
    }

    /**
     * Set created CREATED.
     */
    public void setCreated(Date created){
        this.created = created;
    }

    /**
     * Get created CREATED.
     *
     * @return the string
     */
    public Date getCreated(){
        return created;
    }

    /**
     * Set modified MODIFIED.
     */
    public void setModified(Date modified){
        this.modified = modified;
    }

    /**
     * Get modified MODIFIED.
     *
     * @return the string
     */
    public Date getModified(){
        return modified;
    }

    /**
     * Set checkTime CHECK_TIME.
     */
    public void setCheckTime(Date checkTime){
        this.checkTime = checkTime;
    }

    /**
     * Get checkTime CHECK_TIME.
     *
     * @return the string
     */
    public Date getCheckTime(){
        return checkTime;
    }

    /**
     * Set gmtCreate GMT_CREATE.
     */
    public void setGmtCreate(Date gmtCreate){
        this.gmtCreate = gmtCreate;
    }

    /**
     * Get gmtCreate GMT_CREATE.
     *
     * @return the string
     */
    public Date getGmtCreate(){
        return gmtCreate;
    }

    /**
     * Set gmtModify GMT_MODIFY.
     */
    public void setGmtModify(Date gmtModify){
        this.gmtModify = gmtModify;
    }

    /**
     * Get gmtModify GMT_MODIFY.
     *
     * @return the string
     */
    public Date getGmtModify(){
        return gmtModify;
    }

    /**
     * Set expectArriveTime EXPECT_ARRIVE_TIME.
     */
    public void setExpectArriveTime(Date expectArriveTime){
        this.expectArriveTime = expectArriveTime;
    }

    /**
     * Get expectArriveTime EXPECT_ARRIVE_TIME.
     *
     * @return the string
     */
    public Date getExpectArriveTime(){
        return expectArriveTime;
    }

    /**
     * Set postFee POST_FEE.
     */
    public void setPostFee(BigDecimal postFee){
        this.postFee = postFee;
    }

    /**
     * Get postFee POST_FEE.
     *
     * @return the string
     */
    public BigDecimal getPostFee(){
        return postFee;
    }

    /**
     * Set otherFee OTHER_FEE.
     */
    public void setOtherFee(BigDecimal otherFee){
        this.otherFee = otherFee;
    }

    /**
     * Get otherFee OTHER_FEE.
     *
     * @return the string
     */
    public BigDecimal getOtherFee(){
        return otherFee;
    }

    /**
     * Set goodsAmount GOODS_AMOUNT.
     */
    public void setGoodsAmount(BigDecimal goodsAmount){
        this.goodsAmount = goodsAmount;
    }

    /**
     * Get goodsAmount GOODS_AMOUNT.
     *
     * @return the string
     */
    public BigDecimal getGoodsAmount(){
        return goodsAmount;
    }

    /**
     * Set taxGoodsAmount TAX_GOODS_AMOUNT.
     */
    public void setTaxGoodsAmount(BigDecimal taxGoodsAmount){
        this.taxGoodsAmount = taxGoodsAmount;
    }

    /**
     * Get taxGoodsAmount TAX_GOODS_AMOUNT.
     *
     * @return the string
     */
    public BigDecimal getTaxGoodsAmount(){
        return taxGoodsAmount;
    }
}
