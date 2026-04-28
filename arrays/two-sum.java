// Problem: Two Sum

// -----------------------------
// Approach 1: Brute Force O(n^2)
// -----------------------------
// int k=0;
// int[] n=new int[2];
// for(int i=0;i<nums.length;i++){
//     for(int j=i+1;j<nums.length;j++){
//         if((nums[i]+ nums[j])==target){
//             n[0]=i;
//             n[1]=j;
//             k=9;
//             break;
//         }
//     }
//     if (k==9)
//         break;
// }


// -------------------------------------
// Approach 2: Attempted Optimization
// Status: 47/63 test cases passed
// Issues: duplicate handling, indexing
// -------------------------------------
// int k=0;
// int[] n=new int[2];
// int[] n2=new int[nums.length];
// int a,b,c;

// for(int i=0;i<nums.length;i++){
//     a=target-nums[i];
//     b=nums[i]+a;

//     if(a==nums[i]){
//         n[0]=i;
//         for(int j=i+1;j<nums.length;j++){
//             if(a==nums[j]){
//                 n[1]=j;
//             }
//         }
//         if(n[0]!=n[1])
//             return n;
//     }

//     if(b==target && a!=nums[i]){
//         n2[k]=i;
//         k++;
//     }
// }

// n[0]=n2[0];
// n[1]=n2[1];
// return n;


// -------------------------------------
// Final Approach: HashMap O(n)
// -------------------------------------

import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int c = target - nums[i];

            if(map.containsKey(c)){
                return new int[]{map.get(c), i};
            }

            map.put(nums[i], i);
        }

        return new int[]{}; // fallback
    }
}