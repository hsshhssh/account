package org.hssh.biz.entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Table(name = "user_balance")
public class Balance {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 余额
     */
    private BigDecimal balance;

    /**
     * 关联的用户id
     */
    @Column(name = "user_id")
    private Integer userId;
}