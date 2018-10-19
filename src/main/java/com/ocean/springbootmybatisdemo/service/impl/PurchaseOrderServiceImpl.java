package com.ocean.springbootmybatisdemo.service.impl;

import com.ocean.springbootmybatisdemo.repository.dal.test.dao.PurchaseOrderDAO;
import com.ocean.springbootmybatisdemo.repository.dal.test.dataobject.PurchaseOrderDO;
import com.ocean.springbootmybatisdemo.service.PurchaseOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description
 * @Author xiaohu
 * @Date 2018/10/19 11:04
 */
@Service
public class PurchaseOrderServiceImpl implements PurchaseOrderService{

    @Autowired
    private PurchaseOrderDAO purchaseOrderDAO;

    @Override
    public PurchaseOrderDO batchSave(List<PurchaseOrderDO> list) {
        return purchaseOrderDAO.batchSave(list);
    }
}
