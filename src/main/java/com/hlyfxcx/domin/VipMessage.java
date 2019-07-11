package com.hlyfxcx.domin;

/**
 * Created by Administrator on 2019-03-01.
 */
public class VipMessage {
    private String cVipno;
    private String cVipName;
    private String cSex;
    private String dBirthday;
    private String dValidStart;
    private String dValidEnd;
    private String cTel;
    private String fCurValue;
    private String cStoreNo;
    private String dCreadDate;
    private String cStoreName;
    private String cHome;
    private String addressProvinceCity;

    private Double fCurValue_Online;

    private String WX_OpendId_XCX;

    public String getWX_OpendId_XCX() {
        return WX_OpendId_XCX;
    }

    public void setWX_OpendId_XCX(String WX_OpendId_XCX) {
        this.WX_OpendId_XCX = WX_OpendId_XCX;
    }

    public Double getfCurValue_Online() {
        return fCurValue_Online;
    }

    public void setfCurValue_Online(Double fCurValue_Online) {
        this.fCurValue_Online = fCurValue_Online;
    }

    public String getcVipno() {
        return cVipno;
    }

    public void setcVipno(String cVipno) {
        this.cVipno = cVipno;
    }

    public String getcVipName() {
        return cVipName;
    }

    public void setcVipName(String cVipName) {
        this.cVipName = cVipName;
    }

    public String getcSex() {
        return cSex;
    }

    public void setcSex(String cSex) {
        this.cSex = cSex;
    }

    public String getdBirthday() {
        return dBirthday;
    }

    public void setdBirthday(String dBirthday) {
        this.dBirthday = dBirthday;
    }

    public String getdValidStart() {
        return dValidStart;
    }

    public void setdValidStart(String dValidStart) {
        this.dValidStart = dValidStart;
    }

    public String getdValidEnd() {
        return dValidEnd;
    }

    public void setdValidEnd(String dValidEnd) {
        this.dValidEnd = dValidEnd;
    }

    public String getcTel() {
        return cTel;
    }

    public void setcTel(String cTel) {
        this.cTel = cTel;
    }

    public String getfCurValue() {
        return fCurValue;
    }

    public void setfCurValue(String fCurValue) {
        this.fCurValue = fCurValue;
    }

    public String getcStoreNo() {
        return cStoreNo;
    }

    public void setcStoreNo(String cStoreNo) {
        this.cStoreNo = cStoreNo;
    }

    public String getdCreadDate() {
        return dCreadDate;
    }

    public void setdCreadDate(String dCreadDate) {
        this.dCreadDate = dCreadDate;
    }

    public String getcStoreName() {
        return cStoreName;
    }

    public void setcStoreName(String cStoreName) {
        this.cStoreName = cStoreName;
    }


    public String getcHome() {
        return cHome;
    }

    public void setcHome(String cHome) {
        this.cHome = cHome;
    }

    public String getAddressProvinceCity() {
        return addressProvinceCity;
    }

    public void setAddressProvinceCity(String addressProvinceCity) {
        this.addressProvinceCity = addressProvinceCity;
    }

    @Override
    public String toString() {
        return "VipMessage{" +
                "cVipno='" + cVipno + '\'' +
                ", cVipName='" + cVipName + '\'' +
                ", cSex='" + cSex + '\'' +
                ", dBirthday='" + dBirthday + '\'' +
                ", dValidStart='" + dValidStart + '\'' +
                ", dValidEnd='" + dValidEnd + '\'' +
                ", cTel='" + cTel + '\'' +
                ", fCurValue='" + fCurValue + '\'' +
                ", cStoreNo='" + cStoreNo + '\'' +
                ", dCreadDate='" + dCreadDate + '\'' +
                ", cStoreName='" + cStoreName + '\'' +
                ", cHome='" + cHome + '\'' +
                ", addressProvinceCity='" + addressProvinceCity + '\'' +
                ", fCurValue_Online=" + fCurValue_Online +
                ", WX_OpendId_XCX='" + WX_OpendId_XCX + '\'' +
                '}';
    }
}
