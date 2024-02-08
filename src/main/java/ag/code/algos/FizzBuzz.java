package ag.code.algos;

import java.util.stream.IntStream;

public class FizzBuzz {

    public static void main(String[] args) {

        IntStream.rangeClosed(1, 100)
                .forEach(
                        i -> {
                            String s = "";
                            if (i % 3 == 0) {
                                s = "Fizz";
                                //System.out.print("Fizz");
                            }
                            if (i % 5 == 0) {
                                s = s + "Buzz";
                                //System.out.print("Buzz");
                            }
                            if ("".equals(s)) {
                                s = String.valueOf(i);
                            }
                            System.out.print(s + " ");
                        }
                );

    }

}
