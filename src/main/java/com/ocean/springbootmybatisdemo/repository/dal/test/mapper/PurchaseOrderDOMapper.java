package com.ocean.springbootmybatisdemo.repository.dal.test.mapper;

import com.ocean.springbootmybatisdemo.repository.dal.test.dataobject.PurchaseOrderDO;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 由于需要对分页支持,请直接使用对应的DAO类
 * The Table purchase_order.
 * purchase_order
 */
public interface PurchaseOrderDOMapper{

    /**
     * desc:插入表:purchase_order.<br/>
     * descSql =  SELECT LAST_INSERT_ID() INSERT INTO purchase_order( ID ,PROP1 ,PROP2 ,TELNO ,REMARK ,CONTACT ,OUTER_NO ,PROVIDER_NO ,PURCHASE_NO ,WAREHOUSE_NO ,PROVIDER_NAME ,RECEIVE_ADDRESS ,STATUS ,PURCHASE_ID ,LOGISTICS_TYPE ,CREATED ,MODIFIED ,CHECK_TIME ,GMT_CREATE ,GMT_MODIFY ,EXPECT_ARRIVE_TIME ,POST_FEE ,OTHER_FEE ,GOODS_AMOUNT ,TAX_GOODS_AMOUNT )VALUES( null , #{prop1,jdbcType=VARCHAR} , #{prop2,jdbcType=VARCHAR} , #{telno,jdbcType=VARCHAR} , #{remark,jdbcType=VARCHAR} , #{contact,jdbcType=VARCHAR} , #{outerNo,jdbcType=VARCHAR} , #{providerNo,jdbcType=VARCHAR} , #{purchaseNo,jdbcType=VARCHAR} , #{warehouseNo,jdbcType=VARCHAR} , #{providerName,jdbcType=VARCHAR} , #{receiveAddress,jdbcType=VARCHAR} , #{status,jdbcType=TINYINT} , #{purchaseId,jdbcType=INTEGER} , #{logisticsType,jdbcType=SMALLINT} , #{created,jdbcType=DATE} , #{modified,jdbcType=DATE} , #{checkTime,jdbcType=DATE} , now() , #{gmtModify,jdbcType=TIMESTAMP} , #{expectArriveTime,jdbcType=DATE} , #{postFee,jdbcType=DECIMAL} , #{otherFee,jdbcType=DECIMAL} , #{goodsAmount,jdbcType=DECIMAL} , #{taxGoodsAmount,jdbcType=DECIMAL} )
     * @param entity entity
     * @return int
     */
    int insert(PurchaseOrderDO entity);
    /**
     * desc:insert:purchase_order.<br/>
     * descSql =  INSERT INTO purchase_order( ID ,PROP1 ,PROP2 ,TELNO ,REMARK ,CONTACT ,OUTER_NO ,PROVIDER_NO ,PURCHASE_NO ,WAREHOUSE_NO ,PROVIDER_NAME ,RECEIVE_ADDRESS ,STATUS ,PURCHASE_ID ,LOGISTICS_TYPE ,CREATED ,MODIFIED ,CHECK_TIME ,GMT_CREATE ,GMT_MODIFY ,EXPECT_ARRIVE_TIME ,POST_FEE ,OTHER_FEE ,GOODS_AMOUNT ,TAX_GOODS_AMOUNT) VALUES ( null , #{item.prop1,jdbcType=VARCHAR} , #{item.prop2,jdbcType=VARCHAR} , #{item.telno,jdbcType=VARCHAR} , #{item.remark,jdbcType=VARCHAR} , #{item.contact,jdbcType=VARCHAR} , #{item.outerNo,jdbcType=VARCHAR} , #{item.providerNo,jdbcType=VARCHAR} , #{item.purchaseNo,jdbcType=VARCHAR} , #{item.warehouseNo,jdbcType=VARCHAR} , #{item.providerName,jdbcType=VARCHAR} , #{item.receiveAddress,jdbcType=VARCHAR} , #{item.status,jdbcType=TINYINT} , #{item.purchaseId,jdbcType=INTEGER} , #{item.logisticsType,jdbcType=SMALLINT} , #{item.created,jdbcType=DATE} , #{item.modified,jdbcType=DATE} , #{item.checkTime,jdbcType=DATE} , now() , #{item.gmtModify,jdbcType=TIMESTAMP} , #{item.expectArriveTime,jdbcType=DATE} , #{item.postFee,jdbcType=DECIMAL} , #{item.otherFee,jdbcType=DECIMAL} , #{item.goodsAmount,jdbcType=DECIMAL} , #{item.taxGoodsAmount,jdbcType=DECIMAL}) 
     * @param list list
     * @return PurchaseOrderDO
     */
    PurchaseOrderDO batchSave(List<PurchaseOrderDO> list);
}
