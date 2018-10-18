package com.ocean.springbootmybatisdemo.interfaces.result;

import com.ocean.springbootmybatisdemo.base.AbstractResultBase;
import com.ocean.springbootmybatisdemo.interfaces.model.WDTStockoutOrderReturnInfo;

import java.util.List;

/**
 * @Description
 * @Author xiaohu
 * @Date 2018/10/18 17:51
 */
public class StockoutOrderReturnQueryResult extends AbstractResultBase{

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
     * 出库单详情数据节点
     */
    private List<WDTStockoutOrderReturnInfo> stockout_list;

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

    public List<WDTStockoutOrderReturnInfo> getStockout_list() {
        return stockout_list;
    }

    public void setStockout_list(List<WDTStockoutOrderReturnInfo> stockout_list) {
        this.stockout_list = stockout_list;
    }

    @Override
    public String toString() {
        return "StockoutOrderReturnQueryResult{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", total_count=" + total_count +
                ", stockout_list=" + stockout_list +
                '}';
    }
}
