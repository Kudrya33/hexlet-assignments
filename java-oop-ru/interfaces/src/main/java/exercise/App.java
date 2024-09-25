package exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// BEGIN
class App {
    public static List<String> buildApartmentsList(List<Home> homes, int elements) {
        Collections.sort(homes, Comparator.comparingDouble(Home::getArea));
        List<String> result = new ArrayList<>();
        if (homes.isEmpty()) {
            return new ArrayList<>();
        }
        for (int i = 0; i < elements; i++ ) {
            result.add(homes.get(i).toString());
        }
        return result;
    }
}
// END
