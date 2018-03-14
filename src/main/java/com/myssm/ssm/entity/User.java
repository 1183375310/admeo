package com.myssm.ssm.entity;

import javax.persistence.Column;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by liucheng on 2018/3/13.
 */
public class User {
    /**
     * 登陆名
     */
     String loginId;

    /**
     * 姓名
     */
     String name;

    /**
     * 密码
     */
     String password;

    /**
     * 关联角色
     */
     List<Role> roleList =new ArrayList<Role>();
    /**
     * 用户类型()
     */
     String userType;
    /**
     * 删除标记
     */
     Integer isDelete;
    /**
     * 身份证
     */
     String idCard;
    /**
     * 手机
     */
     String phone;

    /**
     * QQ
     */
     String qq;

    /**
     * email
     */
     String email;

    /**
     * 常住地址
     */
     String address;

    /**
     * 用户描述
     */
     String describe;

    /**
     * 创建时间
     */
     Date createTime;
    /**
     * 最近登录
     */
     Date recentLogin;

}
