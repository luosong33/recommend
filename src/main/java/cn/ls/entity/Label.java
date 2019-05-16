package cn.ls.entity;

import java.util.Date;

public class Label {
    private Integer id;

    private String label_classify;

    private String label_name;

    private Date created;

    private Date updated;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLabel_classify() {
        return label_classify;
    }

    public void setLabel_classify(String label_classify) {
        this.label_classify = label_classify;
    }

    public String getLabel_name() {
        return label_name;
    }

    public void setLabel_name(String label_name) {
        this.label_name = label_name;
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