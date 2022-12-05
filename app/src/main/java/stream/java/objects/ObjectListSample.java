package stream.java.objects;

import java.util.List;

public class ObjectListSample {

    private List<String> letter;
    private List<Integer> number;

    public ObjectListSample(List<String> letter, List<Integer> number) {
        this.letter = letter;
        this.number = number;
    }

    public List<String> getLetter() {
        return letter;
    }

    public List<Integer> getNumber() {
        return number;
    }


}
