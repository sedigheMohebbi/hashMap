import java.util.*;

/**
 * Created by Dotin School1 on 8/12/2015.
 */
public class StudentAverageSorter {
    public List sorByAverage(HashMap<String, Integer> studentAverageMap) {
        ArrayList<Integer> avrageList = new ArrayList<Integer>();

        for (Map.Entry<String, Integer> stringIntegerEntry : studentAverageMap.entrySet()) {
            String key = stringIntegerEntry.getKey();
            Integer value = stringIntegerEntry.getValue();
            avrageList.add(value);

        }
        Collections.sort(avrageList);
        Collections.reverse(avrageList);
        return avrageList;

    }
}
