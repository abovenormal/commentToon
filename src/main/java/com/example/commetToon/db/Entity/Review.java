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
@Table(name="Review")
public class Review {

    @Column(name = "Id")
    @Id
    private int reviewId;

    @Column
    private String description;

    @Column
    private BigDecimal score;

    @Column
    private int likeCount;

}
