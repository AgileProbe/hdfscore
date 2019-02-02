package com.cs.nju.entity;

/**
 * Created by lch on 2017/6/21.
 */
public class Data {

    //router 如果没有�?要补�?
    private String router;
    private String mac;
    private String rssi;
    private String range;
    //下面4个字段如果没有需要补�?
    private String ts; //表示手机连接的WiFi ssid
    private String tmc;//手机连的wifi的mac地址
    private String tc;
    private String ds;

    public Data() {
    }

    public String getRouter() {
        return router;
    }

    public void setRouter(String router) {
        this.router = router;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public String getRssi() {
        return rssi;
    }

    public void setRssi(String rssi) {
        this.rssi = rssi;
    }

    public String getRange() {
        return range;
    }

    public void setRange(String range) {
        this.range = range;
    }

    public String getTs() {
        return ts;
    }

    public void setTs(String ts) {
        this.ts = ts;
    }

    public String getTmc() {
        return tmc;
    }

    public void setTmc(String tmc) {
        this.tmc = tmc;
    }

    public String getTc() {
        return tc;
    }

    public void setTc(String tc) {
        this.tc = tc;
    }

    public String getDs() {
        return ds;
    }

    public void setDs(String ds) {
        this.ds = ds;
    }

    @Override
    public String toString() {
        return "Data{" +
                "router='" + router + '\'' +
                ", mac='" + mac + '\'' +
                ", rssi='" + rssi + '\'' +
                ", range='" + range + '\'' +
                ", ts='" + ts + '\'' +
                ", tmc='" + tmc + '\'' +
                ", tc='" + tc + '\'' +
                ", ds='" + ds + '\'' +
                '}';
    }
}
