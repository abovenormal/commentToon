package com.example.commetToon.db.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Product")
public class Product {

    @Column(name = "Id")
    @Id
    private int productId;

    @Column
    private String thumbUrl;

    @Column
    private String hashId;

    @Column
    private String endUrl;

    @Column
    private String title;

    @Column
    private String introText;

    @Column
    private BigDecimal averageScore;

    @Column
    private int viewCount;

    @Column
    private int isForAdult;

    @Column
    private String platform;


}
