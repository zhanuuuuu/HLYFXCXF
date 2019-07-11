package com.hlyfxcx.controller;

import com.alibaba.fastjson.JSONObject;
import com.hlyfxcx.domin.*;
import com.hlyfxcx.result.ResultOk;
import com.hlyfxcx.result.resultMsg;
import com.hlyfxcx.service.postmain;
import com.hlyfxcx.tool.listBean;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2019-03-01.
 */
@RestController
@Api(value = "API - postmainconntroller", description = "小程序相关接口调用示例")
public class postmainconntroller {
    private static final Logger logger = LoggerFactory.getLogger(postmainconntroller.class);

    @Autowired
    private postmain post;

    /**
     * @param cMoneyNo       储值卡号
     * @return                储值卡消费记录
     */
    @ApiOperation(value="获取储值卡消费记录", notes="根据储值卡号获取储值卡消费记录")
    @ApiImplicitParam(name = "cMoneyNo", value = "储值卡号",paramType ="query" ,required = true)
    @ApiResponses({
            @ApiResponse(code = 200, message = "Successful — 请求已完成",reference="77777",responseContainer="8888888"),
            @ApiResponse(code = 400, message = "请求中有语法问题，或不能满足请求"),
            @ApiResponse(code = 403, message = "服务器拒绝请求"),
            @ApiResponse(code = 401, message = "未授权客户机访问数据"),
            @ApiResponse(code = 404, message = "服务器找不到给定的资源；文档不存在"),
            @ApiResponse(code = 500, message = "服务器不能完成请求")})

    @RequestMapping(value = "/api/getMoneyCardCostLog", method = RequestMethod.POST)
    @ResponseBody
    public  String getMoneyCardCostLog(@RequestParam(value = "cMoneyNo",required = true) String cMoneyNo){
        try{
            List<Moneycard_Cust_Log> list =post.getMoneycard_Cust_LogS(cMoneyNo);
            String result="";
            if(list!=null && !list.isEmpty()){
                try{
                    result= listBean.getBeanJson(list);
                    return new resultMsg(true,result, ResultOk.SUCCESS.getValue(),ResultOk.SUCCESS.getDesc()).toString();
                }catch (Exception e){
                    e.printStackTrace();
                    logger.info(e.getMessage());
                    return new resultMsg(true,"[]",ResultOk.SUCCESS_NULL.getValue(),ResultOk.SUCCESS_NULL.getDesc()).toString();
                }
            }else {
                return new resultMsg(true,"[]",ResultOk.SUCCESS_NULL.getValue(),ResultOk.SUCCESS_NULL.getDesc()).toString();
            }
        }catch (Exception e){
            e.printStackTrace();
            logger.error(e.getMessage());
            return new resultMsg(false,"[]",ResultOk.ERROR_UNKNOWN.getValue(),ResultOk.ERROR_UNKNOWN.getDesc()).toString();
        }
    }


    /**
     * @param cMoneyNo       储值卡号
     * @return                储值卡充值记录
     */
    @ApiOperation(value="获取储值卡充值记录", notes="根据储值卡号获取储值卡充值记录")
    @ApiImplicitParam(name = "cMoneyNo", value = "储值卡号",paramType ="query" ,required = true)
    @ApiResponses({
            @ApiResponse(code = 200, message = "Successful — 请求已完成",reference="77777",responseContainer="8888888"),
            @ApiResponse(code = 400, message = "请求中有语法问题，或不能满足请求"),
            @ApiResponse(code = 403, message = "服务器拒绝请求"),
            @ApiResponse(code = 401, message = "未授权客户机访问数据"),
            @ApiResponse(code = 404, message = "服务器找不到给定的资源；文档不存在"),
            @ApiResponse(code = 500, message = "服务器不能完成请求")})

