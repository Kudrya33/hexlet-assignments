package exercise;

import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;

// BEGIN
class PairedTag extends Tag {
    String body;
    List<Tag> children;

    public PairedTag(String tagName, Map<String, String> attributes, String body, List<Tag> children) {
        super(tagName, attributes);
        this.body = body;
        this.children = children;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(String.format("<%s", tagName));
        for (Map.Entry<String, String> entry: attributes.entrySet()) {
            builder.append(String.format(" %s=\"%s\"", entry.getKey(), entry.getValue()));
        }
        builder.append(">");
        builder.append(body);

        for (Tag child: children) {
            builder.append("<" + child.tagName);
            for (Map.Entry<String, String> entry: child.getAttributes().entrySet()) {
                builder.append(String.format(" %s=\"%s\">", entry.getKey(), entry.getValue()));
            }
        }

        builder.append("</" + tagName + ">");
        return builder.toString();
    }
}
// END
