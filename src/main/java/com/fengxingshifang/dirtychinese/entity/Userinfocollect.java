package com.fengxingshifang.dirtychinese.entity;

import java.util.Date;

public class Userinfocollect {
    private String userinfocollectid;

    private String userid;

    private String phoneid;

    private String infoid;

    private Date colltime;

    private Date cancelcolltime;

    private String infocollstatus;

    private Date createdAt;

    private Date updatedAt;

    public String getUserinfocollectid() {
        return userinfocollectid;
    }

    public void setUserinfocollectid(String userinfocollectid) {
        this.userinfocollectid = userinfocollectid == null ? null : userinfocollectid.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getPhoneid() {
        return phoneid;
    }

    public void setPhoneid(String phoneid) {
        this.phoneid = phoneid == null ? null : phoneid.trim();
    }

    public String getInfoid() {
        return infoid;
    }

    public void setInfoid(String infoid) {
        this.infoid = infoid == null ? null : infoid.trim();
    }

    public Date getColltime() {
        return colltime;
    }

    public void setColltime(Date colltime) {
        this.colltime = colltime;
    }

    public Date getCancelcolltime() {
        return cancelcolltime;
    }

    public void setCancelcolltime(Date cancelcolltime) {
        this.cancelcolltime = cancelcolltime;
    }

    public String getInfocollstatus() {
        return infocollstatus;
    }

    public void setInfocollstatus(String infocollstatus) {
        this.infocollstatus = infocollstatus == null ? null : infocollstatus.trim();
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}