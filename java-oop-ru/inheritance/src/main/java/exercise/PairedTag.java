package exercise;

import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;

// BEGIN
public class PairedTag extends Tag {
    private String body;
    private List<Tag> children;

    public PairedTag(String name, Map<String, String> attributes, String body, List<Tag> children) {
        super(name, attributes);
        this.body = body;
        this.children = children;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(String.format("<%s%s>", name, getAttributesString()));
        if (!body.isEmpty()) {
            stringBuilder.append(body);
        }
        for (Tag child : children) {
            stringBuilder.append(child.toString());
        }
        stringBuilder.append(String.format("</%s>", name));
        return stringBuilder.toString();
    }
}
// END
