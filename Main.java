public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Animals Class Demo!");
        String myStr = "xyz";

        Animal myAnimal = new Animal();
        System.out.println("\n Animal name is : " + myAnimal.defaultName);

        Animal yogi = new Bear();
        System.out.println("\n default name (from Animal) is : " + yogi.defaultName);
        System.out.println("\n bear name (from Bear) is : " + ((Bear) yogi).bearName);

    }
}