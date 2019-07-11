package com.hlyfxcx.service.imp;

import com.hlyfxcx.dao.miniprogram.mimiDao;
import com.hlyfxcx.domin.*;
import com.hlyfxcx.service.postmain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2019-03-01.
 */
@Service
public class postmainimpl implements postmain {

    /**
     *
     */
    @Autowired
    private mimiDao mimi;

    @Override
    public List<Moneycard_Cust_Log> getMoneycard_Cust_LogS(String cMoneyNo) {
        return mimi.getMoneycard_Cust_Log(cMoneyNo);
    }

    @Override
    public List<MoneyCard_history> getMoneyCard_historyS(String cardno) {
        return mimi.getMoneyCard_history(cardno);
    }

    @Override
    public List<VipMessage> getVipMessageS(String cVipno) {
        return mimi.getVipMessage(cVipno);
    }

    @Override
    public List<VipMessage> getVipMessageBS(String cVipno) {
        return mimi.getVipMessageB(cVipno);
    }

    @Override
    public List<t_SaleSheetDetail> getVipSaleMainS(String cVipno, String btDate, String edDate) {
        return mimi.getVipSaleMain(cVipno, btDate, edDate);
    }

    @Override
    public List<t_SaleSheetDetail_Two> getVipSaleDetailS(String saleDate, String cSaleSheetno,String cStoreNo) {
        return mimi.getVipSaleDetail(saleDate, cSaleSheetno,cStoreNo);
    }

    @Override
    public Integer registerVipS(VipMessage vipMessage) {
        return mimi.registerVip(vipMessage);
    }

    @Override
    public Integer registerVipBS(VipMessage vipMessage) {
        return mimi.registerVipB(vipMessage);
    }

    @Override
    public Integer BindVipS(VipMessage vipMessage) {
        return mimi.BindVip(vipMessage);
    }

    @Override
    public List<Store> getAllStoreS() {
        return mimi.getAllStore();
    }

    @Override
    public List<GoodInfo> getGoodsS(String cGoodsNo, String cGoodsName, String iNumber) {

        GoodWhere goodWhere=new GoodWhere("'%"+cGoodsNo+"%'","'%"+cGoodsName+"%'",Integer.valueOf(iNumber));
        return mimi.getGoods(goodWhere);
    }
}
