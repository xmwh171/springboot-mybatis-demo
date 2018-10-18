package com.ocean.springbootmybatisdemo.interfaces.model;

import java.math.BigDecimal;
import java.util.List;

/**
 * @Description
 * @Author xiaohu
 * @Date 2018/10/18 17:56
 */
public class WDTStockoutOrderReturnInfo {

    /**
     * 出库单主键id
     */
    private int stockout_id;

    /**
     * 出库单号
     */
    private String order_no;

    /**
     * 该源单号为退货单号
     */
    private String src_order_no;

    /**
     * 仓库编号
     */
    private String warehouse_no;

    /**
     * 出库状态
     */
    private int status;

    /**
     * 出库时间
     */
    private String consign_time;

    /**
     * 	源单据类别 1销售订单, 2调拨出库, 3采购退货出库, 4盘亏出库, 5生产出库, 6现款销售出库, 7其他出库,
     * 	8多发出库, 9纠错出库,10保修配件出库, 11初始化出库, 12jit拣货出库 13委外出库
     */
    private int order_type;

    /**
     * 源单据类型名称
     */
    private String order_type_name;

    /**
     * 出库子类型
     */
    private String subtype;

    /**
     * 货品数量
     */
    private BigDecimal goods_count;

    /**
     * 货品总售价
     */
    private BigDecimal goods_total_amount;

    /**
     * 货品总成本
     */
    private BigDecimal goods_total_cost;

    /**
     * 邮费
     */
    private BigDecimal post_fee;

    /**
     * 物流编号
     */
    private String logistics_no;

    /**
     * 包装费
     */
    private BigDecimal package_fee;

    /**
     * 收件人(该字段已废弃)
     */
    private String receiver_name;

    /**
     * 国家
     */
    private int receiver_country;

    /**
     * 省份
     */
    private int receiver_province;

    /**
     * 城市
     */
    private int receiver_city;

    /**
     * 地区
     */
    private int receiver_district;

    /**
     * 详细地址(该字段已废弃)
     */
    private String receiver_address;

    /**
     * 收件人移动电话(该字段已废弃)
     */
    private String receiver_mobile;

    /**
     * 收件人固定电话(该字段已废弃)
     */
    private String receiver_telno;

    /**
     * 邮编
     */
    private String receiver_zip;

    /**
     * 重量
     */
    private BigDecimal weight;

    /**
     * 备注
     */
    private String remark;

    /**
     * 出库原因
     */
    private String stockout_reason;

    /**
     * 外部单号
     */
    private String outer_no;

    /**
     * 操作人
     */
    private String operator_name;

    /**
     * 省市区空格分开
     */
    private String receiver_area;

    /**
     * 采购退货单号
     */
    private String return_no;

    /**
     * 供应商编号
     */
    private String provider_no;

    /**
     * 供应商名称
     */
    private String provider_name;

    /**
     * 这张出库单的最新更新时间
     */
    private String modified;

    /**
     * 采购退货单的外部单号
     */
    private String pr_api_outer_no;

    /**
     * 最后引用采购单号
     */
    private String last_load_purchase_no;

    /**
     * Sku详情节点
     */
    private List<WDTStockoutOrderReturnDetailInfo> details_list;

    public int getStockout_id() {
        return stockout_id;
    }

    public void setStockout_id(int stockout_id) {
        this.stockout_id = stockout_id;
    }

    public String getOrder_no() {
        return order_no;
    }

    public void setOrder_no(String order_no) {
        this.order_no = order_no;
    }

    public String getSrc_order_no() {
        return src_order_no;
    }

    public void setSrc_order_no(String src_order_no) {
        this.src_order_no = src_order_no;
    }

    public String getWarehouse_no() {
        return warehouse_no;
    }

    public void setWarehouse_no(String warehouse_no) {
        this.warehouse_no = warehouse_no;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getConsign_time() {
        return consign_time;
    }

    public void setConsign_time(String consign_time) {
        this.consign_time = consign_time;
    }

    public int getOrder_type() {
        return order_type;
    }

    public void setOrder_type(int order_type) {
        this.order_type = order_type;
    }

    public String getOrder_type_name() {
        return order_type_name;
    }

    public void setOrder_type_name(String order_type_name) {
        this.order_type_name = order_type_name;
    }

    public String getSubtype() {
        return subtype;
    }

    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }

    public BigDecimal getGoods_count() {
        return goods_count;
    }

    public void setGoods_count(BigDecimal goods_count) {
        this.goods_count = goods_count;
    }

    public BigDecimal getGoods_total_amount() {
        return goods_total_amount;
    }

    public void setGoods_total_amount(BigDecimal goods_total_amount) {
        this.goods_total_amount = goods_total_amount;
    }

    public BigDecimal getGoods_total_cost() {
        return goods_total_cost;
    }

    public void setGoods_total_cost(BigDecimal goods_total_cost) {
        this.goods_total_cost = goods_total_cost;
    }

    public BigDecimal getPost_fee() {
        return post_fee;
    }

    public void setPost_fee(BigDecimal post_fee) {
        this.post_fee = post_fee;
    }

    public String getLogistics_no() {
        return logistics_no;
    }

    public void setLogistics_no(String logistics_no) {
        this.logistics_no = logistics_no;
    }

