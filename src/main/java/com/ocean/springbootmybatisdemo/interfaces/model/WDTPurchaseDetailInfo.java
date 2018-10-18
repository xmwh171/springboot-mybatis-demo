package com.ocean.springbootmybatisdemo.interfaces.model;

import java.math.BigDecimal;

/**
 * @Description
 * @Author xiaohu
 * @Date 2018/10/18 13:14
 */
public class WDTPurchaseDetailInfo {

    /**
     * 详情表主键id
     */
    private int rec_id;

    /**
     * 采购单id
     */
    private int purchase_id;

    /**
     * 商家编码
     */
    private String spec_no;

    /**
     * 数量
     */
    private BigDecimal num;

    /**
     * 税前单价
     */
    private BigDecimal price;

    /**
     * 折扣
     */
    private BigDecimal discount;

    /**
     * 税率
     */
    private BigDecimal tax;

    /**
     * 税后单价
     */
    private BigDecimal tax_price;

    /**
     * 税后金额
     */
    private BigDecimal tax_amount;

    /**
     * 税前金额
     */
    private BigDecimal amount;

    /**
     * 采购到货入库总金额
     */
    private BigDecimal stockin_amount;

    /**
     * 采购到货入库数量
     */
    private BigDecimal stockin_num;

    /**
     * 自定义属性1
     */
    private String prop1;

    /**
     * 自定义属性2
     */
    private String prop2;

    /**
     * 备注
     */
    private String remark;

    /**
     * 修改时间
     */
    private String modified;

    public int getRec_id() {
        return rec_id;
    }

    public void setRec_id(int rec_id) {
        this.rec_id = rec_id;
    }

    public int getPurchase_id() {
        return purchase_id;
    }

    public void setPurchase_id(int purchase_id) {
        this.purchase_id = purchase_id;
    }

    public String getSpec_no() {
        return spec_no;
    }

    public void setSpec_no(String spec_no) {
        this.spec_no = spec_no;
    }

    public BigDecimal getNum() {
        return num;
    }

    public void setNum(BigDecimal num) {
        this.num = num;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public BigDecimal getTax() {
        return tax;
    }

    public void setTax(BigDecimal tax) {
        this.tax = tax;
    }

    public BigDecimal getTax_price() {
        return tax_price;
    }

    public void setTax_price(BigDecimal tax_price) {
        this.tax_price = tax_price;
    }

    public BigDecimal getTax_amount() {
        return tax_amount;
    }

    public void setTax_amount(BigDecimal tax_amount) {
        this.tax_amount = tax_amount;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getStockin_amount() {
        return stockin_amount;
    }

    public void setStockin_amount(BigDecimal stockin_amount) {
        this.stockin_amount = stockin_amount;
    }

    public BigDecimal getStockin_num() {
        return stockin_num;
    }

    public void setStockin_num(BigDecimal stockin_num) {
        this.stockin_num = stockin_num;
    }

    public String getProp1() {
        return prop1;
    }

    public void setProp1(String prop1) {
        this.prop1 = prop1;
    }

    public String getProp2() {
        return prop2;
    }

    public void setProp2(String prop2) {
        this.prop2 = prop2;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getModified() {
        return modified;
    }

    public void setModified(String modified) {
        this.modified = modified;
    }

    @Override
    public String toString() {
        return "WDTPurchaseDetailInfo{" +
                "rec_id=" + rec_id +
                ", purchase_id=" + purchase_id +
                ", spec_no='" + spec_no + '\'' +
                ", num=" + num +
                ", price=" + price +
                ", discount=" + discount +
                ", tax=" + tax +
                ", tax_price=" + tax_price +
                ", tax_amount=" + tax_amount +
                ", amount=" + amount +
                ", stockin_amount=" + stockin_amount +
                ", stockin_num=" + stockin_num +
                ", prop1='" + prop1 + '\'' +
                ", prop2='" + prop2 + '\'' +
                ", remark='" + remark + '\'' +
                ", modified='" + modified + '\'' +
                '}';
    }
}
