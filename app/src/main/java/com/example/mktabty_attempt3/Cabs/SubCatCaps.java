package com.example.mktabty_attempt3.Cabs;

/**
 * Created by Aws on 28/01/2018.
 */

public class SubCatCaps {

    private String Title;
    private String Category ;
    private String Description ;
    private int Thumbnail ;

    public SubCatCaps() {
    }

    public SubCatCaps(String title, String category, String description, int thumbnail) {
        Title = title;
        Category = category;
        Description = description;
        Thumbnail = thumbnail;
    }


    public String getTitle() {
        return Title;
    }

    public String getCategory() {
        return Category;
    }

    public String getDescription() {
        return Description;
    }

    public int getThumbnail() {
        return Thumbnail;
    }


    public void setTitle(String title) {
        Title = title;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void setThumbnail(int thumbnail) {
        Thumbnail = thumbnail;
    }
}
