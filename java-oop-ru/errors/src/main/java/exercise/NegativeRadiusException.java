package exercise;

// BEGIN
class NegativeRadiusException extends Exception {
    public String text;

    public NegativeRadiusException(String text) {
        this.text = text;
    }
}
// END
