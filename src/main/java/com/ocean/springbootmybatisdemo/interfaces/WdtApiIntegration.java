package com.ocean.springbootmybatisdemo.interfaces;

import com.ocean.springbootmybatisdemo.interfaces.request.PurchaseOrderQueryRequest;
import com.ocean.springbootmybatisdemo.interfaces.request.PurchaseStockinOrderQueryRequest;
import com.ocean.springbootmybatisdemo.interfaces.result.PurchaseOrderQueryResult;
import com.ocean.springbootmybatisdemo.interfaces.result.PurchaseStockinOrderQueryResult;
import com.ocean.springbootmybatisdemo.util.DateUtils;
import com.ocean.springbootmybatisdemo.util.HttpUtils;
import com.ocean.springbootmybatisdemo.util.SignUtils;
import com.ocean.springbootmybatisdemo.util.StringUtils;
import org.codehaus.jackson.map.ObjectMapper;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/**
 * @Description
 * @Author xiaohu
 * @Date 2018/10/18 12:43
 */
public class WdtApiIntegration {

    /**
     * 旺店通sid
     */
    public static final String sid = "tumao2";

    /**
     * 旺店通appkey
     */
    public static final String appkey = "tumao2-gw";

    /**
     * 旺店通appsecret
     */
    public static final String appsecret = "25491416c9c3e881ca13f658a28a628b";

    /**
     * 旺店通erp接口服务器地址
     */
    public static final String wangdiantongurl = "http://api.wangdian.cn";


    static ObjectMapper mapper = new ObjectMapper();

    public static PurchaseOrderQueryResult purchaseOrderQuery(PurchaseOrderQueryRequest request) throws Exception {
        PurchaseOrderQueryResult purchaseOrderQueryResult = new PurchaseOrderQueryResult();
        TreeMap<String, String> paramsMap = new TreeMap<String, String>();
        paramsMap.put("sid", WdtApiIntegration.sid);
        paramsMap.put("appkey", WdtApiIntegration.appkey);
        paramsMap.put("timestamp", "" + (System.currentTimeMillis() / 1000));
        paramsMap.put("start_time", DateUtils.getNewFormatDateString(request.getStartTime()));
        paramsMap.put("end_time",DateUtils.getNewFormatDateString(request.getEndTime()));
//        paramsMap.put("start_time", DateUtils.getWebDateString(request.getStarTime())+" 0:0:0");
//        paramsMap.put("end_time",DateUtils.getWebDateString(request.getEndTime())+" 0:0:0");
        if (StringUtils.notEmpty(request.getPurchaseNo())) {
            paramsMap.put("purchase_no", request.getPurchaseNo());
        }
        if (StringUtils.notEmpty(request.getOuterNo())) {
            paramsMap.put("outer_no", request.getOuterNo());
        }
        if (request.getStatus() != 0) {
            paramsMap.put("status", request.getStatus() + "");
        }
        if(request.getPageNo()>0){
            paramsMap.put("page_no", request.getPageNo() + "");
        }
        if(request.getPageSize()>0){
            paramsMap.put("page_size", request.getPageSize() + "");
        }

        String sign = SignUtils.md5Signature(paramsMap, WdtApiIntegration.appsecret);
        paramsMap.put("sign", sign);

        StringBuilder param = new StringBuilder();
        for (Iterator<Map.Entry<String, String>> it = paramsMap.entrySet().iterator(); it.hasNext(); ) {
            Map.Entry<String, String> e = it.next();
            param.append("&").append(e.getKey()).append("=").append(e.getValue());
        }
        String postData = "";
        postData = param.toString().substring(1);

        String urlStr = WdtApiIntegration.wangdiantongurl + "/openapi2/purchase_order_query.php";
        String result = HttpUtils.getResult(urlStr, postData);
        if (result == null) {
            return purchaseOrderQueryResult;
        }

        PurchaseOrderQueryResult queryResult = mapper.readValue(result.toString(), PurchaseOrderQueryResult.class);
        if (queryResult == null) {
            return purchaseOrderQueryResult;
        }
        if (queryResult.getCode() != 0) {
            return queryResult;
        }
        queryResult.setSuccess(true);
        return queryResult;
    }


    public static PurchaseStockinOrderQueryResult purchaseStockinOrderQuery(PurchaseStockinOrderQueryRequest request) throws Exception {
        PurchaseStockinOrderQueryResult purchaseStockinOrderQueryResult = new PurchaseStockinOrderQueryResult();
        TreeMap<String, String> paramsMap = new TreeMap<String, String>();
        paramsMap.put("sid", WdtApiIntegration.sid);
        paramsMap.put("appkey", WdtApiIntegration.appkey);
        paramsMap.put("timestamp", "" + (System.currentTimeMillis() / 1000));
        paramsMap.put("start_time", DateUtils.getNewFormatDateString(request.getStartTime()));
        paramsMap.put("end_time",DateUtils.getNewFormatDateString(request.getEndTime()));
        if (request.getStatus() != 0) {
            paramsMap.put("status", request.getStatus() + "");
        }
        if(request.getPageNo()>0){
            paramsMap.put("page_no", request.getPageNo() + "");
        }
        if(request.getPageSize()>0){
            paramsMap.put("page_size", request.getPageSize() + "");
        }

        String sign = SignUtils.md5Signature(paramsMap, WdtApiIntegration.appsecret);
        paramsMap.put("sign", sign);

        StringBuilder param = new StringBuilder();
        for (Iterator<Map.Entry<String, String>> it = paramsMap.entrySet().iterator(); it.hasNext(); ) {
            Map.Entry<String, String> e = it.next();
            param.append("&").append(e.getKey()).append("=").append(e.getValue());
        }
        String postData = "";
        postData = param.toString().substring(1);

        String urlStr = WdtApiIntegration.wangdiantongurl + "/openapi2/stockin_order_query_purchase.php";
        String result = HttpUtils.getResult(urlStr, postData);
        if (result == null) {
            return purchaseStockinOrderQueryResult;
        }

        PurchaseStockinOrderQueryResult queryResult = mapper.readValue(result.toString(), PurchaseStockinOrderQueryResult.class);
        if (queryResult == null) {
            return purchaseStockinOrderQueryResult;
        }
        if (queryResult.getCode() != 0) {
            return queryResult;
        }
        queryResult.setSuccess(true);
        return queryResult;
    }
}
