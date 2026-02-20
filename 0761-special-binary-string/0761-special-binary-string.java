import java.util.*;

class Solution {
    public String makeLargestSpecial(String s) {
        
        int count = 0;
        int start = 0;
        List<String> list = new ArrayList<>();
        
        for (int i = 0; i < s.length(); i++) {
            
            if (s.charAt(i) == '1') count++;
            else count--;
            
            // Found one special substring
            if (count == 0) {
                // Recursively solve middle part
                String middle = makeLargestSpecial(s.substring(start + 1, i));
                
                list.add("1" + middle + "0");
                start = i + 1;
            }
        }
        
        // Sort in descending order
        Collections.sort(list, Collections.reverseOrder());
        
        StringBuilder result = new StringBuilder();
        for (String str : list) {
            result.append(str);
        }
        
        return result.toString();
    }
}