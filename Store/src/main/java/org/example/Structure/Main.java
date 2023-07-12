package org.example.Structure;

import org.example.Services.FifoImpl;
import org.example.Services.PriorityImpl;

import java.io.IOException;

import static org.example.Structure.Store.*;
import static org.example.File.storeCatalogue.storeStock;

public class Main {
    public static void main (String[]args) throws IOException {
        storeStock();
        System.out.println(availableQuantity);
        Customer customer1= new Customer("Isaac Newton");
        customer1.chooseAProduct(products.get(2), 30,101);
        customers.add(customer1);

        Customer customer2= new Customer("Bolaji Jones");
        customer2.chooseAProduct(products.get(1),20,102);
        customers.add(customer2);

        Customer customer3= new Customer("Jubril Bucknor");
        customer3.chooseAProduct(products.get(3),50,103);
        customers.add(customer3);

        Customer customer4= new Customer("David Peterson");
        customer4.chooseAProduct(products.get(0),52,104);
        customers.add(customer4);


        FifoImpl fifo = new FifoImpl();
        fifo.joinQueue();
        fifo.leaveQueue();
        System.out.println("-------FIFO CLOSES------");
        System.out.println();
        System.out.println("-------PRIORITY BEGINS-------");
        PriorityImpl priority= new PriorityImpl();
        priority.joinQueue();
        priority.leaveQueue();
    }
}