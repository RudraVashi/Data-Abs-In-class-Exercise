import java.util.HashMap;
import java.util.Map;

public class twoSum {
    public int[] tSum (int[] nums, int target){
        // Map<Integer,Integer> numMap = new HashMap<>();
        // for (int i = 0; i< nums.length; i++){
        //     int diff = target - nums[i];
        //     if(numMap.containsKey(diff)){
        //         return new int[] {numMap.get(diff),i};
        //     }
        //     numpMap.put(num[i],i);
            // for(int j = 0; j < nums.length; i++){
            //     if(nums[i] + nums[j] == target){
            //         return new int[] (i,j);
            //     }
            // }
             //return null;
        }
    }
    public static void findSymPairs(int arr[][]){
        HashMap<Integer,Integer> hm = new HashMap<>();

        for (int i = 0; i < arr.length; i++){
            int first = arr[i][0];
            int second = arr[i][1];

            Integer val = hm.get(second);
            if(val==first){
                System.out.println(second + " " + first);
            }else{
                hm.put(first,second);
            }
        }
    }

