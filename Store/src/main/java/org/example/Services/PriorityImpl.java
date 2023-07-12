package org.example.Services;

import org.example.Structure.Customer;
import org.example.Structure.Product;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

import static org.example.Structure.Store.customers;

public class PriorityImpl implements Purchases{
    //product queue
    public static Queue<Product> priorityQ = new PriorityQueue<>(Comparator.reverseOrder());

    @Override
    public void joinQueue() {
        for(Customer customer: customers) {
                priorityQ.addAll(customer.getCartItems());
            }
        }
    @Override
    public void leaveQueue() {
        while (priorityQ.peek() != null){
            Product removedProduct = priorityQ.poll();
            customers.forEach(customer -> {
                    if(removedProduct.getId() == customer.getId()){
                        System.out.println(customer.getFullName() + " purchased " + removedProduct);
                }
            });
        }
    }
}
