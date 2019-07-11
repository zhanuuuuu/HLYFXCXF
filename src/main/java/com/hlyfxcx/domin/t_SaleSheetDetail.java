package com.hlyfxcx.domin;

import java.io.Serializable;

/**
 * Created by Administrator on 2019-05-16.
 * 合计会员消费详情的
 */
public class t_SaleSheetDetail implements Serializable{

   private static final long serialVersionUID = -5809782578272943999L;

    private String cStoreNo;
    private String  cStoreName;
    private String  cSaleSheetno;
    private String  dSaleDate;
    private String  cVipNo;
    private Double  fLastSettle;

    private Double  fVipScore_cur;

    public String getcStoreNo() {
        return cStoreNo;
    }

    public void setcStoreNo(String cStoreNo) {
        this.cStoreNo = cStoreNo;
    }

    public String getcStoreName() {
        return cStoreName;
    }

    public void setcStoreName(String cStoreName) {
        this.cStoreName = cStoreName;
    }

    public Double getfVipScore_cur() {
        return fVipScore_cur;
    }

    public void setfVipScore_cur(Double fVipScore_cur) {
        this.fVipScore_cur = fVipScore_cur;
    }

    public String getcSaleSheetno() {
        return cSaleSheetno;
    }

    public void setcSaleSheetno(String cSaleSheetno) {
        this.cSaleSheetno = cSaleSheetno;
    }

    public String getdSaleDate() {
        return dSaleDate;
    }

    public void setdSaleDate(String dSaleDate) {
        this.dSaleDate = dSaleDate;
    }

    public String getcVipNo() {
        return cVipNo;
    }

    public void setcVipNo(String cVipNo) {
        this.cVipNo = cVipNo;
    }

    public Double getfLastSettle() {
        return fLastSettle;
    }

    public void setfLastSettle(Double fLastSettle) {
        this.fLastSettle = fLastSettle;
    }

    @Override
    public String toString() {
        return "t_SaleSheetDetail{" +
                "cStoreNo='" + cStoreNo + '\'' +
                ", cStoreName='" + cStoreName + '\'' +
                ", cSaleSheetno='" + cSaleSheetno + '\'' +
                ", dSaleDate='" + dSaleDate + '\'' +
                ", cVipNo='" + cVipNo + '\'' +
                ", fLastSettle=" + fLastSettle +
                ", fVipScore_cur=" + fVipScore_cur +
                '}';
    }
}
