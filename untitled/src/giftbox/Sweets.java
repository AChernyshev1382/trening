package giftbox;

public class Sweets {

    private double price;
    private double weight;
    private String neme;

    public Sweets(double price, double weight, String neme) {
        this.price = price;
        this.weight = weight;
        this.neme = neme;
    }

    public String getNeme() {
        return neme;
    }

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }

    void printСompositionGift(){

        System.out.println("Вес: " + getWeight());
        System.out.println("Цена: " + getPrice());
        System.out.println("Название подарка: " +getNeme());

    }




}
