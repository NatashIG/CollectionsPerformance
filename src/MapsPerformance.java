import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class MapsPerformance {
    public static void main(String[] args) {

        Map<Integer, Integer> hashMap = new HashMap<Integer, Integer>();

        Random rand = new Random(14000);
        for (int i = 0; i < 14000; i++) {
            Integer x = rand.nextInt(14000);
            hashMap.put(x, i);
        }
        System.out.println(hashMap);

        Map<Integer, Integer> treeMap = new TreeMap<Integer, Integer>();

        Random rand1 = new Random(14000);
        for (int i = 0; i < 14000; i++) {
            Integer x = rand1.nextInt(14000);
            treeMap.put(x, i);
        }
        System.out.println(treeMap);

        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");
        Date date = new Date();
        System.out.println(dateFormat.format(date));

        hashMap.put(1, 30);
        hashMap.remove(2);
        hashMap.remove(3, 7577);

        System.out.println(hashMap);

        System.out.println(dateFormat.format(date));

        treeMap.put(1, 30);
        treeMap.remove(2);
        treeMap.remove(3, 7577);

        System.out.println(treeMap);

        System.out.println(dateFormat.format(date));
    }
}

