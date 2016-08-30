class Solution {
    /**
given source string and a target string, 
you should output the first index(from 0) of target string in source string.
If target does not exist in source, just return -1
     */
    public int strStr(String source, String target) {
        if (source == null || target == null){
            return -1;
        }
        if (source.length() == 0){
            return 0;
        }
        int i,j;
        for (i = 0; i <= source.length() - target.length(); i++){
            for (j = 0; j < target.length(); j++){
                if (target.charAt(j) != source.charAt(i+j)){
                    break;
                }
            }
            if (j == target.length()){
                return i;
            }
        }
        return -1;
    }
}
