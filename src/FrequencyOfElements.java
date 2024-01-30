import java.util.HashMap;
import java.util.Map;

public class FrequencyOfElements {
    public static void main(String[] args) {
        String[] fruits = {"Apple","Banana","Apple","Cherry"};

        frequencyOfElements(fruits);
    }

    public static void frequencyOfElements(String[] arr) {
        Map<String, Integer> freq = new HashMap<>();

        for (String s : arr) {
            freq.put(s, freq.getOrDefault(s,0) + 1);
        }

        freq.forEach( (k,v) -> System.out.println(k + " = " + v) );

    }
}
 /*
        Frequency Of Each Element

        Given an array find the frequency of each element. The frequency is the number of times each element appears in the array

        Ex:
            input:
                frequencyElement("Apple","Banana","Apple","Cherry")
            output:
                Apple = 2
                Banana = 1
                Cherry = 1
     */