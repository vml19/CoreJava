package basics;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class FindDuplicateCharInString {
    public static boolean findDuplicate(String str) {

        var charArr = str.toCharArray();
        var temp = charArr[0];
        for (int i = 1; i < charArr.length; i++) {
            if (!(charArr[i] == ' ')) {
                if (temp == charArr[i])
                    return true;
                else
                    temp = charArr[i];
            }
        }
        return false;
    }

    public static Set<Character> findDuplicateUsingMaps(String str) {



        var duplicates = new LinkedHashSet<Character>();
        var countMap = new HashMap<Character, Integer>();
        for (int i = 0; i < str.length(); i++) {
            if (countMap.containsKey(str.charAt(i))) {
                countMap.put(str.charAt(i), countMap.get(str.charAt(i)) + 1);
            } else {
                countMap.put(str.charAt(i), 1);
            }
        }

        countMap.forEach((key, value) -> {
            if (value > 1) {
                duplicates.add(key);
            }
        });
        return duplicates;
    }
}
