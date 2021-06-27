interface LandHabitat {
    void walk();
}

interface WaterHabitat {
    void swim();
}

class Amphibians implements LandHabitat, WaterHabitat{
    public void walk() {
        System.out.println("I can walk");
    }

    public void swim() {
        System.out.println("I can swim as well");
    }

    void myProperties() {
        System.out.println("As I am an Amphibian, I have ability to walk as well as to swim. Don't underestimate me!");
    }
}
public class HA9bMultipleInheritance {
    public static void main(String[] args) {

        Amphibians ap = new Amphibians();
        ap.swim();
        ap.walk();
        ap.myProperties();
    }
}
