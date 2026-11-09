public class Task16 {
    public static void main(String[] args) {
        Animal myGorilla = new Gorilla();
        
        myGorilla.feed(true);
        myGorilla.groom();
        myGorilla.pet();
    }
}

interface Animal {
    boolean feed(boolean timeToEat);
    void groom();
    void pet();
}

class Gorilla implements Animal {

    @Override
    public boolean feed(boolean timeToEat) {
        if (timeToEat) {
            System.out.println("The gorilla eats the food.");
            return true;
        }
        System.out.println("It's not feeding time yet.");
        return false;
    }

    @Override
    public void groom() {
        System.out.println("Grooming process started.");
    }

    @Override
    public void pet() {
        System.out.println("Approaching to pet the gorilla...");
    }
}
