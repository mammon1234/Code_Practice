class Solution {
    /**
     * @param S: A set of numbers.
     * @return: A list of lists. All valid subsets.
     */
    public ArrayList<ArrayList<Integer>> subsetsWithDup(ArrayList<Integer> S) {
        // write your code here
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        if( S == null ){
            return ans;
        }
        ArrayList<Integer> list = new ArrayList<Integer>();
        Collections.sort( S );
        subdfs( ans, list, S, 0 );
        return ans;
    }
    private void subdfs( ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> list, ArrayList<Integer> S, int pos){
        ans.add(new ArrayList<Integer>(list));
        for( int i = pos; i < S.size(); i++){
            if( i != pos && S.get(i-1) == S.get(i)){
                continue;
            }
            list.add(S.get(i));
            subdfs( ans, list, S, i+1);
            list.remove(list.size()-1);
        }
    }
}
