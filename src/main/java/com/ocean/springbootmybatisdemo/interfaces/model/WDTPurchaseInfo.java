package com.ocean.springbootmybatisdemo.interfaces.model;

import java.math.BigDecimal;
import java.util.List;

/**
 * @Description
 * @Author xiaohu
 * @Date 2018/10/18 13:04
 */
public class WDTPurchaseInfo {

    /**
     * 采购单id，采购单表主键
     */
    private int purchase_id;

    /**
     * 采购单号
     */
    private String purchase_no;

    /**
     * 仓库编号
     */
    private String warehouse_no;

    /**
     * 外部采购单号
     */
    private String outer_no;

    /**
     * 	采购单状态：10 已取消,20 编辑中,30 待审核,40 已审核,50 部分到货,60已到货,70 待结算,80 部分结算,90 已完成
     */
    private byte status;

    /**
     * 供应商编号
     */
    private String provider_no;

    /**
     * 供应商名称
     */
    private String provider_name;

    /**
     * 货运方式
     */
    private String logistics_type;

    /**
     * 联系人
     */
    private String contact;

    /**
     * 电话
     */
    private String telno;

    /**
     * 收货地址
     */
    private String receive_address;

    /**
     * 审核时间
     */
    private String check_time;

    /**
     * 货款
     */
    private BigDecimal goods_amount;

    /**
     * 邮资
     */
    private BigDecimal post_fee;

    /**
     * 其他费用
     */
    private BigDecimal other_fee;

    /**
     * 税后货品总金额
     */
    private BigDecimal tax_goods_amount;

    /**
     * 备注
     */
    private String remark;

    /**
     * 最后修改时间
     */
    private String modified;

    /**
     * 预计到货时间
     */
    private String expect_arrive_time;

    /**
     * 自定义属性1
     */
    private String prop1;

    /**
     * 	自定义属性2
     */
    private String prop2;

    /**
     * 创建时间
     */
    private String created;

    /**
     * Sku详情节点
     */
    private List<WDTPurchaseDetailInfo> details_list;

    public int getPurchase_id() {
        return purchase_id;
    }

    public void setPurchase_id(int purchase_id) {
        this.purchase_id = purchase_id;
    }

    public String getPurchase_no() {
        return purchase_no;
    }

    public void setPurchase_no(String purchase_no) {
        this.purchase_no = purchase_no;
    }

    public String getWarehouse_no() {
        return warehouse_no;
    }

    public void setWarehouse_no(String warehouse_no) {
        this.warehouse_no = warehouse_no;
    }

    public String getOuter_no() {
        return outer_no;
    }

    public void setOuter_no(String outer_no) {
        this.outer_no = outer_no;
    }

    public byte getStatus() {
        return status;
    }

    public void setStatus(byte status) {
        this.status = status;
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

    public String getLogistics_type() {
        return logistics_type;
    }

    public void setLogistics_type(String logistics_type) {
        this.logistics_type = logistics_type;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getTelno() {
        return telno;
    }

    public void setTelno(String telno) {
        this.telno = telno;
    }

    public String getReceive_address() {
        return receive_address;
    }

    public void setReceive_address(String receive_address) {
        this.receive_address = receive_address;
    }

    public String getCheck_time() {
        return check_time;
    }

    public void setCheck_time(String check_time) {
        this.check_time = check_time;
    }

    public BigDecimal getGoods_amount() {
        return goods_amount;
    }

    public void setGoods_amount(BigDecimal goods_amount) {
        this.goods_amount = goods_amount;
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

    public BigDecimal getTax_goods_amount() {
        return tax_goods_amount;
    }

    public void setTax_goods_amount(BigDecimal tax_goods_amount) {
        this.tax_goods_amount = tax_goods_amount;
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

    public String getExpect_arrive_time() {
        return expect_arrive_time;
    }

    public void setExpect_arrive_time(String expect_arrive_time) {
        this.expect_arrive_time = expect_arrive_time;
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

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public List<WDTPurchaseDetailInfo> getDetails_list() {
        return details_list;
    }

    public void setDetails_list(List<WDTPurchaseDetailInfo> details_list) {
        this.details_list = details_list;
    }

    @Override
    public String toString() {
        return "WDTPurchaseInfo{" +
                "purchase_id=" + purchase_id +
                ", purchase_no='" + purchase_no + '\'' +
                ", warehouse_no='" + warehouse_no + '\'' +
                ", outer_no='" + outer_no + '\'' +
                ", status=" + status +
                ", provider_no='" + provider_no + '\'' +
                ", provider_name='" + provider_name + '\'' +
                ", logistics_type='" + logistics_type + '\'' +
                ", contact='" + contact + '\'' +
                ", telno='" + telno + '\'' +
                ", receive_address='" + receive_address + '\'' +
                ", check_time='" + check_time + '\'' +
                ", goods_amount=" + goods_amount +
                ", post_fee=" + post_fee +
                ", other_fee=" + other_fee +
                ", tax_goods_amount=" + tax_goods_amount +
                ", remark='" + remark + '\'' +
                ", modified='" + modified + '\'' +
                ", expect_arrive_time='" + expect_arrive_time + '\'' +
                ", prop1='" + prop1 + '\'' +
                ", prop2='" + prop2 + '\'' +
                ", created='" + created + '\'' +
                ", details_list=" + details_list +
                '}';
    }
}
