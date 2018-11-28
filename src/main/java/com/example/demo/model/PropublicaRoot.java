package com.example.demo.model;

import java.util.ArrayList;


public class PropublicaRoot {

    String status;
    String copyright;
    ArrayList<Result> Results;

    public String getStatus() {

        return status;
    }

    public void setStatus(String status) {

        this.status = status;
    }

    public String getCopyright() {

        return copyright;
    }

    public void setCopyright(String copyright) {

        this.copyright = copyright;
    }

    public ArrayList<Result> getResults() {

        return Results;
    }

    public void setResults(ArrayList<Result> results) {

        Results = results;
    }

}
