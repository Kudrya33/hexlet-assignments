package exercise;

import java.util.stream.Collectors;
import java.util.Map;

// BEGIN
abstract class Tag {
    String tagName;
    Map<String, String> attributes;

    public Tag(String tagName, Map<String, String> attributes) {
        this.tagName = tagName;
        this.attributes = attributes;
    }

    public String getTagName() {
        return tagName;
    }

    public Map<String, String> getAttributes() {
        return attributes;
    }

    public abstract String toString();
}
// END
