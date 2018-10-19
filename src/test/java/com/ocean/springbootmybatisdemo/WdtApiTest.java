package com.ocean.springbootmybatisdemo;

import com.ocean.springbootmybatisdemo.interfaces.WdtApiIntegration;
import com.ocean.springbootmybatisdemo.interfaces.request.PurchaseOrderQueryRequest;
import com.ocean.springbootmybatisdemo.interfaces.request.PurchaseReturnQueryRequest;
import com.ocean.springbootmybatisdemo.interfaces.request.PurchaseStockinOrderQueryRequest;
import com.ocean.springbootmybatisdemo.interfaces.request.StockoutOrderReturnQueryRequest;
import com.ocean.springbootmybatisdemo.interfaces.result.PurchaseOrderQueryResult;
import com.ocean.springbootmybatisdemo.interfaces.result.PurchaseReturnQueryResult;
import com.ocean.springbootmybatisdemo.interfaces.result.PurchaseStockinOrderQueryResult;
import com.ocean.springbootmybatisdemo.interfaces.result.StockoutOrderReturnQueryResult;
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
            String startTime = "2017-02-01 00:00:00";
            String endTime= "2018-10-19 12:00:00";
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


    public void testPurchaseReturnQuery(){
        try {
            PurchaseReturnQueryRequest purchaseReturnQueryRequest = new PurchaseReturnQueryRequest();
            String startTime = "2018-09-19 00:00:00";
            String endTime= "2018-10-18 12:00:00";
            purchaseReturnQueryRequest.setStartTime(DateUtils.parseDateNewFormat(startTime));
            purchaseReturnQueryRequest.setEndTime(DateUtils.parseDateNewFormat(endTime));
            purchaseReturnQueryRequest.setPageNo(0);
            purchaseReturnQueryRequest.setPageSize(30); // 最大100
            PurchaseReturnQueryResult purchaseReturnQueryResult = WdtApiIntegration.purchaseReturnQuery(purchaseReturnQueryRequest);
            if(purchaseReturnQueryResult.isSuccess()){
                System.out.println(purchaseReturnQueryResult.getTotal_count());
                System.out.println(purchaseReturnQueryResult.getPurchase_list());
                System.out.println(purchaseReturnQueryResult);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void testStockoutOrderReturnQuery(){
        try {
            StockoutOrderReturnQueryRequest stockoutOrderReturnQueryRequest = new StockoutOrderReturnQueryRequest();
            String startTime = "2018-09-30 00:00:00";
            String endTime= "2018-10-18 12:00:00";
            stockoutOrderReturnQueryRequest.setStartTime(DateUtils.parseDateNewFormat(startTime));
            stockoutOrderReturnQueryRequest.setEndTime(DateUtils.parseDateNewFormat(endTime));
            stockoutOrderReturnQueryRequest.setPageNo(0);
            stockoutOrderReturnQueryRequest.setPageSize(30); // 最大100
            StockoutOrderReturnQueryResult stockoutOrderReturnQueryResult = WdtApiIntegration.stockoutOrderReturnQuery(stockoutOrderReturnQueryRequest);
            if(stockoutOrderReturnQueryResult.isSuccess()){
                System.out.println(stockoutOrderReturnQueryResult.getTotal_count());
                System.out.println(stockoutOrderReturnQueryResult);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
