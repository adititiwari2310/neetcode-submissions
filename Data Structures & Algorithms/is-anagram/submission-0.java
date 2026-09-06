// class Solution {
//     public boolean isAnagram(String s, String t) {

//         int count = 0;
//         for (int i = 0; i < s.length() && i < t.length(); i++) {
//             if (s.charAt(i) == t.charAt(i)) {
//                 count++;
//                 return true;
//                 }
//             }return false;
//     }
// }

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        Arrays.sort(sArr);
        Arrays.sort(tArr);

        return Arrays.equals(sArr, tArr);
    }
}
