import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class SetsPerformance {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<Integer>();

        Random rand = new Random(14000);
        for (int i = 0; i < 14000; i++) {
            Integer x = rand.nextInt(14000);
            set.add(x);
        }
        System.out.println(set);

        TreeSet<Integer> treeSet = new TreeSet<Integer>();

        Random rand1 = new Random(14000);
        for (int i = 0; i < 14000; i++) {
            Integer x = rand1.nextInt(14000);
            treeSet.add(x);
        }
        System.out.println(treeSet);

        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");
        Date date = new Date();
        System.out.println(dateFormat.format(date));

        set.add(15000);
        set.remove(13999);

        System.out.println(set);

        System.out.println(dateFormat.format(date));

        treeSet.add(15000);
        treeSet.remove(13999);

        System.out.println(treeSet);

        System.out.println(dateFormat.format(date));
    }
}

//        1.	Lists (ArrayList vs LinkedList);
//        2.	Sets (HashSet vs TreeSet);
//        3.	Maps (HashMap vs TreeMap).
