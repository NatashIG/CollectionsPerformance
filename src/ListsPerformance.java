import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class ListsPerformance {
    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<Integer>();

        Random rand = new Random(14000);
        for (int i = 0; i < 14000; i++) {
            Integer x = rand.nextInt(14000);
            arrayList.add(x);
        }
        System.out.println(arrayList);

        LinkedList<Object> linkedList = new LinkedList<Object>();

        Random rand1 = new Random(14000);
        for (int i = 0; i < 14000; i++) {
            Integer x = rand1.nextInt(14000);
            linkedList.add(x);
        }
        System.out.println(linkedList);

        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");
        Date date = new Date();
        System.out.println(dateFormat.format(date));


        arrayList.add(5698, 10);
        arrayList.remove(4);
        int index = arrayList.indexOf(10);

        System.out.println(index);
        System.out.println(arrayList);

        System.out.println(dateFormat.format(date));

        linkedList.add(1, "red");
        linkedList.remove(4);
        int index1 = linkedList.indexOf(6316);

        System.out.println(index1);
        System.out.println(linkedList);

        System.out.println(dateFormat.format(date));
    }
}



