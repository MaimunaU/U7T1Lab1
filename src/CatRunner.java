import java.util.ArrayList;

public class CatRunner {
    public static void main(String [] args) {
        ArrayList<Cat> cats = new ArrayList<Cat> ();
        Cat cat1 = new Cat("Sally Wally");
        Cat cat2 = new Cat("Dog");
        Cat cat3 = new Cat("Mike");
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        System.out.println(cats);
        Cat cat4 = new Cat("Toby");
        Cat newCat = cats.set(2, cat4);
        System.out.println(cats);
        System.out.println(newCat);
        cat2.setName("Dog Meow");
        cats.set(1, cat2);
        System.out.println(cats);
        cats.add(new Cat("Sam"));
        System.out.println(cats);
    }
}
