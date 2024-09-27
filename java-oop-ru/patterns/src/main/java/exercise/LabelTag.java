package exercise;

// BEGIN
class LabelTag implements TagInterface {
    String teg;
    TagInterface tagInterface;

    public LabelTag(String teg, TagInterface tagInterface) {
        this.teg = teg;
        this.tagInterface = tagInterface;
    }

    @Override
    public String render() {
        return "<label>" + teg + tagInterface.render() + "</label>";
    }
}
// END