    public BigDecimal getPackage_fee() {
        return package_fee;
    }

    public void setPackage_fee(BigDecimal package_fee) {
        this.package_fee = package_fee;
    }

    public String getReceiver_name() {
        return receiver_name;
    }

    public void setReceiver_name(String receiver_name) {
        this.receiver_name = receiver_name;
    }

    public int getReceiver_country() {
        return receiver_country;
    }

    public void setReceiver_country(int receiver_country) {
        this.receiver_country = receiver_country;
    }

    public int getReceiver_province() {
        return receiver_province;
    }

    public void setReceiver_province(int receiver_province) {
        this.receiver_province = receiver_province;
    }

    public int getReceiver_city() {
        return receiver_city;
    }

    public void setReceiver_city(int receiver_city) {
        this.receiver_city = receiver_city;
    }

    public int getReceiver_district() {
        return receiver_district;
    }

    public void setReceiver_district(int receiver_district) {
        this.receiver_district = receiver_district;
    }

    public String getReceiver_address() {
        return receiver_address;
    }

    public void setReceiver_address(String receiver_address) {
        this.receiver_address = receiver_address;
    }

    public String getReceiver_mobile() {
        return receiver_mobile;
    }

    public void setReceiver_mobile(String receiver_mobile) {
        this.receiver_mobile = receiver_mobile;
    }

    public String getReceiver_telno() {
        return receiver_telno;
    }

    public void setReceiver_telno(String receiver_telno) {
        this.receiver_telno = receiver_telno;
    }

    public String getReceiver_zip() {
        return receiver_zip;
    }

    public void setReceiver_zip(String receiver_zip) {
        this.receiver_zip = receiver_zip;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getStockout_reason() {
        return stockout_reason;
    }

    public void setStockout_reason(String stockout_reason) {
        this.stockout_reason = stockout_reason;
    }

    public String getOuter_no() {
        return outer_no;
    }

    public void setOuter_no(String outer_no) {
        this.outer_no = outer_no;
    }

    public String getOperator_name() {
        return operator_name;
    }

    public void setOperator_name(String operator_name) {
        this.operator_name = operator_name;
    }

    public String getReceiver_area() {
        return receiver_area;
    }

    public void setReceiver_area(String receiver_area) {
        this.receiver_area = receiver_area;
    }

    public String getReturn_no() {
        return return_no;
    }

    public void setReturn_no(String return_no) {
        this.return_no = return_no;
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

    public String getModified() {
        return modified;
    }

    public void setModified(String modified) {
        this.modified = modified;
    }

    public String getPr_api_outer_no() {
        return pr_api_outer_no;
    }

    public void setPr_api_outer_no(String pr_api_outer_no) {
        this.pr_api_outer_no = pr_api_outer_no;
    }

    public String getLast_load_purchase_no() {
        return last_load_purchase_no;
    }

    public void setLast_load_purchase_no(String last_load_purchase_no) {
        this.last_load_purchase_no = last_load_purchase_no;
    }

    public List<WDTStockoutOrderReturnDetailInfo> getDetails_list() {
        return details_list;
    }

    public void setDetails_list(List<WDTStockoutOrderReturnDetailInfo> details_list) {
        this.details_list = details_list;
    }

    @Override
    public String toString() {
        return "WDTStockoutOrderReturnInfo{" +
                "stockout_id=" + stockout_id +
                ", order_no='" + order_no + '\'' +
                ", src_order_no='" + src_order_no + '\'' +
                ", warehouse_no='" + warehouse_no + '\'' +
                ", status=" + status +
                ", consign_time='" + consign_time + '\'' +
                ", order_type=" + order_type +
                ", order_type_name='" + order_type_name + '\'' +
                ", subtype='" + subtype + '\'' +
                ", goods_count=" + goods_count +
                ", goods_total_amount=" + goods_total_amount +
                ", goods_total_cost=" + goods_total_cost +
                ", post_fee=" + post_fee +
                ", logistics_no='" + logistics_no + '\'' +
                ", package_fee=" + package_fee +
                ", receiver_name='" + receiver_name + '\'' +
                ", receiver_country=" + receiver_country +
                ", receiver_province=" + receiver_province +
                ", receiver_city=" + receiver_city +
                ", receiver_district=" + receiver_district +
                ", receiver_address='" + receiver_address + '\'' +
                ", receiver_mobile='" + receiver_mobile + '\'' +
                ", receiver_telno='" + receiver_telno + '\'' +
                ", receiver_zip='" + receiver_zip + '\'' +
                ", weight=" + weight +
                ", remark='" + remark + '\'' +
                ", stockout_reason='" + stockout_reason + '\'' +
                ", outer_no='" + outer_no + '\'' +
                ", operator_name='" + operator_name + '\'' +
                ", receiver_area='" + receiver_area + '\'' +
                ", return_no='" + return_no + '\'' +
                ", provider_no='" + provider_no + '\'' +
                ", provider_name='" + provider_name + '\'' +
                ", modified='" + modified + '\'' +
                ", pr_api_outer_no='" + pr_api_outer_no + '\'' +
                ", last_load_purchase_no='" + last_load_purchase_no + '\'' +
                ", details_list=" + details_list +
                '}';
    }
}
