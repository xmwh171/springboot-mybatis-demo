package com.ocean.springbootmybatisdemo.interfaces.request;

import java.util.Date;

/**
 * @Description 采购入库单查询
 * @Author xiaohu
 * @Date 2018/10/18 14:40
 */
public class PurchaseStockinOrderQueryRequest {

    /**
     * 开始日期，0000-00-00 00:00:00,最后更新时间
     */
    private Date startTime;

    /**
     * 结束日期，0000-00-00 00:00:00，最后更新时间
     */
    private Date endTime;

    /**
     * 入库单状态 10已取消30待审核60待结算80已完成（默认80）
     */
    private byte status;

    /**
     * 页号,默认0，从0页开始
     */
    private int pageNo;

    /**
     * 分页大小（最大不超过30条，默认返回30条）
     */
    private int pageSize;

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

    public byte getStatus() {
        return status;
    }

    public void setStatus(byte status) {
        this.status = status;
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
