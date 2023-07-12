package org.example.Services;

import org.example.Structure.Customer;

import java.util.LinkedList;
import java.util.Queue;

import static org.example.Structure.Store.customers;

public class FifoImpl implements Purchases {
 public static Queue<Customer> fifo = new LinkedList<>();
    @Override
    public void joinQueue() {fifo.addAll(customers);
        }

    @Override
    public void leaveQueue() {
        while (fifo.peek() != null){
            System.out.println(fifo.poll());
        }
    }
}