    @RequestMapping(value = "/api/getMoneyCardHistory", method = RequestMethod.POST)
    @ResponseBody
    public  String getMoneyCardHistory(@RequestParam(value = "cMoneyNo",required = true) String cMoneyNo){
        try{
            List<MoneyCard_history> list =post.getMoneyCard_historyS(cMoneyNo);
            String result="";
            if(list!=null && !list.isEmpty()){
                try{
                    result= listBean.getBeanJson(list);
                    return new resultMsg(true,result, ResultOk.SUCCESS.getValue(),ResultOk.SUCCESS.getDesc()).toString();
                }catch (Exception e){
                    e.printStackTrace();
                    logger.info(e.getMessage());
                    return new resultMsg(true,"[]",ResultOk.SUCCESS_NULL.getValue(),ResultOk.SUCCESS_NULL.getDesc()).toString();
                }
            }else {
                return new resultMsg(true,"[]",ResultOk.SUCCESS_NULL.getValue(),ResultOk.SUCCESS_NULL.getDesc()).toString();
            }
        }catch (Exception e){
            e.printStackTrace();
            logger.error(e.getMessage());
            return new resultMsg(false,"[]",ResultOk.ERROR_UNKNOWN.getValue(),ResultOk.ERROR_UNKNOWN.getDesc()).toString();
        }

    }

    /**
     * @param cVipno         会员卡号
     * @return                会员卡信息
     */
    @ApiOperation(value="获取会员卡信息", notes="根据会员卡号获取会员卡信息")
    @ApiImplicitParam(name = "cVipno", value = "会员卡号",paramType ="query" ,required = true)
    @ApiResponses({
            @ApiResponse(code = 200, message = "Successful — 请求已完成",reference="77777",responseContainer="8888888"),
            @ApiResponse(code = 400, message = "请求中有语法问题，或不能满足请求"),
            @ApiResponse(code = 403, message = "服务器拒绝请求"),
            @ApiResponse(code = 401, message = "未授权客户机访问数据"),
            @ApiResponse(code = 404, message = "服务器找不到给定的资源；文档不存在"),
            @ApiResponse(code = 500, message = "服务器不能完成请求")})

    @RequestMapping(value = "/api/getVipMesssage", method = RequestMethod.POST)
    @ResponseBody
    public  String getVipMesssage(@RequestParam(value = "cVipno",required = true) String cVipno){
        try{
            List<VipMessage> list =post.getVipMessageS(cVipno);
            String result="";
            if(list!=null && !list.isEmpty()){
                try{
                    result= listBean.getBeanJson(list);
                    return new resultMsg(true,result, ResultOk.SUCCESS.getValue(),ResultOk.SUCCESS.getDesc()).toString();
                }catch (Exception e){
                    e.printStackTrace();
                    logger.info(e.getMessage());
                    return new resultMsg(false,"[]",ResultOk.SUCCESS_NULL.getValue(),ResultOk.SUCCESS_NULL.getDesc()).toString();
                }
            }else {
                return new resultMsg(false,"[]",ResultOk.SUCCESS_NULL.getValue(),ResultOk.SUCCESS_NULL.getDesc()).toString();
            }
        }catch (Exception e){
            e.printStackTrace();
            logger.error(e.getMessage());
            return new resultMsg(false,"[]",ResultOk.ERROR_UNKNOWN.getValue(),ResultOk.ERROR_UNKNOWN.getDesc()).toString();
        }
    }

