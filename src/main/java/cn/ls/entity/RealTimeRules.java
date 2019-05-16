package cn.ls.entity;

import java.util.Date;

public class RealTimeRules {
    private Integer id;

    private String preference;

    private String interested;

    private String may_interested;

    private Date created;

    private Date updated;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPreference() {
        return preference;
    }

    public void setPreference(String preference) {
        this.preference = preference;
    }

    public String getInterested() {
        return interested;
    }

    public void setInterested(String interested) {
        this.interested = interested;
    }

    public String getMay_interested() {
        return may_interested;
    }

    public void setMay_interested(String may_interested) {
        this.may_interested = may_interested;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }
}