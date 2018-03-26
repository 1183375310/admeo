package com.myssm.ssm.entity;

/**
 *权限信息
 * @author 刘铖
 * @since 2018-03-26
 **/
public class Jurisdiction {
    /**
     * 编号
     */
    String id;
    /**
     * 权限名称
     */
    String jurisdictionName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getJurisdictionName() {
        return jurisdictionName;
    }

    public void setJurisdictionName(String jurisdictionName) {
        this.jurisdictionName = jurisdictionName;
    }
}
