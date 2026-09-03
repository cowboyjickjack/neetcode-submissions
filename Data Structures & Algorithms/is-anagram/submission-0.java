class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() == t.length()) {
            char[] first = s.toLowerCase().toCharArray();
            char[] second = t.toLowerCase().toCharArray();
            Arrays.sort(first);
            Arrays.sort(second);
            boolean checker = Arrays.equals(first, second);
            if (checker == true){
                return true;
            }
        }

        return false;

    }
}
