package com.ocean.springbootmybatisdemo.service;

import com.ocean.springbootmybatisdemo.repository.dal.test.dataobject.PurchaseOrderDO;

import java.util.List;

/**
 * @Description
 * @Author xiaohu
 * @Date 2018/10/19 11:04
 */
public interface PurchaseOrderService {

    /**
     * desc:insert:sub_system_config.<br/>
     * @param list list
     * @return PurchaseOrderDO
     */
    public PurchaseOrderDO batchSave(List<PurchaseOrderDO> list);
}
