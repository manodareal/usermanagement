package com.example.usermanagement.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Random;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
@Table(name = "Role")
@Entity
public class Role {

    @Id
    @Column(nullable = false, updatable = false)
    private String roleId;
    @Column(nullable = false, unique = true)
    private String roleName;
    @Column
    private String desc;
    @Column
    private boolean isAdministrator;
    @Column
    private LocalDate createAt;
    @Column
    private LocalDate updateAt;

    public Role(String roleName, String desc, boolean isAdministrator) {
        Random random= new Random();
        this.roleId = "role-" + random.nextInt(10000);
        this.roleName = roleName;
        this.desc = desc;
        this.isAdministrator = isAdministrator;
    }

}
