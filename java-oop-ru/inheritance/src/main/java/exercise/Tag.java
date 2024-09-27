package exercise;

import java.util.stream.Collectors;
import java.util.Map;

// BEGIN
public abstract class Tag {
    protected String name;
    protected Map<String, String> attributes;

    public Tag(String name, Map<String, String> attributes) {
        this.name = name;
        this.attributes = attributes;
    }

    protected String getAttributesString() {
        StringBuilder attributesString = new StringBuilder();
        for (Map.Entry<String, String> entry : attributes.entrySet()) {
            attributesString.append(String.format(" %s=\"%s\"", entry.getKey(), entry.getValue()));
        }
        return attributesString.toString();
    }

    public abstract String toString();
}
// END
