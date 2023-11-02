package com.app.enums;

public enum Category {
    CAR("Машина"),BUSS("Автобус"),TRUCK("Грузовик"),MOTORCYCLE("Мотоцикл");

    private String tranfer;

    Category(String tranfer){
        this.tranfer = tranfer;
    }
    public String toString(){
        return "" + tranfer;
    }
}
