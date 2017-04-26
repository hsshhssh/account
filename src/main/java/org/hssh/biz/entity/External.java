package org.hssh.biz.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Table(name = "user_external")
public class External {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 类型 外部系统账号类型 1微信
     */
    private Integer type;

    /**
     * 外部系统唯一标识id 如微信openId
     */
    private String uid;

    /**
     * 用户表关联id
     */
    @Column(name = "user_id")
    private Integer userId;
}