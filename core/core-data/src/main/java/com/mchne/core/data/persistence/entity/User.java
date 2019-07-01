package com.mchne.core.data.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name="MCHNE_USERINFO")
public class User {

    @Id
    @Column(name=  "USERID")
    @GeneratedValue
    private Integer id;

    @Column(name=  "USERNAME")
    private String userName;

    @Column(name=  "FIRSTNAME")
    private String firstName;

    @Column(name=  "LASTNAME")
    private String lastName;

    @Column(name=  "EMAIL")
    private String email;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public User(String userName, String firstName, String lastName, String email){
        this.userName = userName;
        this.firstName= firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public User(){

    }


}
