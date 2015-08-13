
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class MainStudentAverageSorter {
    public static void main(String[] args) {
        HashMap<String, Integer> stringIntegerHashMap = new HashMap<String, Integer>();
        stringIntegerHashMap.put("student1", 1);
        stringIntegerHashMap.put("student2", 18);
        stringIntegerHashMap.put("student3", 15);
        stringIntegerHashMap.put("student4", 19);

        StudentAverageSorter studentAverageSorter = new StudentAverageSorter();
        List studentList = studentAverageSorter.sortByAverage(stringIntegerHashMap);
        Iterator iterator = studentList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
