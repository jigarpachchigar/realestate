package com.example.realestate;

public class House {
    private double houseNo;
    private String houseAddress;
    private String imageName;
    private double price;
    private String description;

    public double getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(double houseNo) {
        this.houseNo = houseNo;
    }

    public String getHouseAddress() {
        return houseAddress;
    }

    public void setHouseAddress(String houseAddress) {
        this.houseAddress = houseAddress;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public  House(double houseNo, String houseAddress, String imageName, double price, String description)
    {
        this.houseNo = houseNo;
        this.houseAddress = houseAddress;
        this.imageName = imageName;
        this.price = price;
        this.description = description;

    }



}
