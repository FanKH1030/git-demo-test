package com.bea.model;

/**
 * Created by fandi on 2019/11/16 0016.
 */
public class User {
    private String uid;
    private String loginname;
    private String loginpass;

    public User() {
    }

    public User(String uid, String loginname, String loginpass) {
        this.uid = uid;
        this.loginname = loginname;
        this.loginpass = loginpass;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname;
    }

    public String getLoginpass() {
        return loginpass;
    }

    public void setLoginpass(String loginpass) {
        this.loginpass = loginpass;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid='" + uid + '\'' +
                ", loginname='" + loginname + '\'' +
                ", loginpass='" + loginpass + '\'' +
                '}';
    }
}
