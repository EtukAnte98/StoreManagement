package org.example.Structure;

public class Product implements Comparable<Product>{
    private int Unit;
    private String ProductName;
    private String Color;
    private String Size;
    private double Price;
    private int id;


    public int getUnit() {
        return Unit;
    }

    public void setUnit(int unit) {
        Unit = unit;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public String getSize() {
        return Size;
    }

    public void setSize(String size) {
        Size = size;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Product{" +
                "Unit='" + Unit + '\n' +
                " ProductName='" + ProductName + '\n' +
                " Color='" + Color + '\n' +
                " Size='" + Size + '\n' +
                " Price='" + Price + '\n' +
                '}';
    }


    @Override
    public int compareTo(Product o) {
        return Integer.compare(this.Unit, o.getUnit());
    }
}


