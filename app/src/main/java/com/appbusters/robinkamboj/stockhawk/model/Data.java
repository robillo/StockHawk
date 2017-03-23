package com.appbusters.robinkamboj.stockhawk.model;

public class Data {

    private String stock_symbol, stock_name, seeds, percent;

    public Data(String stock_symbol, String stock_name, String seeds, String percent) {
        this.stock_symbol = stock_symbol;
        this.stock_name = stock_name;
        this.seeds = seeds;
        this.percent = percent;
    }

    public String getStock_symbol() {
        return stock_symbol;
    }

    public void setStock_symbol(String stock_symbol) {
        this.stock_symbol = stock_symbol;
    }

    public String getStock_name() {
        return stock_name;
    }

    public void setStock_name(String stock_name) {
        this.stock_name = stock_name;
    }

    public String getSeeds() {
        return seeds;
    }

    public void setSeeds(String seeds) {
        this.seeds = seeds;
    }

    public String getPercent() {
        return percent;
    }

    public void setPercent(String percent) {
        this.percent = percent;
    }
}
