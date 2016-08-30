class Solution {
    /**
     * @param S: A set of numbers.
     * @return: A list of lists. All valid subsets.
     */
    public ArrayList<ArrayList<Integer>> subsets(int[] nums) {
		ArrayList<ArrayList<Integer>>result = new ArrayList<ArrayList<Integer>>();
		if(nums==null){
			return result;
		}
		ArrayList<Integer> list=new ArrayList<Integer>();
		Arrays.sort(nums);
		subsetdfs(result,list,nums,0);
		return result;
	}
	private void subsetdfs(ArrayList<ArrayList<Integer>> result, ArrayList<Integer> list,int[] nums,int pos){
		result.add(new ArrayList<Integer>(list));
		for(int i = pos; i < nums.length; i ++ ){
			list.add(nums[i]);
			subsetdfs(result,list,nums,i+1);
			list.remove(list.size()-1);
		}
	}
}
