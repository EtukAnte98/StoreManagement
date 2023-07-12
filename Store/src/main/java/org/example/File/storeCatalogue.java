package org.example.File;

import org.example.Structure.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import static org.example.Structure.Store.availableQuantity;
import static org.example.Structure.Store.products;

public class storeCatalogue {
    public static void storeStock() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("//Users/mac/IdeaProjects/Store/src/main/java/org/example/File/ProducList.csv"));
            String line;
            reader.readLine();
            ArrayList<String[]> arrays = new ArrayList<>();
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                arrays.add(data);
                availableQuantity.put(data[1], Integer.valueOf(data[0]));
            }
            arrays.remove(0);

            for (int i = 0; i < arrays.size(); i++) {
                Product product = new Product();
                String[] description = arrays.get(i)[1].split("-");
                product.setProductName(description[1]);
                product.setColor(description[0]);
                product.setSize(description[2]);
                product.setPrice(Double.parseDouble(arrays.get(i)[2]));
                products.add(product);
            }
            System.out.println(products);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}