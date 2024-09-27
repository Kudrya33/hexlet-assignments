package exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

// BEGIN
public class SingleTag extends Tag {
    public SingleTag(String name, Map<String, String> attributes) {
        super(name, attributes);
    }

    @Override
    public String toString() {
        return String.format("<%s%s>", name, getAttributesString());
    }
}
// END
