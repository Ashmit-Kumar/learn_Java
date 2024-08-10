package Unit_3;

import java.text.Collator;
// import java.util.Arrays;
import java.util.*;
// import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int sum=0;
        for(int i: arr){
            if(i%2==0){
                sum+=i;
            }
        }
        int sum2=Arrays.stream(arr)
                       .filter(n->n%2==0)
                       .sum();


        System.out.println(sum2);
        List<Integer> list=Arrays.asList(9,2,1,1,3,4,7);
        List<Integer> stream=list.stream().sorted((a,b)->(b-a)).distinct().collect(Collectors.toList());
        System.out.println(stream);
        // int[] a={1,2,3,4,5,6};
        Stream<Integer> num=Stream.of(1,3,4,5,6,6,7);

        Stream<Character> num1=Stream.iterate('a', c -> (char) (c + 1)).limit(26).skip(5);
        Stream<String> list2=Stream.generate(()->"Hello").limit(100);
        // System.out.println(list2.collect(Collectors.toList()));
        // System.out.println(num1.collect(Collectors.toList()));

    }
}
