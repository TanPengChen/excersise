import java.util.HashMap;
import java.util.Map;

/**
 * 在JAVA中遍历hashMap的5种最佳方法
 */

public class IterateHashMapExample05 {

    public static void main(String[] args) {
        // 1. 使用 Iterator 遍历 HashMap EntrySet
        Map< Integer, String > coursesMap = new HashMap < Integer, String > ();
        coursesMap.put(1, "C");
        coursesMap.put(2, "C++");
        coursesMap.put(3, "Java");
        coursesMap.put(4, "Spring Framework");
        coursesMap.put(5, "Hibernate ORM framework");
        //使用Iterator 遍历HashMap EntrySet

        // 5. 使用 Stream API 遍历 HashMap
        coursesMap.entrySet().stream().forEach((entry)->{
            System.out.print(entry.getKey() + "=");
            System.out.print(entry.getValue() + ",");

        });
    }
}
