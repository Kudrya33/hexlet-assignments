package exercise;

import java.util.stream.IntStream;

// BEGIN
class ReversedSequence implements CharSequence{
    String string;

    ReversedSequence(String string) {
        StringBuilder s  = new StringBuilder(string);
        this.string = s.reverse().toString();
    }

    @Override
    public int length() {
        return string.length();
    }

    @Override
    public char charAt(int index) {
        return string.charAt(index);
    }

    @Override
    public boolean isEmpty() {
        return CharSequence.super.isEmpty();
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return string.subSequence(start, end);
    }

    @Override
    public String toString() {
        return string;
    }
}
// END
