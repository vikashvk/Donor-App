package com.bloodbank.model;


/**
 * Created by v2 on 9/18/2019.
 */

public class Donor {
    String name;
    String uId;
    String phNum;
    String eMail;
    String pwd;
    String rePwd;
    String bloodGroup;
    DonorLocation location;

    public Donor() {
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getRePwd() {
        return rePwd;
    }

    public void setRePwd(String rePwd) {
        this.rePwd = rePwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public String getPhNum() {
        return phNum;
    }

    public void setPhNum(String phNum) {
        this.phNum = phNum;
    }
    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public DonorLocation getLocation() {
        return location;
    }

    public void setLocation(DonorLocation location) {
        this.location = location;
    }

}
