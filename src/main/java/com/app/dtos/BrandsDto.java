package com.app.dtos;

import java.util.Date;
import java.util.List;

public class BrandsDto {
    private int id;
    private String description;
    private Date created;
    private Date modified;
    private String name;
    private List<ModelsDto> models;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ModelsDto> getModels() {
        return models;
    }

    public void setModels(List<ModelsDto> models) {
        this.models = models;
    }
    public BrandsDto(){}
    public BrandsDto(Date created, Date modified,String description, String name){
        this.created = created;
        this.modified = modified;
        this.name = name;
        this.description=description;
    }
}
