package com.example.commetToon.db.Entity;


import lombok.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="User")
public class User{

    @Column(name = "Id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;

    @Column
    private String thumbUrl;

    @Column
    private String nickName;

    @Column
    private String introText;

    @Column String refreshToken;

}
