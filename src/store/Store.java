package store;

import interfaces.Sellable;

import java.util.Arrays;

public class Store<T extends Sellable> {

    private int cashBox;
    private T[] products;

    public Store(T[] products, int cashBox) {
        this.cashBox = cashBox;
        this.products = products;
    }

    public void printProducts() {
        for (int i = 0; i < products.length; i++) {
            System.out.println(i + ". " + products[i].getName() + " " + products[i].getPrice());
        }
    }

    public T purchase(int index, int cash) {
        if (index >= products.length) {
            System.out.println("Such product doesn't exist");
            return null;
        }
        T product = products[index];
        if (cash < product.getPrice()) {
            System.out.println("You don't have enough money");
            return null;
        }
        cashBox += product.getPrice();
        T[] tempProducts = (T[]) new Sellable[products.length - 1];
        System.arraycopy(products, 0, tempProducts, 0, index);
        System.arraycopy(products, index + 1, tempProducts, index, products.length - index - 1);
        products = tempProducts;
        System.out.println("You've bought " + product.getName() + " for " + product.getPrice() + " dollars");
        return product;
    }

    public void sell(T product, int sellPrice) {
        if (sellPrice > product.getPrice()) {
            System.out.println("Your price is overpriced");
            return;
        }
        if (sellPrice > cashBox) {
            System.out.println("Don't enough money at the cash box at the moment");
            return;
        }
        cashBox -= sellPrice;
        products = Arrays.copyOf(products, products.length + 1);
        products[products.length - 1] = product;
        System.out.println("We've bought your product for " + sellPrice + " dollars");
    }

    public int getCashBox() {
        return cashBox;
    }

    public T[] getProducts() {
        return products;
    }
}
