package com.codegym;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String[] newProducts = new String[0];


        Product pudding = new Product(1, " Pudding", 200, " dessert");
        Product pave = new Product(2, " Pave", 230, " Pave is a Brazilian dessert");
        Product mousse = new Product(3, " Mousse", 300, " A soft dessert");
        Product pannaCotta = new Product(4, " Panna cotta", 250, " an Italian sweet");
        Product tiramisu = new Product(4, " Tiramisu", 259, " an Italian coffee-flavoured dessert cake");

        newProducts = pudding.addProduct(newProducts);
        newProducts = pave.addProduct(newProducts);
        newProducts = mousse.addProduct(newProducts);
        newProducts = pannaCotta.addProduct(newProducts);
        newProducts = tiramisu.addProduct(newProducts);

        Arrays.sort(newProducts);

        System.out.println(Arrays.toString(newProducts));


    }
}
