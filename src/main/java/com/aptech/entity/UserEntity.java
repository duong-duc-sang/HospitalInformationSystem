/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aptech.entity;

import java.time.LocalDateTime;
import javax.persistence.*;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

/**
 *
 * @author ducsang
 */
@Entity(name = TableConst.AP_USER)
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, unique = true)
    private int id;

    public static final String COLUMNNAME_Value = "Value";
    @Column(name = "Value")
    private String value;
    
    public static final String COLUMNNAME_Name = "Name";
    @Column(name = "Name")
    private String name;

    public static final String COLUMNNAME_Password = "Password";
    @Column(name = "Password")
    private String password;

    public static final String COLUMNNAME_Email = "Email";
    @Column(name = "Email")
    private String email;

    public static final String COLUMNNAME_Address = "Address";
    @Column(name = "Address")
    private String address;
    
    public static final String COLUMNNAME_IsActive = "IsActive";
    @Column(name = "IsActive")
    private String isActive;
    
    public static final String COLUMNNAME_IsDeleted = "IsDeleted";
    @Column(name = "IsDeleted")
    private String isDeleted;

    @Column(name = "CreatedBy")
    @CreatedBy
    private int createdBy;

    @Column(name = "Created")
    @CreatedDate
    private LocalDateTime created;

    @Column(name = "UpdatedBy")
    @LastModifiedBy
    private int updatedBy;

    @Column(name = "Updated")
    @LastModifiedDate
    private LocalDateTime updated;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    public int getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(int updatedBy) {
        this.updatedBy = updatedBy;
    }

    public LocalDateTime getUpdated() {
        return updated;
    }

    public void setUpdated(LocalDateTime updated) {
        this.updated = updated;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getIsActive() {
        return isActive;
    }

    public void setIsActive(String isActive) {
        this.isActive = isActive;
    }

    public String getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted;
    }

    public UserEntity() {
    }

}
