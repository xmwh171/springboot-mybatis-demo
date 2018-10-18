package com.ocean.springbootmybatisdemo.interfaces.model;

import java.math.BigDecimal;
import java.util.List;

/**
 * @Description 采购入库单详情
 * @Author xiaohu
 * @Date 2018/10/18 14:46
 */
public class WDTStockinInfo {

    /**
     * 入库单主键id
     */
    private int stockin_id;

    /**
     * 入库单号
     */
    private String order_no;

    /**
     * 入库单状态
     */
    private byte status;

    /**
     * 仓库编号
     */
    private byte warehouse_no;

    /**
     * 仓库
     */
    private String warehouse_name;

    /**
     * 入库时间
     */
    private String stockin_time;

    /**
     * 审核时间
     */
    private String check_time;

    /**
     * 创建时间
     */
    private String created_time;

    /**
     * 采购单号
     */
    private String src_order_no;

    /**
     * 	备注
     */
    private String remark;

    /**
     * 入库原因
     */
    private String 	stockin_reason;

    /**
     * 入库类型
     */
    private byte order_type;

    /**
     * 货款总额
     */
    private BigDecimal goods_amount;

    /**
     * 总成本
     */
    private BigDecimal total_price;

    /**
     * 优惠
     */
    private BigDecimal discount;

    /**
     * 税后金额
     */
    private BigDecimal tax_amount;

    /**
     * 邮费
     */
    private BigDecimal post_fee;

    /**
     * 其他费用
     */
    private BigDecimal other_fee;

    /**
     * 旺店通系统内物流公司名称
     */
    private String logistics_name;

    /**
     * 	旺店通系统内物流公司编号
     */
    private String logistics_code;

    /**
     * 物流类型
     */
    private BigDecimal logistics_type;

    /**
     * 物流单号
     */
    private String logistics_no;

    /**
     * 采购单编号
     */
    private String purchase_no;

    /**
     * 供应商编号
     */
    private String provider_no;

    /**
     * 供应商名称
     */
    private String provider_name;

    /**
     * 上层单据的采购单号可做该入库单的外部单号
     */
    private String outer_no;

    /**
     * 货品总数量
     */
    private BigDecimal goods_count;

    /**
     * 	调整量，正数或者负数
     */
    private BigDecimal adjust_num;

    /**
     * 纠错金额
     */
    private BigDecimal adjust_price;

    /**
     * 调整后数量
     */
    private String right_nums;

    /**
     * 调整后总金额
     */
    private BigDecimal right_price;

    /**
     * 入库类型名称(extra)
     */
    private String order_type_name;

    /**
     * 成本价
     */
    private BigDecimal cost_price;

    /**
     * 原价
     */
    private BigDecimal src_price;

    /**
     * 税后单价
     */
    private BigDecimal tax_price;

    /**
     * 税率
     */
    private BigDecimal tax;

    /**
     * 总成本
     */
    private BigDecimal total_cost;

    /**
     * 有效期
     */
    private String expire_date;

    /**
     *
     */
    private String right_num;

    /**
     *
     */
    private String right_cost;

    /**
     *
     */
    private String rec_id;

    /**
     *
     */
    private String goods_name;

    /**
     *
     */
    private String goods_no;

    /**
     *
     */
    private String spec_no;

    /**
     *
     */
    private String spec_code;

    /**
     *
     */
    private String spec_name;

    /**
     *
     */
    private String prop2;

    /**
     *
     */
    private String brand_no;

    /**
     *
     */
    private String brand_name;

    /**
     *
     */
    private String goods_unit;

    /**
     *
     */
    private String batch_no;

    /**
     * Sku详情数据节点
     */
    private List<WDTStockinInfo> details_list;

    public int getStockin_id() {
        return stockin_id;
    }

    public void setStockin_id(int stockin_id) {
        this.stockin_id = stockin_id;
    }

    public String getOrder_no() {
        return order_no;
    }

    public void setOrder_no(String order_no) {
        this.order_no = order_no;
    }

