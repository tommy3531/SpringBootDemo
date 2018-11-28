package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

public class Result {

    String congress;
    String chamber;
    String num_results;
    int offset;
    ArrayList<Member> Members;

    public String getChamber() {
        return chamber;
    }

    public void setChamber(String chamber) {
        this.chamber = chamber;
    }

    public String getNum_results() {
        return num_results;
    }

    public void setNum_results(String num_results) {
        this.num_results = num_results;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public ArrayList<Member> getMembers() {
        return Members;
    }

    public void setMembers(ArrayList<Member> members) {
        Members = members;
    }

    public String getCongress() {
        return congress;
    }

    public void setCongress(String congress) {
        this.congress = congress;
    }

}
