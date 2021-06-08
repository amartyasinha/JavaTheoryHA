class ObjCounter {
    static int count = 0;

    ObjCounter() { count++; }
}

public class HA7dObjCount {
    static int count = 0;

    HA7dObjCount() { count++; }

    public static void main(String[] args) {
        ObjCounter obj1 = new ObjCounter();
        ObjCounter obj2 = new ObjCounter();
        ObjCounter obj3 = new ObjCounter();
        ObjCounter obj4 = new ObjCounter();

        HA7dObjCount objNo1 = new HA7dObjCount();
        HA7dObjCount objNo2 = new HA7dObjCount();

        System.out.println("You have created " + ObjCounter.count + " Objects of ObjCounter class");
        System.out.println("You have created " + HA7dObjCount.count + " Objects of public HA7dObjCount class");
    }
}
