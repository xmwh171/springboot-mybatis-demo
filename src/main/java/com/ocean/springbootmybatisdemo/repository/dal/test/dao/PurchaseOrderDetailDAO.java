package com.ocean.springbootmybatisdemo.repository.dal.test.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.ocean.springbootmybatisdemo.repository.dal.test.dataobject.PurchaseOrderDetailDO;
import com.ocean.springbootmybatisdemo.repository.dal.test.mapper.PurchaseOrderDetailDOMapper;

/**
* The Table purchase_order_detail.
* purchase_order_detail
*/
@Repository
public class PurchaseOrderDetailDAO{

    @Autowired
    private PurchaseOrderDetailDOMapper purchaseOrderDetailDOMapper;

    /**
     * desc:插入表:purchase_order_detail.<br/>
     * @param entity entity
     * @return int
     */
    public int insert(PurchaseOrderDetailDO entity){
        return purchaseOrderDetailDOMapper.insert(entity);
    }
}
