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

    Map<String, Double> hMap = new HashMap<>();
    // loop through words
    for (String word : wordsArray) {
//      System.out.println(word);

      // check to see if word is already in Hashmap
      if (hMap.containsKey(word)) {
//        System.out.printf("Contain %s \n", word);

        double wordValue = hMap.get(word) + 0.1;
        hMap.put(word, Math.round(wordValue * 10.0) / 10.0);

      } else {
//        System.out.printf("does not contain word %s \n", word);
        hMap.put(word, (0.1));
      }
    }

//    System.out.print(hMap);
    System.out.println(List.of(hMap));

    return hMap;
  }

//  public static void main(String[] args) {
//    wordFrequency(
//        "yesterday  no no no no no no no no no no no no no no no no no no no no no no no no no no "
//            + "no no no no no no no no no way definitely yesterday. if and no no memory memory "
//            + "yesterday no way definitely yesterday. if and no no memory memory yesterday no way "
//            + "definitely yesterday. if and no no memory memory yesterday no way definitely "
//            + "yesterday. if and no no memory memory yesterday no way definitely yesterday. "
//            + "if and no no memory memory");
//  }
}
