/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7p2_melvinrivas;

/**
 *
 * @author l3306
 */
public class producto {
    
    public int id;
    public String name;
    public int category;
    public double price;
    public int aisle;
    public int bin;

    public producto() {
    }

    public producto(int id, String name, int category, double price, int aisle, int bin) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
        this.aisle = aisle;
        this.bin = bin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAisle() {
        return aisle;
    }

    public void setAisle(int aisle) {
        this.aisle = aisle;
    }

    public int getBin() {
        return bin;
    }

    public void setBin(int bin) {
        this.bin = bin;
    }

    @Override
    public String toString() {
        return  id + ";"+ name+ ";" +  category + ";"+  price + ";"+  aisle+ ";"  + bin + ";";
    }
    
    
    
}
