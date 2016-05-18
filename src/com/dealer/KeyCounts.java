package com.dealer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by harshith on 5/16/16.
 */
public class KeyCounts {

    /**
     * Computes the key counts from a given file. Also prints the key counts.
     * Assumes negative values are valid and treats them accordingly.
     * @param filepath - path to the file
     * @return Map containing the key and computed values
     */
    public Map<String, Integer> calculateKeyCounts(String filepath) {
        Map<String, Integer> result = new HashMap<String, Integer>();
        File file = new File(filepath);
        try {
            // open the file
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            // read lines one-by-one
            while ((line = bufferedReader.readLine()) != null) {
                // ignore empty lines
                if (line.trim().equals("")) {
                    continue;
                } else {
                    // split lines by the comma
                    String[] parts = line.split(",", 2);
                    String key = parts[0].trim();
                    Integer value = Integer.parseInt(parts[1].trim());
                    // already in result map
                    if (result.containsKey(key)) {
                        result.put(key, result.get(key) + value);
                    } else { // new entry
                        result.put(key, value);
                    }
                }
            }
        } catch (Exception e) {
//            e.printStackTrace();
            return null;
        }
        // print the results
        for (Map.Entry<String, Integer> e : result.entrySet()) {
            System.out.println(e.getKey() + " : " + e.getValue());
        }
        return result;
    }
}
