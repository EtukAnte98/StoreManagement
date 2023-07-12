package org.example.Structure;

import java.util.ArrayList;

public class Customer {

    private String fullName;
    private int productQuantity;
    private int id;
    private ArrayList<Product> cartItems = new ArrayList<>();


    public Customer(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }


    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public ArrayList<Product> getCartItems() {
        return cartItems;
    }

    public void setCartItems(ArrayList<Product> cartItems) {
        this.cartItems = cartItems;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Customer{" + "\n" +
                "fullName = " + fullName + '\n' +
                "productQuantity = " + productQuantity + "\n"+
                "cartItems =" + cartItems + "\n"+
                '}';
    }

    public void chooseAProduct(Product product, int productQuantity, int id){
        this.productQuantity = productQuantity;
        product.setUnit(productQuantity);
        this.id = id;
        product.setId(id);
        this.cartItems.add(product);
    }
}
