package com.example.learningclasses.products.models;

import java.util.List;

public class ProductResponseModelitem{
	private double discountPercentage;
	private String thumbnail;
	private List<String> images;
	private int price;
	private double rating;
	private String description;
	private int id;
	private String title;
	private int stock;
	private String category;
	private String brand;

	public void setDiscountPercentage(double discountPercentage){
		this.discountPercentage = discountPercentage;
	}

	public double getDiscountPercentage(){
		return discountPercentage;
	}

	public void setThumbnail(String thumbnail){
		this.thumbnail = thumbnail;
	}

	public String getThumbnail(){
		return thumbnail;
	}

	public void setImages(List<String> images){
		this.images = images;
	}

	public List<String> getImages(){
		return images;
	}

	public void setPrice(int price){
		this.price = price;
	}

	public int getPrice(){
		return price;
	}

	public void setRating(double rating){
		this.rating = rating;
	}

	public double getRating(){
		return rating;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	public void setStock(int stock){
		this.stock = stock;
	}

	public int getStock(){
		return stock;
	}

	public void setCategory(String category){
		this.category = category;
	}

	public String getCategory(){
		return category;
	}

	public void setBrand(String brand){
		this.brand = brand;
	}

	public String getBrand(){
		return brand;
	}

	@Override
 	public String toString(){
		return 
			"ProductResponseModelitem{" + 
			"discountPercentage = '" + discountPercentage + '\'' + 
			",thumbnail = '" + thumbnail + '\'' + 
			",images = '" + images + '\'' + 
			",price = '" + price + '\'' + 
			",rating = '" + rating + '\'' + 
			",description = '" + description + '\'' + 
			",id = '" + id + '\'' + 
			",title = '" + title + '\'' + 
			",stock = '" + stock + '\'' + 
			",category = '" + category + '\'' + 
			",brand = '" + brand + '\'' + 
			"}";
		}
}