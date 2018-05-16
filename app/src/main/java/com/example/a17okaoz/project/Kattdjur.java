package com.example.a17okaoz.project;

/**
 * Created by a17okaoz on 2018-05-16.
 */

public class Kattdjur {
    private int id;
    private String name;
    private String company;
    private String category;
    private String location;
    private int size;
    private String auxdata;

    //Constructor
    public Kattdjur (int inId, String inName, String inCompany, String inCategory, String inLocation, int inSize, String inAuxdata){
        id = inId;
        name = inName;
        company = inCompany;
        category = inCategory;
        location = inLocation;
        size = inSize;
        auxdata = inAuxdata;
    }

    public Kattdjur(String inName){
        name = inName;
    }

    public String toString() {
        return name;
    }

    public String info(){
        String str = name;
        str+="It´s latin name is ";
        str+= company;
        str+=" is located in ";
        str+= location;
        str+=" and has an height of ";
        str+= Integer.toString(size);
        str+="m.";
        str+=auxdata;
        return str;
    }
}
