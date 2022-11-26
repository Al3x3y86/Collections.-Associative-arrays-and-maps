import java.util.*;

public class MapList {

    private static final Random RANDOM = new Random();

    private final Map<String, List<Integer>> mapList = new HashMap<>();

    public MapList() {
        int sum = 5;
        for (int i = 0; i < sum; i++) {
            mapList.put(String.valueOf(i), integerList());

        }
    }

    private List<Integer> integerList() {
        List<Integer> list = new ArrayList<>();
        int sum = 3;
        for (int i = 0; i < sum; i++) {
            list.add(RANDOM.nextInt(1001));

        }
        return list;
    }

    public Set<Map.Entry<String, List<Integer>>> keysAndValues() {
        return mapList.entrySet();
    }

    public Map<String, Integer> convertCollection() {
        Map<String, Integer> result = new HashMap<>();
        for (Map.Entry<String, List<Integer>> entry : mapList.entrySet()) {
            int sum = 0;
            for (Integer number : entry.getValue()) {
                sum += number;
            }
            result.put(entry.getKey(), sum);

        }
        return result;
    }


}
