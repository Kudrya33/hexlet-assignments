package exercise;

import java.util.*;
import java.util.Map.Entry;

// BEGIN
public class App {
    public static void swapKeyValue(KeyValueStorage storage) {
        Map<String, String> map = storage.toMap();

        for (String key : map.keySet()) {
            storage.unset(key);
        }

        for (Map.Entry<String, String> entry : map.entrySet()) {
            storage.set(entry.getValue(), entry.getKey());
        }
    }
}
// END
