package com.fengxingshifang.dirtychinese.entity;

import java.util.Date;

import org.springframework.web.multipart.MultipartFile;

public class Info {
    private String infoid;

    private String infoorcomm;

    private String title;

    private String digest;

    private String content;

    private String publisher;

    private String phoneid;

    private Date createtime;

    private Date lastupdatetime;

    private Integer browsecount;

    private Integer commentcount;

    private Integer supportcount;

    private String infostatus;

    private String commentlevel;

    private String isup;

    private Date createdAt;

    private Date updatedAt;
    
    public String getInfoid() {
        return infoid;
    }

    public void setInfoid(String infoid) {
        this.infoid = infoid == null ? null : infoid.trim();
    }

    public String getInfoorcomm() {
        return infoorcomm;
    }

    public void setInfoorcomm(String infoorcomm) {
        this.infoorcomm = infoorcomm == null ? null : infoorcomm.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getDigest() {
        return digest;
    }

    public void setDigest(String digest) {
        this.digest = digest == null ? null : digest.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher == null ? null : publisher.trim();
    }

    public String getPhoneid() {
        return phoneid;
    }

    public void setPhoneid(String phoneid) {
        this.phoneid = phoneid == null ? null : phoneid.trim();
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

    public Integer getBrowsecount() {
        return browsecount;
    }

    public void setBrowsecount(Integer browsecount) {
        this.browsecount = browsecount;
    }

    public Integer getCommentcount() {
        return commentcount;
    }

    public void setCommentcount(Integer commentcount) {
        this.commentcount = commentcount;
    }

    public Integer getSupportcount() {
        return supportcount;
    }

    public void setSupportcount(Integer supportcount) {
        this.supportcount = supportcount;
    }

    public String getInfostatus() {
        return infostatus;
    }

    public void setInfostatus(String infostatus) {
        this.infostatus = infostatus == null ? null : infostatus.trim();
    }

    public String getCommentlevel() {
        return commentlevel;
    }

    public void setCommentlevel(String commentlevel) {
        this.commentlevel = commentlevel == null ? null : commentlevel.trim();
    }

    public String getIsup() {
        return isup;
    }

    public void setIsup(String isup) {
        this.isup = isup == null ? null : isup.trim();
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