    @ApiOperation(value="获取会员卡销售信息", notes="根据会员卡号和销售时间段获取会员卡销售信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "cVipno", value = "会员卡号",paramType ="query" ,required = true,dataType = "string"),
            @ApiImplicitParam(name = "btDate", value = "开始时间",paramType ="query" ,required = true,dataType = "string"),
            @ApiImplicitParam(name = "edDate", value = "结束时间",paramType ="query" ,required = true,dataType = "string")
    })
    @ApiResponses({
            @ApiResponse(code = 200, message = "Successful — 请求已完成",reference="77777",responseContainer="8888888"),
            @ApiResponse(code = 400, message = "请求中有语法问题，或不能满足请求"),
            @ApiResponse(code = 403, message = "服务器拒绝请求"),
            @ApiResponse(code = 401, message = "未授权客户机访问数据"),
            @ApiResponse(code = 404, message = "服务器找不到给定的资源；文档不存在"),
            @ApiResponse(code = 500, message = "服务器不能完成请求")})

    @RequestMapping(value = "/api/getVipSale", method = RequestMethod.POST)
    @ResponseBody
    public  String getVipSale(@RequestParam(value = "cVipno",required = true) String cVipno,
                              @RequestParam(value = "btDate",required = true) String btDate,
                              @RequestParam(value = "edDate",required = true) String edDate){
        try{
            if("".equals(cVipno)){
                cVipno="99999999999999";
            }
            List<t_SaleSheetDetail> list =post.getVipSaleMainS(cVipno, btDate, edDate);
            String result="";
            if(list!=null && !list.isEmpty()){
                try{
                    result= listBean.getBeanJson(list);
                    return new resultMsg(true,result, ResultOk.SUCCESS.getValue(),ResultOk.SUCCESS.getDesc()).toString();
                }catch (Exception e){
                    e.printStackTrace();
                    logger.info(e.getMessage());
                    return new resultMsg(false,"[]",ResultOk.SUCCESS_NULL.getValue(),ResultOk.SUCCESS_NULL.getDesc()).toString();
                }
            }else {
                return new resultMsg(false,"[]",ResultOk.SUCCESS_NULL.getValue(),ResultOk.SUCCESS_NULL.getDesc()).toString();
            }
        }catch (Exception e){
            e.printStackTrace();
            logger.error(e.getMessage());
            return new resultMsg(false,"[]",ResultOk.ERROR_UNKNOWN.getValue(),ResultOk.ERROR_UNKNOWN.getDesc()).toString();
        }
    }

    @ApiOperation(value="获取销售详情", notes="根据单号和时间获取销售详情")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "saleDate", value = "销售时间",paramType ="query" ,required = true,dataType = "string"),
            @ApiImplicitParam(name = "sheetNo", value = "销售单号",paramType ="query" ,required = true,dataType = "string"),
            @ApiImplicitParam(name = "cStoreNo", value = "门店编号",paramType ="query" ,required = true,dataType = "string")
    })
    @ApiResponses({
            @ApiResponse(code = 200, message = "Successful — 请求已完成",reference="77777",responseContainer="8888888"),
            @ApiResponse(code = 400, message = "请求中有语法问题，或不能满足请求"),
            @ApiResponse(code = 403, message = "服务器拒绝请求"),
            @ApiResponse(code = 401, message = "未授权客户机访问数据"),
            @ApiResponse(code = 404, message = "服务器找不到给定的资源；文档不存在"),
            @ApiResponse(code = 500, message = "服务器不能完成请求")})

    @RequestMapping(value = "/api/getVipSaleDetail", method = RequestMethod.POST)
    @ResponseBody
    public  String getVipSaleDetail(@RequestParam(value = "saleDate",required = true) String saleDate,
                              @RequestParam(value = "sheetNo",required = true) String btDate,
                                    @RequestParam(value = "cStoreNo",required = true) String cStoreNo){
        try{

            List<t_SaleSheetDetail_Two> list =post.getVipSaleDetailS(saleDate, btDate,cStoreNo);
            String result="";
            if(list!=null && !list.isEmpty()){
                try{
                    result= listBean.getBeanJson(list);
                    return new resultMsg(true,result, ResultOk.SUCCESS.getValue(),ResultOk.SUCCESS.getDesc()).toString();
                }catch (Exception e){
                    e.printStackTrace();
                    logger.info(e.getMessage());
                    return new resultMsg(false,"[]",ResultOk.SUCCESS_NULL.getValue(),ResultOk.SUCCESS_NULL.getDesc()).toString();
                }
            }else {
                return new resultMsg(false,"[]",ResultOk.SUCCESS_NULL.getValue(),ResultOk.SUCCESS_NULL.getDesc()).toString();
            }
        }catch (Exception e){
            e.printStackTrace();
            logger.error(e.getMessage());
            return new resultMsg(false,"[]",ResultOk.ERROR_UNKNOWN.getValue(),ResultOk.ERROR_UNKNOWN.getDesc()).toString();
        }
    }

    @ApiOperation(value="会员绑定", notes=" 根据电话号码绑定会员（209-06-17）")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "cVipNo", value = "卡号",paramType ="query" ,required = true,dataType = "string"),
            @ApiImplicitParam(name = "cVipName", value = "姓名",paramType ="query" ,required = true,dataType = "string"),
            @ApiImplicitParam(name = "cTel", value = "电话",paramType ="query" ,required = true,dataType = "string"),
            @ApiImplicitParam(name = "wxOpenId", value = "wxOpenId",paramType ="query" ,required = true,dataType = "string"),
            @ApiImplicitParam(name = "addressProvinceCity", value = "省市区",paramType ="query" ,required = true,dataType = "string"),
            @ApiImplicitParam(name = "cHome", value = "详细地址",paramType ="query" ,required = true,dataType = "string")
    })
    @ApiResponses({
            @ApiResponse(code = 200, message = "Successful — 请求已完成",reference="77777",responseContainer="8888888"),
            @ApiResponse(code = 400, message = "请求中有语法问题，或不能满足请求"),
            @ApiResponse(code = 403, message = "服务器拒绝请求"),
            @ApiResponse(code = 401, message = "未授权客户机访问数据"),
            @ApiResponse(code = 404, message = "服务器找不到给定的资源；文档不存在"),
            @ApiResponse(code = 500, message = "服务器不能完成请求")})

    @RequestMapping(value = "/api/bindVip", method = RequestMethod.POST)
    @ResponseBody
    public  String bindVip(@RequestParam(value = "cVipNo",required = true) String cVipNo,
                            @RequestParam(value = "cVipName",required = true) String cVipName,
                           @RequestParam(value = "cTel",required = true) String cTel,
                           @RequestParam(value = "wxOpenId",required = true) String wxOpenId,
                           @RequestParam(value = "addressProvinceCity",required = true) String addressProvinceCity,
                           @RequestParam(value = "cHome",required = true) String cHome){
        try{
            if("".equals(cVipNo)){
                cVipNo="99999999999999";
            }
            List<VipMessage> list =post.getVipMessageBS(cVipNo);

            if(list!=null && !list.isEmpty()){
                //会员已经绑定过了
                return new resultMsg(false,"[]",ResultOk.VIP_HASBIND.getValue(),ResultOk.VIP_HASBIND.getDesc()).toString();
            }else {
                //开始绑定会员
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(new Date());
                calendar.add(Calendar.YEAR, 5);

                VipMessage vipMessage=new VipMessage();
                vipMessage.setcVipno(cVipNo);
                vipMessage.setcVipName(cVipName);
                vipMessage.setcTel(cTel);
                vipMessage.setWX_OpendId_XCX(wxOpenId);
                vipMessage.setcHome(cHome);
                vipMessage.setAddressProvinceCity(addressProvinceCity);

                vipMessage.setdValidStart(new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
                vipMessage.setdValidEnd(new SimpleDateFormat("yyyy-MM-dd").format(calendar.getTime()));

                try{
                    if(post.BindVipS(vipMessage)>0){
                        JSONObject jsonObject=new JSONObject();
                        jsonObject.put("cSheetNo",cVipNo);
                        return new resultMsg(true,"["+jsonObject.toString()+"]",ResultOk.SUCCESS.getValue(),ResultOk.SUCCESS.getDesc()).toString();
                    }else{
                        return new resultMsg(false,"[]",ResultOk.ERROR_UNKNOWN.getValue(),ResultOk.ERROR_UNKNOWN.getDesc()).toString();
                    }
                }catch (Exception e){
                    e.printStackTrace();
                    logger.error(e.getMessage());
                    return new resultMsg(false,"[]",ResultOk.ERROR_UNKNOWN.getValue(),ResultOk.ERROR_UNKNOWN.getDesc()).toString();
                }

            }
        }catch (Exception e){
            e.printStackTrace();
            logger.error(e.getMessage());
            return new resultMsg(false,"[]",ResultOk.ERROR_UNKNOWN.getValue(),ResultOk.ERROR_UNKNOWN.getDesc()).toString();
        }
    }


    @ApiOperation(value="会员注册(等B版上线后 该方法将会被废弃)", notes="根据电话号码注册会员")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "cVipName", value = "姓名",paramType ="query" ,required = true,dataType = "string"),
            @ApiImplicitParam(name = "cTel", value = "电话",paramType ="query" ,required = true,dataType = "string"),
            @ApiImplicitParam(name = "cSex", value = "性别",paramType ="query" ,required = true,dataType = "string"),
            @ApiImplicitParam(name = "wxOpenId", value = "wxOpenId",paramType ="query" ,required = true,dataType = "string")
    })
    @ApiResponses({
            @ApiResponse(code = 200, message = "Successful — 请求已完成",reference="77777",responseContainer="8888888"),
            @ApiResponse(code = 400, message = "请求中有语法问题，或不能满足请求"),
            @ApiResponse(code = 403, message = "服务器拒绝请求"),
            @ApiResponse(code = 401, message = "未授权客户机访问数据"),
            @ApiResponse(code = 404, message = "服务器找不到给定的资源；文档不存在"),
            @ApiResponse(code = 500, message = "服务器不能完成请求")})

    @RequestMapping(value = "/api/registerVip", method = RequestMethod.POST)
    @ResponseBody
    public  String registerVip(@RequestParam(value = "cVipName",required = true) String cVipName,
                                @RequestParam(value = "cTel",required = true) String cTel,
                                @RequestParam(value = "cSex",required = true) String cSex,
                                @RequestParam(value = "wxOpenId",required = true) String wxOpenId){
        try{
            if("".equals(cTel)){
                cTel="99999999999999";
            }
            List<VipMessage> list =post.getVipMessageS(cTel);

            if(list!=null && !list.isEmpty()){
                //会员已经注册过了
                return new resultMsg(false,"[]",ResultOk.VIP_HSREGIETER.getValue(),ResultOk.VIP_HSREGIETER.getDesc()).toString();
            }else {
                //开始注册会员
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(new Date());
                calendar.add(Calendar.YEAR, 5);

                VipMessage vipMessage=new VipMessage();
                vipMessage.setcVipno(cTel);
                vipMessage.setcSex(cSex);
                vipMessage.setcVipName(cVipName);
                vipMessage.setcTel(cTel);
                vipMessage.setWX_OpendId_XCX(wxOpenId);
                vipMessage.setdValidStart(new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
                vipMessage.setdValidEnd(new SimpleDateFormat("yyyy-MM-dd").format(calendar.getTime()));

               try{
                   if(post.registerVipS(vipMessage)>0){

                       JSONObject jsonObject=new JSONObject();
                       jsonObject.put("cSheetNo",cTel);
                       return new resultMsg(true,"["+jsonObject.toString()+"]",ResultOk.SUCCESS.getValue(),ResultOk.SUCCESS.getDesc()).toString();
                   }else{
                       return new resultMsg(false,"[]",ResultOk.ERROR_UNKNOWN.getValue(),ResultOk.ERROR_UNKNOWN.getDesc()).toString();
                   }
               }catch (Exception e){
                   e.printStackTrace();
                   logger.error(e.getMessage());
                   return new resultMsg(false,"[]",ResultOk.ERROR_UNKNOWN.getValue(),ResultOk.ERROR_UNKNOWN.getDesc()).toString();
               }

            }
        }catch (Exception e){
            e.printStackTrace();
            logger.error(e.getMessage());
            return new resultMsg(false,"[]",ResultOk.ERROR_UNKNOWN.getValue(),ResultOk.ERROR_UNKNOWN.getDesc()).toString();
        }
    }

    @ApiOperation(value="会员注册B版本(新版本)", notes="根据电话号码注册会员")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "cVipName", value = "姓名",paramType ="query" ,required = true,dataType = "string"),
            @ApiImplicitParam(name = "cTel", value = "电话",paramType ="query" ,required = true,dataType = "string"),
            @ApiImplicitParam(name = "cSex", value = "性别",paramType ="query" ,required = true,dataType = "string"),
            @ApiImplicitParam(name = "wxOpenId", value = "wxOpenId",paramType ="query" ,required = true,dataType = "string"),
            @ApiImplicitParam(name = "cStoreNo", value = "门店编号",paramType ="query" ,required = true,dataType = "string"),
            @ApiImplicitParam(name = "cStoreName", value = "门店名称",paramType ="query" ,required = true,dataType = "string"),
            @ApiImplicitParam(name = "addressProvinceCity", value = "省市区",paramType ="query" ,required = true,dataType = "string"),
            @ApiImplicitParam(name = "cHome", value = "详细地址",paramType ="query" ,required = true,dataType = "string")
    })
    @ApiResponses({
            @ApiResponse(code = 200, message = "Successful — 请求已完成",reference="77777",responseContainer="8888888"),
            @ApiResponse(code = 400, message = "请求中有语法问题，或不能满足请求"),
            @ApiResponse(code = 403, message = "服务器拒绝请求"),
            @ApiResponse(code = 401, message = "未授权客户机访问数据"),
            @ApiResponse(code = 404, message = "服务器找不到给定的资源；文档不存在"),
            @ApiResponse(code = 500, message = "服务器不能完成请求")})

    @RequestMapping(value = "/api/registerVipB", method = RequestMethod.POST)
    @ResponseBody
    public  String registerVipB(@RequestParam(value = "cVipName",required = true) String cVipName,
                                @RequestParam(value = "cTel",required = true) String cTel,
                                @RequestParam(value = "cSex",required = true) String cSex,
                                @RequestParam(value = "wxOpenId",required = true) String wxOpenId,
                                @RequestParam(value = "cStoreNo",required = true) String cStoreNo,
                                @RequestParam(value = "cStoreName",required = true) String cStoreName,
                                @RequestParam(value = "addressProvinceCity",required = true) String addressProvinceCity,
                                @RequestParam(value = "cHome",required = true) String cHome){
        try{
            if("".equals(cTel)){
                cTel="99999999999999";
            }
            List<VipMessage> list =post.getVipMessageS(cTel);

            if(list!=null && !list.isEmpty()){
                //会员已经注册过了
                return new resultMsg(false,"[]",ResultOk.VIP_HSREGIETER.getValue(),ResultOk.VIP_HSREGIETER.getDesc()).toString();
            }else {
                //开始注册会员
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(new Date());
                calendar.add(Calendar.YEAR, 5);

                VipMessage vipMessage=new VipMessage();
                vipMessage.setcVipno(cTel);
                vipMessage.setcSex(cSex);
                vipMessage.setcVipName(cVipName);
                vipMessage.setcTel(cTel);
                vipMessage.setWX_OpendId_XCX(wxOpenId);
                vipMessage.setdValidStart(new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
                vipMessage.setdValidEnd(new SimpleDateFormat("yyyy-MM-dd").format(calendar.getTime()));

                //最新增加
                vipMessage.setcStoreNo(cStoreNo);
                vipMessage.setcStoreName(cStoreName);
                vipMessage.setAddressProvinceCity(addressProvinceCity);
                vipMessage.setcHome(cHome);


                try{
                    if(post.registerVipBS(vipMessage)>0){

                        JSONObject jsonObject=new JSONObject();
                        jsonObject.put("cSheetNo",cTel);
                        return new resultMsg(true,"["+jsonObject.toString()+"]",ResultOk.SUCCESS.getValue(),ResultOk.SUCCESS.getDesc()).toString();
                    }else{
                        return new resultMsg(false,"[]",ResultOk.ERROR_UNKNOWN.getValue(),ResultOk.ERROR_UNKNOWN.getDesc()).toString();
                    }
                }catch (Exception e){
                    e.printStackTrace();
                    logger.error(e.getMessage());
                    return new resultMsg(false,"[]",ResultOk.ERROR_UNKNOWN.getValue(),ResultOk.ERROR_UNKNOWN.getDesc()).toString();
                }

            }
        }catch (Exception e){
            e.printStackTrace();
            logger.error(e.getMessage());
            return new resultMsg(false,"[]",ResultOk.ERROR_UNKNOWN.getValue(),ResultOk.ERROR_UNKNOWN.getDesc()).toString();
        }
    }

    @ApiOperation(value="获取商品", notes="获取商品")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "cGoodsNo", value = "cGoodsNo",paramType ="query" ,required = true,dataType = "string"),
            @ApiImplicitParam(name = "cGoodsName", value = "cGoodsName",paramType ="query" ,required = true,dataType = "string"),
            @ApiImplicitParam(name = "iNumber", value = "条数",paramType ="query" ,required = true,dataType = "string")
    })
    @ApiResponses({
            @ApiResponse(code = 200, message = "Successful — 请求已完成",reference="77777",responseContainer="8888888"),
            @ApiResponse(code = 400, message = "请求中有语法问题，或不能满足请求"),
            @ApiResponse(code = 403, message = "服务器拒绝请求"),
            @ApiResponse(code = 401, message = "未授权客户机访问数据"),
            @ApiResponse(code = 404, message = "服务器找不到给定的资源；文档不存在"),
            @ApiResponse(code = 500, message = "服务器不能完成请求")})

    @RequestMapping(value = "/api/getgoods", method = RequestMethod.POST)
    @ResponseBody
    public  String getGoods(@RequestParam(value = "cGoodsNo",required = true) String cGoodsNo,
                            @RequestParam(value = "cGoodsName",required = true) String cGoodsName,
                            @RequestParam(value = "iNumber",required = true) String iNumber){
        try{

            List<GoodInfo> list =post.getGoodsS(cGoodsNo,cGoodsName,iNumber);
            String result="";
            if(list!=null && !list.isEmpty()){
                try{
                    result= listBean.getBeanJson(list);
                    return new resultMsg(true,result, ResultOk.SUCCESS.getValue(),ResultOk.SUCCESS.getDesc()).toString();
                }catch (Exception e){
                    e.printStackTrace();
                    logger.info(e.getMessage());
                    return new resultMsg(false,"[]",ResultOk.SUCCESS_NULL.getValue(),ResultOk.SUCCESS_NULL.getDesc()).toString();
                }
            }else {
                return new resultMsg(false,"[]",ResultOk.SUCCESS_NULL.getValue(),ResultOk.SUCCESS_NULL.getDesc()).toString();
            }
        }catch (Exception e){
            e.printStackTrace();
            logger.error(e.getMessage());
            return new resultMsg(false,"[]",ResultOk.ERROR_UNKNOWN.getValue(),ResultOk.ERROR_UNKNOWN.getDesc()).toString();
        }
    }


    @ApiOperation(value="获取所有门店", notes="获取所有门店")
    @ApiResponses({
            @ApiResponse(code = 200, message = "Successful — 请求已完成",reference="77777",responseContainer="8888888"),
            @ApiResponse(code = 400, message = "请求中有语法问题，或不能满足请求"),
            @ApiResponse(code = 403, message = "服务器拒绝请求"),
            @ApiResponse(code = 401, message = "未授权客户机访问数据"),
            @ApiResponse(code = 404, message = "服务器找不到给定的资源；文档不存在"),
            @ApiResponse(code = 500, message = "服务器不能完成请求")})

    @RequestMapping(value = "/api/getAllStore", method = RequestMethod.POST)
    @ResponseBody
    public  String getAllStore(){
        try{

            List<Store> list =post.getAllStoreS();
            String result="";
            if(list!=null && !list.isEmpty()){
                try{
                    result= listBean.getBeanJson(list);
                    return new resultMsg(true,result, ResultOk.SUCCESS.getValue(),ResultOk.SUCCESS.getDesc()).toString();
                }catch (Exception e){
                    e.printStackTrace();
                    logger.info(e.getMessage());
                    return new resultMsg(false,"[]",ResultOk.SUCCESS_NULL.getValue(),ResultOk.SUCCESS_NULL.getDesc()).toString();
                }
            }else {
                return new resultMsg(false,"[]",ResultOk.SUCCESS_NULL.getValue(),ResultOk.SUCCESS_NULL.getDesc()).toString();
            }
        }catch (Exception e){
            e.printStackTrace();
            logger.error(e.getMessage());
            return new resultMsg(false,"[]",ResultOk.ERROR_UNKNOWN.getValue(),ResultOk.ERROR_UNKNOWN.getDesc()).toString();
        }
    }


}
