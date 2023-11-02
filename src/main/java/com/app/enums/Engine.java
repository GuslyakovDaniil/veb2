package com.app.enums;

public enum Engine {
    GASOLINE("Газ"),DIESEL("Дизель"),ELECTRIC("Электрический"),HYBRID("Гибрид");

    private String tranfer;

    Engine(String tranfer){
        this.tranfer = tranfer;
    }
    public String toString(){
        return "" + tranfer;
    }
}
