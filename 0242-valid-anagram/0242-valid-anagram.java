class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        // HashMap<Character, Integer> map = new HashMap <>();
        // for(int i=0; i<s.length(); i++){
        //     char word = s.charAt(i);
        //     if(map.containsKey(word)){
        //         map.put(word, map.get(word)+1);
        //     }
        //     else{
        //         map.put(word, 1);
        //     }
        // }
        // for(int i=0; i<t.length(); i++){
        //     char letter = t.charAt(i);
        //     if(map.containsKey(letter)){
        //         map.put(letter, map.get(letter) - 1);       
        //     }
        //       else{
        //         map.put(letter, 1);
        //     }
        // }
        // for(Map.Entry<Character, Integer> e: map.entrySet()){
        //     if(e.getValue() != 0){
        //         return false;
        //     }
        // }
        // return true;

        // another approach 
        HashMap<Character, Integer> map1 = new HashMap <>();
        for(int i=0; i<s.length(); i++){
            char word = s.charAt(i);
            if(map1.containsKey(word)){
                map1.put(word, map1.get(word)+1);
            }
            else{
                map1.put(word, 1);
            }
        }

        HashMap<Character, Integer> map2 = new HashMap <>();
        for(int i=0; i<t.length(); i++){
            char letter = t.charAt(i);
            if(map2.containsKey(letter)){
                map2.put(letter, map2.get(letter) + 1);       
            }
              else{
                map2.put(letter, 1);
            }
        }
        if(map1.equals(map2)){
            return true;
        }
        else {
            return false;
        }
    }
}