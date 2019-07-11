package com.hlyfxcx.dao.miniprogram;

import com.hlyfxcx.domin.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.omg.PortableInterceptor.INACTIVE;

import java.util.List;

/**
 * Created by Administrator on 2019-02-28.
 */
@Mapper
public interface mimiDao {
    List<Moneycard_Cust_Log> getMoneycard_Cust_Log(@Param("cMoneyNo") String cMoneyNo);

    List<MoneyCard_history> getMoneyCard_history(@Param("cardno") String cardno);

    List<VipMessage> getVipMessage(@Param("cVipno") String cVipno);

    List<VipMessage> getVipMessageB(@Param("cVipno") String cVipno);

    List<t_SaleSheetDetail> getVipSaleMain(@Param("cVipno") String cVipno, @Param("btDate") String btDate,
                                           @Param("edDate") String edDate);

    List<t_SaleSheetDetail_Two> getVipSaleDetail(@Param("saleDate") String saleDate, @Param("cSaleSheetno") String cSaleSheetno,@Param("cStoreNo") String cStoreNo);

    //会员注册
    Integer registerVip(@Param("vipMessage") VipMessage vipMessage);

    Integer registerVipB(@Param("vipMessage") VipMessage vipMessage);

    Integer BindVip(@Param("vipMessage") VipMessage vipMessage);

    List<Store> getAllStore();

    List<GoodInfo> getGoods(@Param("goodWhere") GoodWhere goodWhere);

}
