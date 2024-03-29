package com.myblog8.entity;

import jakarta.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity

@Setter
@Getter
@Table(name = "roles")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;


    @Column(length = 60)
    private String name;
}
