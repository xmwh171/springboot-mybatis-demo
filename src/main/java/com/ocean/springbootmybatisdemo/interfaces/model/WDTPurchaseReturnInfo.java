package com.ocean.springbootmybatisdemo.interfaces.model;

import java.math.BigDecimal;
import java.util.List;

/**
 * @Description
 * @Author xiaohu
 * @Date 2018/10/18 16:39
 */
public class WDTPurchaseReturnInfo {

    /**
     * 采购退货单主键id
     */
    private int return_id;

    /**
     * 退货单号
     */
    private String return_no;

    /**
     * 供应商
     */
    private String provider_name;

    /**
     * 	采购退货单状态：10,已取消,20,编辑中,30,待审核,40,已审核,42,待推送,44,推送失败,46,委外待出库,50,部分出库,60,已完成
     */
    private byte status;

    /**
     * 仓库
     */
    private String warehouse_name;

    /**
     * 物流类型
     */
    private short logistics_type;

    /**
     * 其它费用
     */
    private BigDecimal other_fee;

    /**
     * 邮费
     */
    private BigDecimal post_fee;

    /**
     * 总货款
     */
    private BigDecimal goods_fee;

    /**
     * 退货开单量
     */
    private BigDecimal goods_count;

    /**
     * 货品种类数
     */
    private int goods_type_count;

    /**
     * 退货出库量
     */
    private BigDecimal goods_out_count;

    /**
     * 备注
     */
    private String remark;

    /**
     * 建单时间
     */
    private String created;

    /**
     * 最后修改时间
     */
    private String modified;

    /**
     * 外部接口单号
     */
    private String api_outer_no;

    /**
     * 采购退货单详情数据节点
     */
    private List<WDTPurchaseReturnDetailInfo> detail_list;

    public int getReturn_id() {
        return return_id;
    }

    public void setReturn_id(int return_id) {
        this.return_id = return_id;
    }

    public String getReturn_no() {
        return return_no;
    }

    public void setReturn_no(String return_no) {
        this.return_no = return_no;
    }

    public String getProvider_name() {
        return provider_name;
    }

    public void setProvider_name(String provider_name) {
        this.provider_name = provider_name;
    }

    public byte getStatus() {
        return status;
    }

    public void setStatus(byte status) {
        this.status = status;
    }

    public String getWarehouse_name() {
        return warehouse_name;
    }

    public void setWarehouse_name(String warehouse_name) {
        this.warehouse_name = warehouse_name;
    }

    public short getLogistics_type() {
        return logistics_type;
    }

    public void setLogistics_type(short logistics_type) {
        this.logistics_type = logistics_type;
    }

    public BigDecimal getOther_fee() {
        return other_fee;
    }

    public void setOther_fee(BigDecimal other_fee) {
        this.other_fee = other_fee;
    }

    public BigDecimal getPost_fee() {
        return post_fee;
    }

    public void setPost_fee(BigDecimal post_fee) {
        this.post_fee = post_fee;
    }

    public BigDecimal getGoods_fee() {
        return goods_fee;
    }

    public void setGoods_fee(BigDecimal goods_fee) {
        this.goods_fee = goods_fee;
    }

    public BigDecimal getGoods_count() {
        return goods_count;
    }

    public void setGoods_count(BigDecimal goods_count) {
        this.goods_count = goods_count;
    }

    public int getGoods_type_count() {
        return goods_type_count;
    }

    public void setGoods_type_count(int goods_type_count) {
        this.goods_type_count = goods_type_count;
    }

    public BigDecimal getGoods_out_count() {
        return goods_out_count;
    }

    public void setGoods_out_count(BigDecimal goods_out_count) {
        this.goods_out_count = goods_out_count;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getModified() {
        return modified;
    }

    public void setModified(String modified) {
        this.modified = modified;
    }

    public String getApi_outer_no() {
        return api_outer_no;
    }

    public void setApi_outer_no(String api_outer_no) {
        this.api_outer_no = api_outer_no;
    }

    public List<WDTPurchaseReturnDetailInfo> getDetail_list() {
        return detail_list;
    }

    public void setDetail_list(List<WDTPurchaseReturnDetailInfo> detail_list) {
        this.detail_list = detail_list;
    }

    @Override
    public String toString() {
        return "WDTPurchaseReturnInfo{" +
                "return_id=" + return_id +
                ", return_no='" + return_no + '\'' +
                ", provider_name='" + provider_name + '\'' +
                ", status=" + status +
                ", warehouse_name='" + warehouse_name + '\'' +
                ", logistics_type=" + logistics_type +
                ", other_fee=" + other_fee +
                ", post_fee=" + post_fee +
                ", goods_fee=" + goods_fee +
                ", goods_count=" + goods_count +
                ", goods_type_count=" + goods_type_count +
                ", goods_out_count=" + goods_out_count +
                ", remark='" + remark + '\'' +
                ", created='" + created + '\'' +
                ", modified='" + modified + '\'' +
                ", api_outer_no='" + api_outer_no + '\'' +
                ", detail_list=" + detail_list +
                '}';
    }
}
