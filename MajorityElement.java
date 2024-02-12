class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int shubh = 0;
        Map<Integer, Integer> mp = new HashMap<>();

        for(int x : nums){
            if(mp.containsKey(x)) {
                mp.put(x, mp.get(x)+1);

            }else {
                mp.put(x, 1);
            }
            if(mp.get(x) > n/2)shubh = x;
        }

        return shubh;

    }
}