    public byte getStatus() {
        return status;
    }

    public void setStatus(byte status) {
        this.status = status;
    }

    public byte getWarehouse_no() {
        return warehouse_no;
    }

    public void setWarehouse_no(byte warehouse_no) {
        this.warehouse_no = warehouse_no;
    }

    public String getWarehouse_name() {
        return warehouse_name;
    }

    public void setWarehouse_name(String warehouse_name) {
        this.warehouse_name = warehouse_name;
    }

    public String getStockin_time() {
        return stockin_time;
    }

    public void setStockin_time(String stockin_time) {
        this.stockin_time = stockin_time;
    }

    public String getCheck_time() {
        return check_time;
    }

    public void setCheck_time(String check_time) {
        this.check_time = check_time;
    }

    public String getCreated_time() {
        return created_time;
    }

    public void setCreated_time(String created_time) {
        this.created_time = created_time;
    }

    public String getSrc_order_no() {
        return src_order_no;
    }

    public void setSrc_order_no(String src_order_no) {
        this.src_order_no = src_order_no;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getStockin_reason() {
        return stockin_reason;
    }

    public void setStockin_reason(String stockin_reason) {
        this.stockin_reason = stockin_reason;
    }

    public byte getOrder_type() {
        return order_type;
    }

    public void setOrder_type(byte order_type) {
        this.order_type = order_type;
    }

    public BigDecimal getGoods_amount() {
        return goods_amount;
    }

    public void setGoods_amount(BigDecimal goods_amount) {
        this.goods_amount = goods_amount;
    }

    public BigDecimal getTotal_price() {
        return total_price;
    }

    public void setTotal_price(BigDecimal total_price) {
        this.total_price = total_price;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public BigDecimal getTax_amount() {
        return tax_amount;
    }

    public void setTax_amount(BigDecimal tax_amount) {
        this.tax_amount = tax_amount;
    }

    public BigDecimal getPost_fee() {
        return post_fee;
    }

    public void setPost_fee(BigDecimal post_fee) {
        this.post_fee = post_fee;
    }

    public BigDecimal getOther_fee() {
        return other_fee;
    }

    public void setOther_fee(BigDecimal other_fee) {
        this.other_fee = other_fee;
    }

    public String getLogistics_name() {
        return logistics_name;
    }

    public void setLogistics_name(String logistics_name) {
        this.logistics_name = logistics_name;
    }

    public String getLogistics_code() {
        return logistics_code;
    }

    public void setLogistics_code(String logistics_code) {
        this.logistics_code = logistics_code;
    }

    public BigDecimal getLogistics_type() {
        return logistics_type;
    }

    public void setLogistics_type(BigDecimal logistics_type) {
        this.logistics_type = logistics_type;
    }

    public String getLogistics_no() {
        return logistics_no;
    }

    public void setLogistics_no(String logistics_no) {
        this.logistics_no = logistics_no;
    }

    public String getPurchase_no() {
        return purchase_no;
    }

    public void setPurchase_no(String purchase_no) {
        this.purchase_no = purchase_no;
    }

    public String getProvider_no() {
        return provider_no;
    }

    public void setProvider_no(String provider_no) {
        this.provider_no = provider_no;
    }

    public String getProvider_name() {
        return provider_name;
    }

    public void setProvider_name(String provider_name) {
        this.provider_name = provider_name;
    }

    public String getOuter_no() {
        return outer_no;
    }

    public void setOuter_no(String outer_no) {
        this.outer_no = outer_no;
    }

    public BigDecimal getGoods_count() {
        return goods_count;
    }

    public void setGoods_count(BigDecimal goods_count) {
        this.goods_count = goods_count;
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

    public String getRight_nums() {
        return right_nums;
    }

    public void setRight_nums(String right_nums) {
        this.right_nums = right_nums;
    }

    public BigDecimal getRight_price() {
        return right_price;
    }

    public void setRight_price(BigDecimal right_price) {
        this.right_price = right_price;
    }

    public String getOrder_type_name() {
        return order_type_name;
    }

    public void setOrder_type_name(String order_type_name) {
        this.order_type_name = order_type_name;
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

    public String getExpire_date() {
        return expire_date;
    }

    public void setExpire_date(String expire_date) {
        this.expire_date = expire_date;
    }

    public String getRight_num() {
        return right_num;
    }

    public void setRight_num(String right_num) {
        this.right_num = right_num;
    }

    public String getRight_cost() {
        return right_cost;
    }

    public void setRight_cost(String right_cost) {
        this.right_cost = right_cost;
    }

    public String getRec_id() {
        return rec_id;
    }

    public void setRec_id(String rec_id) {
        this.rec_id = rec_id;
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

    public String getSpec_no() {
        return spec_no;
    }

    public void setSpec_no(String spec_no) {
        this.spec_no = spec_no;
    }

    public String getSpec_code() {
        return spec_code;
    }

    public void setSpec_code(String spec_code) {
        this.spec_code = spec_code;
    }

    public String getSpec_name() {
        return spec_name;
    }

    public void setSpec_name(String spec_name) {
        this.spec_name = spec_name;
    }

    public String getProp2() {
        return prop2;
    }

    public void setProp2(String prop2) {
        this.prop2 = prop2;
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

    public List<WDTStockinInfo> getDetails_list() {
        return details_list;
    }

    public void setDetails_list(List<WDTStockinInfo> details_list) {
        this.details_list = details_list;
    }

    @Override
    public String toString() {
        return "WDTStockinInfo{" +
                "stockin_id=" + stockin_id +
                ", order_no='" + order_no + '\'' +
                ", status=" + status +
                ", warehouse_no=" + warehouse_no +
                ", warehouse_name='" + warehouse_name + '\'' +
                ", stockin_time='" + stockin_time + '\'' +
                ", check_time='" + check_time + '\'' +
                ", created_time='" + created_time + '\'' +
                ", src_order_no='" + src_order_no + '\'' +
                ", remark='" + remark + '\'' +
                ", stockin_reason='" + stockin_reason + '\'' +
                ", order_type=" + order_type +
                ", goods_amount=" + goods_amount +
                ", total_price=" + total_price +
                ", discount=" + discount +
                ", tax_amount=" + tax_amount +
                ", post_fee=" + post_fee +
                ", other_fee=" + other_fee +
                ", logistics_name='" + logistics_name + '\'' +
                ", logistics_code='" + logistics_code + '\'' +
                ", logistics_type=" + logistics_type +
                ", logistics_no='" + logistics_no + '\'' +
                ", purchase_no='" + purchase_no + '\'' +
                ", provider_no='" + provider_no + '\'' +
                ", provider_name='" + provider_name + '\'' +
                ", outer_no='" + outer_no + '\'' +
                ", goods_count=" + goods_count +
                ", adjust_num=" + adjust_num +
                ", adjust_price=" + adjust_price +
                ", right_nums='" + right_nums + '\'' +
                ", right_price=" + right_price +
                ", order_type_name='" + order_type_name + '\'' +
                ", cost_price=" + cost_price +
                ", src_price=" + src_price +
                ", tax_price=" + tax_price +
                ", tax=" + tax +
                ", total_cost=" + total_cost +
                ", expire_date='" + expire_date + '\'' +
                ", right_num='" + right_num + '\'' +
                ", right_cost='" + right_cost + '\'' +
                ", rec_id='" + rec_id + '\'' +
                ", goods_name='" + goods_name + '\'' +
                ", goods_no='" + goods_no + '\'' +
                ", spec_no='" + spec_no + '\'' +
                ", spec_code='" + spec_code + '\'' +
                ", spec_name='" + spec_name + '\'' +
                ", prop2='" + prop2 + '\'' +
                ", brand_no='" + brand_no + '\'' +
                ", brand_name='" + brand_name + '\'' +
                ", goods_unit='" + goods_unit + '\'' +
                ", batch_no='" + batch_no + '\'' +
                ", details_list=" + details_list +
                '}';
    }
}
