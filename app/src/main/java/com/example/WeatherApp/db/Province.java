package com.example.WeatherApp.db;

import org.litepal.crud.LitePalSupport;

public class Province extends LitePalSupport{

    /**
     * 存储province数据的实体类
     * id为每个实体类必须的属性
     * xxxxName为该省,市,县的名称
     * xxxxCode为该省,市,县所对应的代码
     * 其他类的结构一模一样
     * 相关的属性通过set,get方法进行获取或设置
     * **/

    private int id;

    private String provinceName;

    private int provinceCode;

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
