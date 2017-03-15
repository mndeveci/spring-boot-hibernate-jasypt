package com.mndeveci.spring.boot.rest.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "City")
public class CityWoEnc {

    @Id
    private Integer cityCode;

    private String name;

    public Integer getCityCode() {
        return cityCode;
    }

    public void setCityCode(Integer cityCode) {
        this.cityCode = cityCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CityWoEnc cityWoEnc = (CityWoEnc) o;
        return Objects.equals(cityCode, cityWoEnc.cityCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cityCode);
    }
}
