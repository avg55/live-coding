package ag.code.interview;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Question: what's wrong with stream?
 * Answer: it is impossible to run more than one terminal operation on the same stream
 */

public class StreamQuestion {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(1);
//...
        list.add(100);

        Stream<Integer> s = list.stream().filter(i -> i % 2 == 0);

        long count = s.count();

        List<Integer> even = s.collect(Collectors.toList());
    }

}
