package com.ocean.springbootmybatisdemo.repository.dal.test.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.ocean.springbootmybatisdemo.repository.dal.test.dataobject.PurchaseOrderDO;
import java.util.List;
import com.ocean.springbootmybatisdemo.repository.dal.test.mapper.PurchaseOrderDOMapper;

/**
* The Table purchase_order.
* purchase_order
*/
@Repository
public class PurchaseOrderDAO{

    @Autowired
    private PurchaseOrderDOMapper purchaseOrderDOMapper;

    /**
     * desc:插入表:purchase_order.<br/>
     * @param entity entity
     * @return int
     */
    public int insert(PurchaseOrderDO entity){
        return purchaseOrderDOMapper.insert(entity);
    }
    /**
     * desc:insert:purchase_order.<br/>
     * @param list list
     * @return PurchaseOrderDO
     */
    public PurchaseOrderDO batchSave(List<PurchaseOrderDO> list){
        return purchaseOrderDOMapper.batchSave(list);
    }
}
