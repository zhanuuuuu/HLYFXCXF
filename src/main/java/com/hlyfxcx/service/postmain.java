package com.hlyfxcx.service;

import com.hlyfxcx.domin.*;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2019-03-01.
 */

public interface postmain {

    List<Moneycard_Cust_Log> getMoneycard_Cust_LogS(String cMoneyNo);

    List<MoneyCard_history> getMoneyCard_historyS(String cardno);

    List<VipMessage> getVipMessageS(String cVipno);

    List<VipMessage> getVipMessageBS(String cVipno);

    List<t_SaleSheetDetail> getVipSaleMainS(String cVipno, String btDate,
                                           String edDate);

    List<t_SaleSheetDetail_Two> getVipSaleDetailS(String saleDate, String cSaleSheetno,String cStoreNo);

    Integer registerVipS(VipMessage vipMessage);

    Integer registerVipBS(VipMessage vipMessage);

    Integer BindVipS(VipMessage vipMessage);
    List<Store> getAllStoreS();

    List<GoodInfo> getGoodsS(String cGoodsNo,String cGoodsName,String iNumber);
}
