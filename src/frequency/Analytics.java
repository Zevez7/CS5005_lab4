package frequency;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Analytics {


  public static Map<String, Double> wordFrequency(String message) {

    if (message == null || message.equals("")) {
      return null;
    }

    // remove all non letters, lowercase all words, split words by white space
    String[] wordsArray = message.replaceAll("[^a-zA-Z ]", "").toUpperCase().split("\\s+");
//    System.out.println(Arrays.toString(wordsArray));

    // array length
    int arrayLength = wordsArray.length;

    System.out.printf("length %d \n", arrayLength);

    Map<String, Double> hMap = new HashMap<>();
    // loop through wordsArray and add up the number of words
    for (String word : wordsArray) {
//      System.out.println(word);

      // check to see if word is already in Hashmap
      if (hMap.containsKey(word)) {
//        System.out.printf("Contain %s \n", word);

        double wordValue = hMap.get(word) + 1.0;
        hMap.put(word, wordValue);

      } else {
        hMap.put(word, 1.0);
      }
    }

    System.out.println(List.of(hMap));

    // loop through wordsArray and convert the count to frequncy of the words.
    hMap.forEach((k, v) -> {
      double wordFrequency = hMap.get(k) / arrayLength;
      hMap.put(k, wordFrequency);
    });

//    System.out.print(hMap);
    System.out.println(List.of(hMap));

    return hMap;
  }

  public static void main(String[] args) {
    wordFrequency(
        "one two two three three three four four four four"
    );
  }
}
