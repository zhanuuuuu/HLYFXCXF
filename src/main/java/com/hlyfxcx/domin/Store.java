package com.hlyfxcx.domin;

import java.io.Serializable;

/**
 * Created by Administrator on 2019-06-15.
 */
public class Store implements Serializable {

    private static final long serialVersionUID = -5809782570272943999L;

    private  String cStoreNo;
    private  String  cStoreName;
    private  String  cStore;

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

    public String getcStore() {
        return cStore;
    }

    public void setcStore(String cStore) {
        this.cStore = cStore;
    }

    @Override
    public String toString() {
        return "Store{" +
                "cStoreNo='" + cStoreNo + '\'' +
                ", cStoreName='" + cStoreName + '\'' +
                ", cStore='" + cStore + '\'' +
                '}';
    }
}
