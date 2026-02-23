public class Exe {
    public static void main(String[] args) {
        Cat cat1 = new Cat("ram",4,true);
        Cat cat2 = new Cat("Shyam", 6, false);
        Cat cat3 = new Cat("Chika", 5, false);
        Cat cat4 = new Cat("Nika", 7, false);
        Cat cat5 = new Cat("Yam", 8, true);

        System.out.println(cat1.getName());
        System.out.println(cat2.getName());
        System.out.println(cat3.getName());
        System.out.println(cat4.getName());
        System.out.println(cat5.getName());
        cat3.setName("Mula");
        cat5.setName("Yooooo");
        System.out.println(cat3.getName());
        System.out.println(cat5.getName());
    }
}
