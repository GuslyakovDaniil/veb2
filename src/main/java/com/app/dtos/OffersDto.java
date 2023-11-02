package com.app.dtos;

import com.app.enums.Engine;
import com.app.enums.Transmission;
import io.r2dbc.spi.Parameter;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;

public class OffersDto {
    private int id;
    private String description;
    private Engine engine;
    private String imageUrl;
    private Integer mileage;
    private BigDecimal price;
    private Transmission transmission;
    private Integer year;
    private int model_id;
    private int seller_id;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date created;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date modified;

    public OffersDto(Date created, String description, Engine engine, String imageUrl, Integer mileage,
                     Date modified, BigDecimal price, Transmission transmission, Integer year, Integer model_id, Integer seller_id) {
        this.created = created;
        this.description = description;
        this.engine = engine;
        this.imageUrl = imageUrl;
        this.mileage = mileage;
        this.modified = modified;
        this.price = price;
        this.transmission = transmission;
        this.year = year;
        this.model_id = model_id;
        this.seller_id = seller_id;
    }

    public OffersDto() {}

    public int getModel_id() {
        return model_id;
    }

    public void setModel_id(int model_id) {
        this.model_id = model_id;
    }

    public int getSeller_id() {
        return seller_id;
    }

    public void setSeller_id(int seller_id) {
        this.seller_id = seller_id;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Integer getMileage() {
        return mileage;
    }

    public void setMileage(Integer mileage) {
        this.mileage = mileage;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }
}
