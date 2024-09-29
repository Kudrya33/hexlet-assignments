package exercise;

import java.util.Map;

// BEGIN
class SingleTag extends Tag {

    public SingleTag(String tagName, Map<String, String> attributes) {
        super(tagName, attributes);
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(String.format("<%s", tagName));
        for (Map.Entry<String, String> entry: attributes.entrySet()) {
            builder.append(String.format(" %s=\"%s\"", entry.getKey(), entry.getValue()));
        }
        builder.append(">");
        return builder.toString();
    }
}
// END
