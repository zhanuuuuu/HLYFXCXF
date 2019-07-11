package com.hlyfxcx.domin;

/**
 * Created by Administrator on 2019-05-16.
 */
public class t_SaleSheetDetail_Two {
    private String  dSaleDate;
    private String  cSaleSheetno;
    private String  cGoodsNo;
    private String  cGoodsName;
    private Double  fVipPrice;
    private Double  fLastSettle;
    private Double  fQuantity;

    public String getdSaleDate() {
        return dSaleDate;
    }

    public void setdSaleDate(String dSaleDate) {
        this.dSaleDate = dSaleDate;
    }

    public String getcSaleSheetno() {
        return cSaleSheetno;
    }

    public void setcSaleSheetno(String cSaleSheetno) {
        this.cSaleSheetno = cSaleSheetno;
    }

    public String getcGoodsNo() {
        return cGoodsNo;
    }

    public void setcGoodsNo(String cGoodsNo) {
        this.cGoodsNo = cGoodsNo;
    }

    public String getcGoodsName() {
        return cGoodsName;
    }

    public void setcGoodsName(String cGoodsName) {
        this.cGoodsName = cGoodsName;
    }

    public Double getfVipPrice() {
        return fVipPrice;
    }

    public void setfVipPrice(Double fVipPrice) {
        this.fVipPrice = fVipPrice;
    }

    public Double getfLastSettle() {
        return fLastSettle;
    }

    public void setfLastSettle(Double fLastSettle) {
        this.fLastSettle = fLastSettle;
    }

    public Double getfQuantity() {
        return fQuantity;
    }

    public void setfQuantity(Double fQuantity) {
        this.fQuantity = fQuantity;
    }

    @Override
    public String toString() {
        return "t_SaleSheetDetail_Two{" +
                "dSaleDate='" + dSaleDate + '\'' +
                ", cSaleSheetno='" + cSaleSheetno + '\'' +
                ", cGoodsNo='" + cGoodsNo + '\'' +
                ", cGoodsName='" + cGoodsName + '\'' +
                ", fVipPrice=" + fVipPrice +
                ", fLastSettle=" + fLastSettle +
                ", fQuantity=" + fQuantity +
                '}';
    }
}
