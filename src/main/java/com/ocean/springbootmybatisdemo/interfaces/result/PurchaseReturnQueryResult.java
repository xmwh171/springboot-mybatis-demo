package com.ocean.springbootmybatisdemo.interfaces.result;

import com.ocean.springbootmybatisdemo.base.AbstractResultBase;
import com.ocean.springbootmybatisdemo.interfaces.model.WDTPurchaseReturnInfo;

import java.util.List;

/**
 * @Description
 * @Author xiaohu
 * @Date 2018/10/18 16:38
 */
public class PurchaseReturnQueryResult extends AbstractResultBase {

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
     * 采购退货单数据节点
     */
    private List<WDTPurchaseReturnInfo> purchase_list;

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

    public List<WDTPurchaseReturnInfo> getPurchase_list() {
        return purchase_list;
    }

    public void setPurchase_list(List<WDTPurchaseReturnInfo> purchase_list) {
        this.purchase_list = purchase_list;
    }

    @Override
    public String toString() {
        return "PurchaseReturnQueryResult{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", total_count=" + total_count +
                ", purchase_list=" + purchase_list +
                '}';
    }
}
