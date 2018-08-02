package com.example.nishant.tourguide;

/**
 * Created by nishant on 8/17/17.
 */

public class Word {
    int imageid=-1;
    String name_of_place;
    int address_of_place;
    String cost_of_place;

    public Word(int id,String n,int add,String cost1){
        imageid=id;
        name_of_place =n;
        address_of_place =add;
        cost_of_place =cost1;
    }
    public Word(int id,String n,int add){
        imageid=id;
        name_of_place =n;
        address_of_place =add;
    }
    public boolean hasImageid(){
        return imageid!=-1;
    }
    public int getImageid(){
        return imageid;
    }
    public String getName_of_place(){
        return name_of_place;
    }
    public int getAddress_of_place(){
        return address_of_place;
    }
    public String getCost_of_place()    { return cost_of_place; }
    public boolean hasCost(){
        if(cost_of_place !=null) return true;
        return false;
    }
}
