package com.winter.commodity.domain;

import java.util.Date;

/**
 * Commodity
 *
 * @author Gavin
 * @date 2019/1/11 15:20
 */
public class Commodity {
    private Long id;
    private String code;
    private Double price;
    private Date madeDate;
    private Boolean isSale;

    public Commodity() {

    }

    public Commodity(Long id, String code, Double price, Date madeDate, Boolean isSale) {
        this.id = id;
        this.code = code;
        this.price = price;
        this.madeDate = madeDate;
        this.isSale = isSale;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Date getMadeDate() {
        return madeDate;
    }

    public void setMadeDate(Date madeDate) {
        this.madeDate = madeDate;
    }

    public Boolean getSale() {
        return isSale;
    }

    public void setSale(Boolean sale) {
        isSale = sale;
    }
}
