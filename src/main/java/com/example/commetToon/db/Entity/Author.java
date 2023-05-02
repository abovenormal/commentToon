package com.example.commetToon.db.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Author")
public class Author {

    @Column(name = "Id")
    @Id
    private int authorId;

    @Column
    private String authorName;

}
