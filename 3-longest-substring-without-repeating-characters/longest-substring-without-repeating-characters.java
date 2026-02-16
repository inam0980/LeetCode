
class Solution {
    public int lengthOfLongestSubstring(String s) {

        ArrayList<Character> chr = new ArrayList<>();
        int k = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            while (chr.contains(c)) {
                chr.remove(0);
            }

            chr.add(c);
            k = Math.max(k, chr.size());
        }

        return k;
    }
}

