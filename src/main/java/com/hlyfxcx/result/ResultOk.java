package com.hlyfxcx.result;

/**
 * @author 张
 *
 */
public enum ResultOk {
    SUCCESS("1001","正确"),
    SUCCESS_NULL("1002","数据集为空"),
    ERROR_UNKNOWN("1003","系统繁忙，请稍后再试...."),
    VIP_HSREGIETER("1004","该会员已经注册过了"),
    VIP_HASBIND("1005","该会员已经绑定过了"),
    APPSECRET_ERROR("1006","密码出错"),
    Tocken_FAIL("9998","token无效");
    private String value;
    private String desc;

    private ResultOk(String value, String desc) {
        this.setValue(value);
        this.setDesc(desc);
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "[" + this.value + "]" + this.desc;
    }
}
