import java.util.HashMap;
import java.util.Map;


public class MapCollection {

    public static Map<String, Integer> map = new HashMap<>();

        public static void addMap (String string, Integer integer){
            if (map.containsKey(string)){
                if (integer.equals(map.get(string))){
                    throw new RuntimeException("Объект уже есть");
                }else {
                    map.put(string,integer);
                    System.out.println(map);
                }
                return;
            }
            map.put(string, integer);
            System.out.println(map);
        }


}
