package com.xiedapao.lotteryservice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * @author xxl 2023/8/1
 */
@Entity
@Table(name = "lottery")
@Getter
@Setter
public class Lottery {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(columnDefinition = "varchar(32)")
    private String id;

    @Column(name = "period")
    private Integer period;

    @Column
    private String type;

    @Column
    private String num;

    @Column
    private Integer sort;

    @Column
    private LocalDateTime createTime;

}
