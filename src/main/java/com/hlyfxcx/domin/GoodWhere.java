package com.hlyfxcx.domin;


/**
 * Created by Administrator on 2019-07-10.
 */
public class GoodWhere {
    private String cGoodsNo;
    private String cGoodsName;
    private Integer iNumber;

    public GoodWhere(String cGoodsNo, String cGoodsName, Integer iNumber) {
        this.cGoodsNo = cGoodsNo;
        this.cGoodsName = cGoodsName;
        this.iNumber = iNumber;
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

    public Integer getiNumber() {
        return iNumber;
    }

    public void setiNumber(Integer iNumber) {
        this.iNumber = iNumber;
    }
}
