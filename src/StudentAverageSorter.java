import java.util.*;


public class StudentAverageSorter {
    public List sortByAverage(HashMap<String, Integer> studentAverage) {
        ArrayList<Student> studentList = new ArrayList<Student>();

        for (Map.Entry<String, Integer> stringIntegerEntry : studentAverage.entrySet()) {
            String key = stringIntegerEntry.getKey();
            Integer value = stringIntegerEntry.getValue();
            Student student = new Student(key, value);
            studentList.add(student);
        }
         Collections.sort(studentList);
        return studentList;

    }
}
