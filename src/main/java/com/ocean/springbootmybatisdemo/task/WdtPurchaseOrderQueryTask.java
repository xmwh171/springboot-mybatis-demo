package com.ocean.springbootmybatisdemo.task;

import com.ocean.springbootmybatisdemo.repository.dal.test.dataobject.PurchaseOrderDO;
import com.ocean.springbootmybatisdemo.service.PurchaseOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Description
 * @Author xiaohu
 * @Date 2018/10/19 10:07
 */
@Component
@EnableScheduling
public class WdtPurchaseOrderQueryTask {

    @Autowired
    private PurchaseOrderService purchaseOrderService;

    @Scheduled(cron = "0 0/1 * * * ?")
    public void execute() {

        List<PurchaseOrderDO> list = new ArrayList<>();
        PurchaseOrderDO purchaseOrderDO = new PurchaseOrderDO();
        purchaseOrderDO.setProp1("2");
        purchaseOrderDO.setGmtModify(new Date());
        list.add(purchaseOrderDO);
        PurchaseOrderDO purchaseOrderDO2 = new PurchaseOrderDO();
        purchaseOrderDO.setProp1("3");
        purchaseOrderDO2.setGmtModify(new Date());
        list.add(purchaseOrderDO2);
        purchaseOrderService.batchSave(list);
    }

}
