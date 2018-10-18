package com.ocean.springbootmybatisdemo.interfaces.model;

import java.math.BigDecimal;

/**
 * @Description
 * @Author xiaohu
 * @Date 2018/10/18 18:17
 */
public class WDTStockoutOrderReturnDetailInfo {

    /**
     * 出库明细主键id
     */
    private int stockout_id;

    /**
     * 商家编码
     */
    private String spec_no;

    /**
     * 货品数量
     */
    private BigDecimal goods_count;

    /**
     * 销售价
     */
    private BigDecimal sell_price;

    /**
     * 品牌编号
     */
    private String brand_no;

    /**
     * 品牌名称
     */
    private String brand_name;

    /**
     * 	货品名称
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
     * 规格编号
     */
    private String spec_code;

    /**
     * 成本价
     */
    private BigDecimal cost_price;

    /**
     * 总货款
     */
    private BigDecimal total_amount;

    /**
     * 重量
     */
    private BigDecimal weight;

    /**
     * 1销售商品 2原材料 3包装 4周转材料5虚拟商品 0其它
     */
    private int goods_type;

    /**
     * 单位名称
     */
    private String goods_unit;

    /**
     * 批次号
     */
    private String batch_no;

    /**
     * 备注
     */
    private String remark;

    /**
     *
     */
    private String rec_id;

    public String getRec_id() {
        return rec_id;
    }

    public void setRec_id(String rec_id) {
        this.rec_id = rec_id;
    }

    public int getStockout_id() {
        return stockout_id;
    }

    public void setStockout_id(int stockout_id) {
        this.stockout_id = stockout_id;
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

    public BigDecimal getSell_price() {
        return sell_price;
    }

    public void setSell_price(BigDecimal sell_price) {
        this.sell_price = sell_price;
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

    public BigDecimal getCost_price() {
        return cost_price;
    }

    public void setCost_price(BigDecimal cost_price) {
        this.cost_price = cost_price;
    }

    public BigDecimal getTotal_amount() {
        return total_amount;
    }

    public void setTotal_amount(BigDecimal total_amount) {
        this.total_amount = total_amount;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public int getGoods_type() {
        return goods_type;
    }

    public void setGoods_type(int goods_type) {
        this.goods_type = goods_type;
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "WDTStockoutOrderReturnDetailInfo{" +
                "stockout_id=" + stockout_id +
                ", spec_no='" + spec_no + '\'' +
                ", goods_count=" + goods_count +
                ", sell_price=" + sell_price +
                ", brand_no='" + brand_no + '\'' +
                ", brand_name='" + brand_name + '\'' +
                ", goods_name='" + goods_name + '\'' +
                ", goods_no='" + goods_no + '\'' +
                ", spec_name='" + spec_name + '\'' +
                ", spec_code='" + spec_code + '\'' +
                ", cost_price=" + cost_price +
                ", total_amount=" + total_amount +
                ", weight=" + weight +
                ", goods_type=" + goods_type +
                ", goods_unit='" + goods_unit + '\'' +
                ", batch_no='" + batch_no + '\'' +
                ", remark='" + remark + '\'' +
                ", rec_id='" + rec_id + '\'' +
                '}';
    }
}
