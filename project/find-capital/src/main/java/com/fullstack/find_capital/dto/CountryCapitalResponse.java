package com.fullstack.find_capital.dto;

import java.util.List;

public class CountryCapitalResponse {

    private boolean error;

    private String msg;

    private List<CountryCapitalObj> data;

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<CountryCapitalObj> getData() {
        return data;
    }

    public void setData(List<CountryCapitalObj> data) {
        this.data = data;
    }

    

}
