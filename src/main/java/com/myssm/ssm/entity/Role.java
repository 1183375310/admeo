package com.myssm.ssm.entity;

/**
 * Created by liucheng on 2018/3/13.
 */
public class Role {
    /**
     * 角色编号
     */
    String roleId;
    /**
     * 角色名称
     */
    String roleName;
    /**
     * 角色等级
     */
    String roleLevel;

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleLevel() {
        return roleLevel;
    }

    public void setRoleLevel(String roleLevel) {
        this.roleLevel = roleLevel;
    }
}
