package com.hlyfxcx.result;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Created by Administrator on 2018-03-15.
 */
public class resultMsg {
    private  boolean success; //代表返回信息是否正确
    private  String result;     //返回的结果json集
    private  String statusCode;     //返回的状态码
    private  String msg;      //返回的附加信息

    public resultMsg() {
    }

    public resultMsg(boolean success, String result, String statusCode, String msg) {
        this.success = success;
        this.result = result;
        this.statusCode = statusCode;
        this.msg = msg;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "{" +
                "\"success\":" + success +
                ",\"result\":" + result +
                ",\"statusCode\":\"" + statusCode + '\"' +
                ", \"msg\":\"" + msg + '\"' +
                '}';
    }

    public static void main(String[] args) {
        resultMsg msg=new resultMsg(true,"123","1","数据集为空");
        System.out.println(msg.toString());

        Gson gson2=new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.IDENTITY).create();
        String obj2=gson2.toJson(msg);
        System.out.println(obj2);//输出{"username":"lintepeng","Age":22}

        String str="[{\n" +
                "\t\"attachment\": \"\",\n" +
                "\t\"details\": [{\n" +
                "\t\t\"ass\": [{\n" +
                "\t\t\t\"checktypecode\": \"\",\n" +
                "\t\t\t\"checkvaluecode\": \"\"\n" +
                "\t\t}],\n" +
                "\t\t\"cashflow\": [{\n" +
                "\t\t\t\"money\": \"\",\n" +
                "\t\t\t\"pk_cashflow\": \"\",\n" +
                "\t\t\t\"pk_currtype\": \"\"\n" +
                "\t\t}],\n" +
                "\t\t\"creditamount\": \"\",\n" +
                "\t\t\"creditquantity\": \"\",\n" +
                "\t\t\"debitamount\": \"\",\n" +
                "\t\t\"debitquantity\": \"\",\n" +
                "\t\t\"detailindex\": \"\",\n" +
                "\t\t\"excrate1\": \"\",\n" +
                "\t\t\"explanation\": \"\",\n" +
                "\t\t\"localcreditamount\": \"\",\n" +
                "\t\t\"localdebitamount\": \"\",\n" +
                "\t\t\"pk_accsubj\": \"\",\n" +
                "\t\t\"pk_currtype\": \"\",\n" +
                "\t\t\"price\": \"\"\n" +
                "\t}],\n" +
                "\t\"explanation\": \"\",\n" +
                "\t\"isdifflag\": false,\n" +
                "\t\"no\": \"\",\n" +
                "\t\"pk_corp\": \"\",\n" +
                "\t\"pk_glorgbook\": \"\",\n" +
                "\t\"pk_prepared\": \"\",\n" +
                "\t\"pk_vouchertype\": \"\",\n" +
                "\t\"prepareddate\": \"\",\n" +
                "\t\"voucherkind\": \"0\"\n" +
                "}]";



    }
}
