package frequency;

import java.util.HashMap;
import java.util.Map;


/**
 * Class for Analytics to determine the wordFrequency of a string message.
 */
public class Analytics {


  /**
   * Paras a string message and create a hashmap that stores each word frequency.
   * @param message the string message to be parsed.
   * @return a map with a key string and value double.
   */
  public static Map<String, Double> wordFrequency(String message) {

    if (message == null || message.equals("")) {
      return null;
    }

    // remove all non letters, lowercase all words, split words by white space
    String[] wordsArray = message.replaceAll("[^a-zA-Z ]", "").toUpperCase().split("\\s+");

    // array length
    int arrayLength = wordsArray.length;


    Map<String, Double> hMap = new HashMap<>();
    // loop through wordsArray and add up the number of words
    for (String word : wordsArray) {

      // check to see if word is already in Hashmap
      if (hMap.containsKey(word)) {

        double wordValue = hMap.get(word) + 1.0;
        hMap.put(word, wordValue);

      } else {
        hMap.put(word, 1.0);
      }
    }


    // loop through wordsArray and convert the count to frequency of the words.
    hMap.forEach((k, v) -> {
      double wordFrequency = hMap.get(k) / arrayLength;
      hMap.put(k, wordFrequency);
    });


    return hMap;
  }

}
