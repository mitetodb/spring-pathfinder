package com.example.pathfinder.model.entity;

import com.example.pathfinder.model.entity.enums.LevelEnum;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "users")
public class UserEntity extends BaseEntity {

    private String fullname;
    private String username;
    private String password;
    private String email;
    private Integer age;
    private Set<RoleEntity> roles;
    private LevelEnum level;

    public UserEntity() {
    }

    @Column(nullable = false)
    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    @Column(unique = true, nullable = false)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Column(nullable = false)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Column(nullable = false)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @ManyToMany
    public Set<RoleEntity> getRoles() {
        return roles;
    }

    public void setRoles(Set<RoleEntity> roles) {
        this.roles = roles;
    }

    @Enumerated(EnumType.STRING)
    public LevelEnum getLevel() {
        return level;
    }

    public void setLevel(LevelEnum level) {
        this.level = level;
    }

    @Column(name = "age")
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
