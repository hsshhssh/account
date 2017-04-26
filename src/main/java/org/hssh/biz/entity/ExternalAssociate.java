package org.hssh.biz.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Table(name = "user_external_associate")
public class ExternalAssociate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 主账号id
     */
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 外部系统账号关联的账号id
     */
    @Column(name = "alias_user_id")
    private Integer aliasUserId;
}