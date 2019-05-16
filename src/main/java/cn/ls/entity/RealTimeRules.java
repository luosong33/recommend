package cn.ls.entity;

import java.util.Date;

public class RealTimeRules {
    private String id;

    private String preference;

    private String interested;

    private Integer mayInterested;

    private Date created;

    private Date updated;

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public Integer getMayInterested() {
        return mayInterested;
    }

    public void setMayInterested(Integer mayInterested) {
        this.mayInterested = mayInterested;
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