import java.util.*;

/**
 * Created by Dotin School1 on 8/12/2015.
 */
public class StudentAverageSorter {
    public List sorByAverage(HashMap<String, Integer> studentAverageMap) {
        ArrayList<Student> studentList = new ArrayList<Student>();

        for (Map.Entry<String, Integer> stringIntegerEntry : studentAverageMap.entrySet()) {
            String key = stringIntegerEntry.getKey();
            Integer value = stringIntegerEntry.getValue();
            Student student = new Student(key, value);
            studentList.add(student);
        }
        Collections.sort(studentList);
        Collections.reverse(studentList);
        return studentList;

    }
}
