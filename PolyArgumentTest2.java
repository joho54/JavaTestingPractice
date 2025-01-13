class Product {
    int price;
    int bonusPoint;

    Product(int price){
        this.price = price;
        this.bonusPoint = (int) (price/10.0);
    }

    public Product() {
        price = 0;
        bonusPoint = 0;
    }
}

class Tv extends Product{
    Tv(){
        super(100);
    }

    public String toString(){
        return "Tv";
    }
}

class Computer extends Product{

    public Computer() {
        super(200);
    }

    public String toString(){
        return "Computer";
    }
}


class Audio extends Product{

    public Audio() {
        super(50);
    }

    public String toString(){
        return "Audio";
    }
}



class Buyer{
    int money = 1000;
    int bonusPoint = 0;
    Product[] item = new Product[10];
    int i = 0;

    void buy(Product p){
        if(money < p.price){
            System.out.println("Not enough balance.");
            return;
        }

        money -= p.price;
        bonusPoint += p.bonusPoint;
        item[i++] = p;
        System.out.println("You have purchased " + p);
    }

    void summary(){
        int sum = 0;
        String itemList = "";
        for (int i = 0; i < item.length; i++){
            if(item[i] == null) break;
            sum += item[i].price;
            itemList += item[i] + ", ";
        }

        System.out.println("Total Price: "+ sum);
        System.out.println("Item List: "+ itemList);
    }
}



public class PolyArgumentTest2 {
    public static void main(String[] args) {
        Buyer b = new Buyer();
        Tv tv = new Tv();
        Computer com = new Computer();
        Audio audio = new Audio();
        b.buy(tv);
        b.buy(com);
        b.buy(audio);
        b.summary();
    }
}
