package com.app.models;

import jakarta.persistence.*;

import java.util.Date;

@MappedSuperclass
public class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    protected int id;

    @Column(name = "created")
    @Temporal(TemporalType.TIMESTAMP)
    public Date created;

    @Column(name = "modified")
    @Temporal(TemporalType.TIMESTAMP)
    public Date modified;

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @PrePersist
    public void prePersist() {
        Date currentDate = new Date();
        this.created = currentDate;
        this.modified = currentDate;
    }

    @PreUpdate
    public void preUpdate() {
        this.modified = new Date();
    }
}
