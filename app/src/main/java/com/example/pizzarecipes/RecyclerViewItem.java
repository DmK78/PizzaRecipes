package com.example.pizzarecipes;

public class RecyclerViewItem {

    private int imageRecource;
    private String text1;
    private String text2;
    private String text3;

    public RecyclerViewItem (int imageRecource, String text1, String text2, String text3){

        this.imageRecource=imageRecource;
        this.text1=text1;
        this.text2=text2;
        this.text3=text3;
    }

    public int getImageRecource() {
        return imageRecource;
    }

    public String getText1() {
        return text1;
    }

    public String getText2() {
        return text2;
    }

    public String getText3() {
        return text3;
    }
}
