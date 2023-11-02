package com.app.dtos;

import com.app.enums.Category;
import jakarta.persistence.Column;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class ModelsDto {
    private int id;
    private Category category;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created", updatable = false)
    private Date created;
    private int end_year;
    private String image_url;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "modified")
    private Date modified;
    private String name;
    private int start_year;
    private Integer brand_id;
    private OffersDto offers;
    private OffersDto model_id;

    public int getId() {return id;}
    public void setId(int id) {this.id = id;}
    public Category getCategory() {return category;}
    public void setCategory(Category category) {this.category = category;}
    public Date getCreated() {return created;}
    public void setCreated(Date created) {this.created = created;}
    public int getEnd_year() {return end_year;}
    public void setEnd_year(int end_year) {this.end_year = end_year;}
    public String getImage_url() {return image_url;}
    public void setImage_url(String image_url) {this.image_url = image_url;}
    public Date getModified() {return modified;}
    public void setModified(Date modified) {this.modified = modified;}
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public int getStart_year() {return start_year;}
    public void setStart_year(int start_year) {this.start_year = start_year;}
    public Integer getBrandId() {
        return brand_id;
    }

    public void setBrandId(Integer brandId) {
        this.brand_id = brandId;
    }
    public OffersDto getOffers() {return offers;}
    public void setOffers(OffersDto offers) {this.offers = offers;}
    public OffersDto getModel_id() {return model_id;}
    public void setModel_id(OffersDto model_id) {this.model_id = model_id;}

    public ModelsDto() {}
    public ModelsDto(Category category, Date created, Integer end_year, String image_url, Date modified,
                     String name, Integer start_year, Integer brand_id) {
        this.category = category;
        this.created = created;
        this.end_year = end_year;
        this.image_url = image_url;
        this.modified = modified;
        this.name = name;
        this.start_year = start_year;
        this.brand_id = brand_id;
    }
}
