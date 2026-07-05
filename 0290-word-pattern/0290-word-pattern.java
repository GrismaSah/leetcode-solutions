class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if(pattern.length() != words.length){
            return false;
        }

        HashMap<Character, String> map = new HashMap<>();
        for(int i=0; i<pattern.length(); i++){
            char original = pattern.charAt(i);
            String replacement = words[i];

            if(!map.containsKey(original)){
                if(!map.containsValue(replacement)){
                    map.put(original, replacement);
                }
                else{
                    return false;
                }
            }
            else{
                String mappedword = map.get(original);
                if(!mappedword.equals(replacement)){
                    return false;
                }
            }
        }
        return true;
    }
}