package com.fengxingshifang.dirtychinese.entity;

import java.util.Date;

public class Inforela {
    private String inforelaid;

    private String infoid;

    private String parentinfoid;

    private String sortno;

    private Date createtime;

    private Date lastupdatetime;

    private String inforelastatus;

    private Date createdAt;

    private Date updatedAt;

    public String getInforelaid() {
        return inforelaid;
    }

    public void setInforelaid(String inforelaid) {
        this.inforelaid = inforelaid == null ? null : inforelaid.trim();
    }

    public String getInfoid() {
        return infoid;
    }

    public void setInfoid(String infoid) {
        this.infoid = infoid == null ? null : infoid.trim();
    }

    public String getParentinfoid() {
        return parentinfoid;
    }

    public void setParentinfoid(String parentinfoid) {
        this.parentinfoid = parentinfoid == null ? null : parentinfoid.trim();
    }

    public String getSortno() {
        return sortno;
    }

    public void setSortno(String sortno) {
        this.sortno = sortno == null ? null : sortno.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getLastupdatetime() {
        return lastupdatetime;
    }

    public void setLastupdatetime(Date lastupdatetime) {
        this.lastupdatetime = lastupdatetime;
    }

    public String getInforelastatus() {
        return inforelastatus;
    }

    public void setInforelastatus(String inforelastatus) {
        this.inforelastatus = inforelastatus == null ? null : inforelastatus.trim();
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