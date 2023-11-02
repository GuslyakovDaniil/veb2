package com.app.enums;

public enum Transmission {
    MANUAL("Ручное"),AUTOMATIC("Автоматическое");
    private String tranfer;

    Transmission(String tranfer){
        this.tranfer = tranfer;
    }
    public String toString(){
        return "" + tranfer;
    }
}
