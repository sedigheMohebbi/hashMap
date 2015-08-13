
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

// project hashmap test
public class MainStudentAverageSorter {
    public static void main(String[] args) {
        HashMap<String, Integer> stringIntegerHashMap = new HashMap<String, Integer>();
        stringIntegerHashMap.put("student1",12);
        stringIntegerHashMap.put("student2",14);
        stringIntegerHashMap.put("student3",15);
        stringIntegerHashMap.put("student4",18);

        StudentAverageSorter studentAverageSorter = new StudentAverageSorter();
        List studentList= studentAverageSorter.sorByAverage(stringIntegerHashMap);
        Iterator iterator=studentList.iterator();
        while (iterator.hasNext()) {
            System.out.println("list of average :\n " +iterator.next());
        }

    }
}
