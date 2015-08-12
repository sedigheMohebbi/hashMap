
import java.util.HashMap;

// project hashmap test
public class MainStudentAverageSorter {
    public static void main(String[] args) {
        HashMap<String, Integer> stringIntegerHashMap = new HashMap<String, Integer>();
        stringIntegerHashMap.put("student1",12);
        stringIntegerHashMap.put("student2",14);
        stringIntegerHashMap.put("student3",15);

        StudentAverageSorter studentAverageSorter = new StudentAverageSorter();
        System.out.println( "list of average : "+studentAverageSorter.sorByAverage(stringIntegerHashMap));


    }
}
