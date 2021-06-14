package com.example.orca;

public class CategoryModel {
private String categoryId,categoryName,categoryPrice,categoryImage;

    public CategoryModel(String categoryId, String categoryName, String categoryPrice, String categoryImage) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.categoryPrice = categoryPrice;
        this.categoryImage = categoryImage;
    }
//
    public CategoryModel(){
        //todo
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryPrice() {
        return categoryPrice;
    }

    public void setCategoryPrice(String categoryPrice) {
        this.categoryPrice = categoryPrice;
    }

    public String getCategoryImage() {
        return categoryImage;
    }

    public void setCategoryImage(String categoryImage) {
        this.categoryImage = categoryImage;
    }
}
