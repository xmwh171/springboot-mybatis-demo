package com.ocean.springbootmybatisdemo.interfaces.model;

import java.math.BigDecimal;

/**
 * @Description
 * @Author xiaohu
 * @Date 2018/10/18 15:11
 */
public class WDTStockinDetailInfo {

    /**
     * 入库单主键id
     */
    private int stockin_id;

    /**
     * 入库明细主键
     */
    private int rec_id;

    /**
     * 商家编码
     */
    private String spec_no;

    /**
     * 货品数量
     */
    private BigDecimal goods_count;

    /**
     * 优惠金额
     */
    private BigDecimal discount;

    /**
     * 单价
     */
    private BigDecimal cost_price;

    /**
     * 原价
     */
    private BigDecimal src_price;

    /**
     * 税后价
     */
    private BigDecimal tax_price;

    /**
     * 税后金额
     */
    private BigDecimal tax_amount;

    /**
     * 税率
     */
    private BigDecimal tax;

    /**
     * 总成本
     */
    private BigDecimal total_cost;

    /**
     * 备注
     */
    private String remark;

    /**
     * 调整量，正数或者负数
     */
    private BigDecimal adjust_num;

    /**
     * 纠错金额
     */
    private BigDecimal adjust_price;

    /**
     * 调整后数量
     */
    private BigDecimal right_num;

    /**
     * 调整后单价
     */
    private BigDecimal right_price;

    /**
     * 	调整后总金额
     */
    private BigDecimal right_cost;

    /**
     * 品牌编号
     */
    private String brand_no;

    /**
     * 品牌名称
     */
    private String brand_name;

    /**
     * 货品名称
     */
    private String goods_name;

    /**
     * 货品编号
     */
    private String goods_no;

    /**
     * 规格名称
     */
    private String spec_name;

    /**
     * 规格码
     */
    private String spec_code;

    /**
     * 自定义属性
     */
    private String prop2;

    /**
     * 单位名称
     */
    private String goods_unit;

    /**
     * 	批次号
     */
    private String batch_no;

    public int getStockin_id() {
        return stockin_id;
    }

    public void setStockin_id(int stockin_id) {
        this.stockin_id = stockin_id;
    }

    public int getRec_id() {
        return rec_id;
    }

    public void setRec_id(int rec_id) {
        this.rec_id = rec_id;
    }

    public String getSpec_no() {
        return spec_no;
    }

    public void setSpec_no(String spec_no) {
        this.spec_no = spec_no;
    }

    public BigDecimal getGoods_count() {
        return goods_count;
    }

    public void setGoods_count(BigDecimal goods_count) {
        this.goods_count = goods_count;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public BigDecimal getCost_price() {
        return cost_price;
    }

    public void setCost_price(BigDecimal cost_price) {
        this.cost_price = cost_price;
    }

    public BigDecimal getSrc_price() {
        return src_price;
    }

    public void setSrc_price(BigDecimal src_price) {
        this.src_price = src_price;
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

    public BigDecimal getTax() {
        return tax;
    }

    public void setTax(BigDecimal tax) {
        this.tax = tax;
    }

    public BigDecimal getTotal_cost() {
        return total_cost;
    }

    public void setTotal_cost(BigDecimal total_cost) {
        this.total_cost = total_cost;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public BigDecimal getAdjust_num() {
        return adjust_num;
    }

    public void setAdjust_num(BigDecimal adjust_num) {
        this.adjust_num = adjust_num;
    }

    public BigDecimal getAdjust_price() {
        return adjust_price;
    }

    public void setAdjust_price(BigDecimal adjust_price) {
        this.adjust_price = adjust_price;
    }

    public BigDecimal getRight_num() {
        return right_num;
    }

    public void setRight_num(BigDecimal right_num) {
        this.right_num = right_num;
    }

    public BigDecimal getRight_price() {
        return right_price;
    }

    public void setRight_price(BigDecimal right_price) {
        this.right_price = right_price;
    }

    public BigDecimal getRight_cost() {
        return right_cost;
    }

    public void setRight_cost(BigDecimal right_cost) {
        this.right_cost = right_cost;
    }

    public String getBrand_no() {
        return brand_no;
    }

    public void setBrand_no(String brand_no) {
        this.brand_no = brand_no;
    }

    public String getBrand_name() {
        return brand_name;
    }

    public void setBrand_name(String brand_name) {
        this.brand_name = brand_name;
    }

    public String getGoods_name() {
        return goods_name;
    }

    public void setGoods_name(String goods_name) {
        this.goods_name = goods_name;
    }

    public String getGoods_no() {
        return goods_no;
    }

    public void setGoods_no(String goods_no) {
        this.goods_no = goods_no;
    }

    public String getSpec_name() {
        return spec_name;
    }

    public void setSpec_name(String spec_name) {
        this.spec_name = spec_name;
    }

    public String getSpec_code() {
        return spec_code;
    }

    public void setSpec_code(String spec_code) {
        this.spec_code = spec_code;
    }

    public String getProp2() {
        return prop2;
    }

    public void setProp2(String prop2) {
        this.prop2 = prop2;
    }

    public String getGoods_unit() {
        return goods_unit;
    }

    public void setGoods_unit(String goods_unit) {
        this.goods_unit = goods_unit;
    }

    public String getBatch_no() {
        return batch_no;
    }

    public void setBatch_no(String batch_no) {
        this.batch_no = batch_no;
    }

    @Override
    public String toString() {
        return "WDTStockinDetailInfo{" +
                "stockin_id=" + stockin_id +
                ", rec_id=" + rec_id +
                ", spec_no='" + spec_no + '\'' +
                ", goods_count=" + goods_count +
                ", discount=" + discount +
                ", cost_price=" + cost_price +
                ", src_price=" + src_price +
                ", tax_price=" + tax_price +
                ", tax_amount=" + tax_amount +
                ", tax=" + tax +
                ", total_cost=" + total_cost +
                ", remark='" + remark + '\'' +
                ", adjust_num=" + adjust_num +
                ", adjust_price=" + adjust_price +
                ", right_num=" + right_num +
                ", right_price=" + right_price +
                ", right_cost=" + right_cost +
                ", brand_no='" + brand_no + '\'' +
                ", brand_name='" + brand_name + '\'' +
                ", goods_name='" + goods_name + '\'' +
                ", goods_no='" + goods_no + '\'' +
                ", spec_name='" + spec_name + '\'' +
                ", spec_code='" + spec_code + '\'' +
                ", prop2='" + prop2 + '\'' +
                ", goods_unit='" + goods_unit + '\'' +
                ", batch_no='" + batch_no + '\'' +
                '}';
    }
}
