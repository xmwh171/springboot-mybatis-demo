package com.ocean.springbootmybatisdemo.interfaces.result;

import com.ocean.springbootmybatisdemo.base.AbstractResultBase;
import com.ocean.springbootmybatisdemo.interfaces.model.WDTStockinInfo;

import java.util.List;

/**
 * @Description
 * @Author xiaohu
 * @Date 2018/10/18 14:44
 */
public class PurchaseStockinOrderQueryResult extends AbstractResultBase {

    /**
     * 错误码，0成功
     */
    private int code;

    /**
     * 错误描述
     */
    private String message;

    /**
     * 符合条件的数据条数，用来分页 当page_no=0时返回
     */
    private int total_count;

    /**
     * 入库单详情数据节点
     */
    private List<WDTStockinInfo> stockin_list;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getTotal_count() {
        return total_count;
    }

    public void setTotal_count(int total_count) {
        this.total_count = total_count;
    }

    public List<WDTStockinInfo> getStockin_list() {
        return stockin_list;
    }

    public void setStockin_list(List<WDTStockinInfo> stockin_list) {
        this.stockin_list = stockin_list;
    }

    @Override
    public String toString() {
        return "PurchaseStockinOrderQueryResult{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", total_count=" + total_count +
                ", stockin_list=" + stockin_list +
                '}';
    }
}
