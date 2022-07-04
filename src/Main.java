import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashMap myFamily = new HashMap();

        myFamily.put("Bublik", 13);
        myFamily.put("Plusha", 44);
        myFamily.put("Zontik", 7);

        myFamily.remove("Zontik");
        System.out.println(myFamily.toString());

    }
}