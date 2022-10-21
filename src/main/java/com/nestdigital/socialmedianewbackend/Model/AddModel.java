package com.nestdigital.socialmedianewbackend.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigInteger;

@Entity
@Table(name = "user")
public class AddModel {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String dob;
    private BigInteger phnno;
    private String place;
    private String email;
    private String password;

    public AddModel() {
    }

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

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public BigInteger getPhnno() {
        return phnno;
    }

    public void setPhnno(BigInteger phnno) {
        this.phnno = phnno;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public AddModel(int id, String name, String dob, BigInteger phnno, String place, String email, String password) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.phnno = phnno;
        this.place = place;
        this.email = email;
        this.password = password;
    }
}
