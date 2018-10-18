package com.ocean.springbootmybatisdemo;

import com.ocean.springbootmybatisdemo.interfaces.WdtApiIntegration;
import com.ocean.springbootmybatisdemo.interfaces.request.PurchaseOrderQueryRequest;
import com.ocean.springbootmybatisdemo.interfaces.request.PurchaseStockinOrderQueryRequest;
import com.ocean.springbootmybatisdemo.interfaces.result.PurchaseOrderQueryResult;
import com.ocean.springbootmybatisdemo.interfaces.result.PurchaseStockinOrderQueryResult;
import com.ocean.springbootmybatisdemo.util.DateUtils;
import junit.framework.TestCase;

/**
 * @Description
 * @Author xiaohu
 * @Date 2018/10/18 13:34
 */
public class WdtApiTest extends TestCase {

    protected void setUp() throws Exception {
        super.setUp();
    }

    public void testPurchaseOrderQuery(){
        try {
            PurchaseOrderQueryRequest purchaseOrderQueryRequest = new PurchaseOrderQueryRequest();
            String startTime = "2018-10-18 00:00:00";
            String endTime= "2018-10-18 12:00:00";
            purchaseOrderQueryRequest.setStartTime(DateUtils.parseDateNewFormat(startTime));
            purchaseOrderQueryRequest.setEndTime(DateUtils.parseDateNewFormat(endTime));
            purchaseOrderQueryRequest.setPageSize(100); // 最大100
            PurchaseOrderQueryResult purchaseOrderQueryResult = WdtApiIntegration.purchaseOrderQuery(purchaseOrderQueryRequest);
            if(purchaseOrderQueryResult.isSuccess()){
                System.out.println(purchaseOrderQueryResult.getTotal_count());
                System.out.println(purchaseOrderQueryResult.getPurchase_list().size());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void testPurchaseStockinOrderQuery(){
        try {
            PurchaseStockinOrderQueryRequest purchaseStockinOrderQueryRequest = new PurchaseStockinOrderQueryRequest();
            String startTime = "2018-09-19 00:00:00";
            String endTime= "2018-10-18 12:00:00";
            purchaseStockinOrderQueryRequest.setStartTime(DateUtils.parseDateNewFormat(startTime));
            purchaseStockinOrderQueryRequest.setEndTime(DateUtils.parseDateNewFormat(endTime));
            purchaseStockinOrderQueryRequest.setPageSize(100); // 最大100
            PurchaseStockinOrderQueryResult purchaseStockinOrderQueryResult = WdtApiIntegration.purchaseStockinOrderQuery(purchaseStockinOrderQueryRequest);
            if(purchaseStockinOrderQueryResult.isSuccess()){
                System.out.println(purchaseStockinOrderQueryResult.getTotal_count());
                System.out.println(purchaseStockinOrderQueryResult.getStockin_list().size());
                System.out.println(purchaseStockinOrderQueryResult);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
