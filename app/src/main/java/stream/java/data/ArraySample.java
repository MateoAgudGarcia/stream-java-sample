package stream.java.data;

import java.util.*;

public class ArraySample {

    private String letters[] = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
    private Integer numbers[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};


    public List<String> tenSamplesStringList() {
        List<String> names = Arrays.asList(letters);
        return names;
    }

    public List<Integer> tenSamplesIntegerList() {
        List<Integer> num = Arrays.asList(numbers);
        return num;
    }

    public Set<String> tenSamplesStringArrayList() {
        Set setString = new HashSet(10);
        setString.addAll(new ArrayList(Arrays.asList(letters)));
        return setString;
    }

    public Set<Integer> tenSamplesIntegerArrayList() {
        Set setInt = new HashSet(10);
        setInt.addAll(new ArrayList(Arrays.asList(numbers)));
        return setInt;
    }
}

