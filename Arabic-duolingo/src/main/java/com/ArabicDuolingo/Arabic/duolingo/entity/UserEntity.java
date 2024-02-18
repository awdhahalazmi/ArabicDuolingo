package com.ArabicDuolingo.Arabic.duolingo.entity;

import javax.persistence.*;

@Entity
@Table(name = "Bank_users")

public class UserEntity {

    @Id
    @Column(name = "id",nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name",nullable = false)
    private java.lang.String name;

    @Column(name = "email",nullable = false)

    private java.lang.String email;

    @Column(name = "role",nullable = false)




    @Enumerated(EnumType.STRING)
    @OneToOne
    @JoinColumn(name = "role_id")
    private RoleEntity role;


    @Column(nullable = false)
    private String password;
    @Column(name = "username",nullable = false)
    private String username;
    public java.lang.String getEmail() {
        return email;
    }

    public void setEmail(java.lang.String email) {
        this.email = email;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public java.lang.String getName() {
        return name;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }



    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    public RoleEntity getRole() {
        return role;
    }

    public void setRole(RoleEntity role) {
        this.role = role;
    }
}

