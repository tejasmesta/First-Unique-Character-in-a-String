class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        
        int n = s.length();
        
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            count.map(c, map.getOrDefault(c, 0) + 1);
        }
        
        
        for (int i = 0; i < n; i++) {
            if (map.get(s.charAt(i)) == 1) 
                return i;
        }
        
        return -1;
    }
}
