package com.ocean.springbootmybatisdemo.interfaces.request;

import java.util.Date;

/**
 * @Description 采购退货出库单查询请求
 * @Author xiaohu
 * @Date 2018/10/18 17:49
 */
public class StockoutOrderReturnQueryRequest {

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
