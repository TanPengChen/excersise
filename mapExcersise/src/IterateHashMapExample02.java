import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * 在JAVA中遍历hashMap的5种最佳方法
 */

public class IterateHashMapExample02 {

    public static void main(String[] args) {
        // 1. 使用 Iterator 遍历 HashMap EntrySet
        Map< Integer, String > coursesMap = new HashMap < Integer, String > ();
        coursesMap.put(1, "C");
        coursesMap.put(2, "C++");
        coursesMap.put(3, "Java");
        coursesMap.put(4, "Spring Framework");
        coursesMap.put(5, "Hibernate ORM framework");
        //使用Iterator 遍历HashMap EntrySet

        Iterator<Map.Entry<Integer, String>> iterator = coursesMap.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<Integer, String> next = iterator.next();
            System.out.print(next.getKey() + "=");
            System.out.print(next.getValue() + ",");
        }
    }
}
