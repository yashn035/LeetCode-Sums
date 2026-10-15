class Solution {
    public void moveZeroes(int[] nums) {
        int z = 0;
        int size = nums.length;

        for (int nz = 0; nz < size; nz++) {
            if (nums[nz] != 0) {
                int temp = nums[nz];
                nums[nz] = nums[z];
                nums[z] = temp;
                z++;
            }
        }
    }
}