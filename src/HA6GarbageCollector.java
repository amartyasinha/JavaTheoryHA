public class HA6GarbageCollector {

    //overriding finalize() method from java.lang.Object
    @Override
    public void finalize(){
        System.out.println("Obj is Garbage Collected");
    }

    public static void main(String[] args){
        //using garbage collector by initializing obj to null
        HA6GarbageCollector a = new HA6GarbageCollector();
        a = null;

        //assigning b = c makes the ojb referred by a ready for garbage collector
        HA6GarbageCollector b = new HA6GarbageCollector();
        HA6GarbageCollector c = new HA6GarbageCollector();
        b = c;

        //creating anonymous ojb to use garbage collector
        new HA6GarbageCollector();

        //calling gc() function for garbage collection
        System.gc();
    }
}