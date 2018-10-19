package com.ocean.springbootmybatisdemo.repository.dal.test.dataobject;

import java.util.Date;
import java.math.BigDecimal;

/**
 * The table PURCHASE_ORDER_DETAIL
 */
public class PurchaseOrderDetailDO{

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
     * remark REMARK.
     */
    private String remark;
    /**
     * specNo SPEC_NO.
     */
    private String specNo;
    /**
     * recId REC_ID.
     */
    private Integer recId;
    /**
     * purchaseId PURCHASE_ID.
     */
    private Integer purchaseId;
    /**
     * modified MODIFIED.
     */
    private Date modified;
    /**
     * gmtCreate GMT_CREATE.
     */
    private Date gmtCreate;
    /**
     * gmtModify GMT_MODIFY.
     */
    private Date gmtModify;
    /**
     * num NUM.
     */
    private BigDecimal num;
    /**
     * tax TAX.
     */
    private BigDecimal tax;
    /**
     * price PRICE.
     */
    private BigDecimal price;
    /**
     * amount AMOUNT.
     */
    private BigDecimal amount;
    /**
     * discount DISCOUNT.
     */
    private BigDecimal discount;
    /**
     * taxPrice TAX_PRICE.
     */
    private BigDecimal taxPrice;
    /**
     * taxAmount TAX_AMOUNT.
     */
    private BigDecimal taxAmount;
    /**
     * stockinNum STOCKIN_NUM.
     */
    private BigDecimal stockinNum;
    /**
     * stockinAmount STOCKIN_AMOUNT.
     */
    private BigDecimal stockinAmount;

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
     * Set specNo SPEC_NO.
     */
    public void setSpecNo(String specNo){
        this.specNo = specNo;
    }

    /**
     * Get specNo SPEC_NO.
     *
     * @return the string
     */
    public String getSpecNo(){
        return specNo;
    }

    /**
     * Set recId REC_ID.
     */
    public void setRecId(Integer recId){
        this.recId = recId;
    }

    /**
     * Get recId REC_ID.
     *
     * @return the string
     */
    public Integer getRecId(){
        return recId;
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
     * Set num NUM.
     */
    public void setNum(BigDecimal num){
        this.num = num;
    }

    /**
     * Get num NUM.
     *
     * @return the string
     */
    public BigDecimal getNum(){
        return num;
    }

    /**
     * Set tax TAX.
     */
    public void setTax(BigDecimal tax){
        this.tax = tax;
    }

    /**
     * Get tax TAX.
     *
     * @return the string
     */
    public BigDecimal getTax(){
        return tax;
    }

    /**
     * Set price PRICE.
     */
    public void setPrice(BigDecimal price){
        this.price = price;
    }

    /**
     * Get price PRICE.
     *
     * @return the string
     */
    public BigDecimal getPrice(){
        return price;
    }

    /**
     * Set amount AMOUNT.
     */
    public void setAmount(BigDecimal amount){
        this.amount = amount;
    }

    /**
     * Get amount AMOUNT.
     *
     * @return the string
     */
    public BigDecimal getAmount(){
        return amount;
    }

    /**
     * Set discount DISCOUNT.
     */
    public void setDiscount(BigDecimal discount){
        this.discount = discount;
    }

    /**
     * Get discount DISCOUNT.
     *
     * @return the string
     */
    public BigDecimal getDiscount(){
        return discount;
    }

    /**
     * Set taxPrice TAX_PRICE.
     */
    public void setTaxPrice(BigDecimal taxPrice){
        this.taxPrice = taxPrice;
    }

    /**
     * Get taxPrice TAX_PRICE.
     *
     * @return the string
     */
    public BigDecimal getTaxPrice(){
        return taxPrice;
    }

    /**
     * Set taxAmount TAX_AMOUNT.
     */
    public void setTaxAmount(BigDecimal taxAmount){
        this.taxAmount = taxAmount;
    }

    /**
     * Get taxAmount TAX_AMOUNT.
     *
     * @return the string
     */
    public BigDecimal getTaxAmount(){
        return taxAmount;
    }

    /**
     * Set stockinNum STOCKIN_NUM.
     */
    public void setStockinNum(BigDecimal stockinNum){
        this.stockinNum = stockinNum;
    }

    /**
     * Get stockinNum STOCKIN_NUM.
     *
     * @return the string
     */
    public BigDecimal getStockinNum(){
        return stockinNum;
    }

    /**
     * Set stockinAmount STOCKIN_AMOUNT.
     */
    public void setStockinAmount(BigDecimal stockinAmount){
        this.stockinAmount = stockinAmount;
    }

    /**
     * Get stockinAmount STOCKIN_AMOUNT.
     *
     * @return the string
     */
    public BigDecimal getStockinAmount(){
        return stockinAmount;
    }
}
