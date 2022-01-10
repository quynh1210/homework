package com.codegym;

public class Product {
    public class product {
        private int id;
        private String name;
        private int price;
        private String description;

        public Product(int id, String name, int price, String description) {
            this.id = id;
            this.name = name;
            this.price = price;
            this.description = description;
        }

        public String[] addProduct(String[] array) {
            String[] newArray = new String[array.length + 1];
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            newArray[array.length] = this.name;
            return newArray;
        }

        public String[] delProduct(String[] array) {
            String[] newArray = new String[array.length - 1];
            for (int i = 0; i < array.length - 1; i++) {
                newArray[i] = array[i];
                if (array[i].equals(this.name)) {
                    newArray[i] = array[i + 1];
                    i = i + 1;
                }
            }
            return newArray;
        }

        public void findProduct(String[] array) {
            boolean isFound = false;
            for (int i = 0; i < array.length; i++) {
                if (array[i].equals(this.name)) {
                    System.out.println("The product is in the array");
                    isFound = true;
                    break;
                }
            }
            if (isFound == false)
                System.out.println("Not found");
        }
    }
}