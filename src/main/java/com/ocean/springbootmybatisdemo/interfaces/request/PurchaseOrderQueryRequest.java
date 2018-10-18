package com.ocean.springbootmybatisdemo.interfaces.request;

import java.util.Date;

/**
 * @Description 采购单查询请求
 * @Author xiaohu
 * @Date 2018/10/18 12:57
 */
public class PurchaseOrderQueryRequest {

    /**
     * 采购单号
     */
    private String purchaseNo;

    /**
     * 外部采购单号
     */
    private String outerNo;

    /**
     * 采购单状态：10 已取消,20 编辑中,30 待审核,40 已审核,50 部分到货,60已到货,70 待结算,80 部分结算,90 已完成
     */
    private byte status;

    /**
     * 开始日期，0000-00-00 00:00:00
     */
    private Date startTime;

    /**
     * 结束日期，0000-00-00 00:00:00
     */
    private Date endTime;

    /**
     * 页号,默认0，从0页开始
     */
    private int pageNo;

    /**
     * 分页大小（最大不超过30条，默认返回30条）
     */
    private int pageSize;

    public String getPurchaseNo() {
        return purchaseNo;
    }

    public void setPurchaseNo(String purchaseNo) {
        this.purchaseNo = purchaseNo;
    }

    public String getOuterNo() {
        return outerNo;
    }

    public void setOuterNo(String outerNo) {
        this.outerNo = outerNo;
    }

    public byte getStatus() {
        return status;
    }

    public void setStatus(byte status) {
        this.status = status;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}
