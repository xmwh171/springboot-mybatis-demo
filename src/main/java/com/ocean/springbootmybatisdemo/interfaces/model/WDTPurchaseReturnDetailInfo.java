package com.ocean.springbootmybatisdemo.interfaces.model;

import java.math.BigDecimal;

/**
 * @Description
 * @Author xiaohu
 * @Date 2018/10/18 16:44
 */
public class WDTPurchaseReturnDetailInfo {

    /**
     * 采购退货单主键id
     */
    private int return_id;

    /**
     * 供应商货品编号
     */
    private String provider_goods_no;

    /**
     * 商家编码
     */
    private String spec_no;

    /**
     * 货品编码
     */
    private String goods_no;

    /**
     * 	货品名称
     */
    private String goods_name;

    /**
     * 规格名称
     */
    private String spec_name;

    /**
     * 规格码
     */
    private String spec_code;

    /**
     * 退货数量
     */
    private BigDecimal num;

    /**
     * 辅助退货量
     */
    private BigDecimal num2;

    /**
     * 出库单位
     */
    private int unit_id;

    /**
     * 单位变换率
     */
    private BigDecimal unit_ratio;

    /**
     * 基本单位
     */
    private int base_unit_id;

    /**
     * 单价
     */
    private BigDecimal price;

    /**
     * 折扣
     */
    private BigDecimal discount;

    /**
     * 税前金额
     */
    private BigDecimal amount;

    /**
     * 备注
     */
    private String remark;

    public int getReturn_id() {
        return return_id;
    }

    public void setReturn_id(int return_id) {
        this.return_id = return_id;
    }

    public String getProvider_goods_no() {
        return provider_goods_no;
    }

    public void setProvider_goods_no(String provider_goods_no) {
        this.provider_goods_no = provider_goods_no;
    }

    public String getSpec_no() {
        return spec_no;
    }

    public void setSpec_no(String spec_no) {
        this.spec_no = spec_no;
    }

    public String getGoods_no() {
        return goods_no;
    }

    public void setGoods_no(String goods_no) {
        this.goods_no = goods_no;
    }

    public String getGoods_name() {
        return goods_name;
    }

    public void setGoods_name(String goods_name) {
        this.goods_name = goods_name;
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

    public BigDecimal getNum() {
        return num;
    }

    public void setNum(BigDecimal num) {
        this.num = num;
    }

    public BigDecimal getNum2() {
        return num2;
    }

    public void setNum2(BigDecimal num2) {
        this.num2 = num2;
    }

    public int getUnit_id() {
        return unit_id;
    }

    public void setUnit_id(int unit_id) {
        this.unit_id = unit_id;
    }

    public BigDecimal getUnit_ratio() {
        return unit_ratio;
    }

    public void setUnit_ratio(BigDecimal unit_ratio) {
        this.unit_ratio = unit_ratio;
    }

    public int getBase_unit_id() {
        return base_unit_id;
    }

    public void setBase_unit_id(int base_unit_id) {
        this.base_unit_id = base_unit_id;
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

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "WDTPurchaseReturnDetailInfo{" +
                "return_id=" + return_id +
                ", provider_goods_no='" + provider_goods_no + '\'' +
                ", spec_no='" + spec_no + '\'' +
                ", goods_no='" + goods_no + '\'' +
                ", goods_name='" + goods_name + '\'' +
                ", spec_name='" + spec_name + '\'' +
                ", spec_code='" + spec_code + '\'' +
                ", num=" + num +
                ", num2=" + num2 +
                ", unit_id=" + unit_id +
                ", unit_ratio=" + unit_ratio +
                ", base_unit_id=" + base_unit_id +
                ", price=" + price +
                ", discount=" + discount +
                ", amount=" + amount +
                ", remark='" + remark + '\'' +
                '}';
    }
}
