class twosum_ifinputarrayissorted_167{
    public static void main(String args[]){
        int arr[] = {2,7,11,15}; int target = 9;

        int left = 0, right = arr.length-1;
        while(left <= right){

            if(arr[left]+arr[right] > target){
                right--;
            }
            else if(arr[left] + arr[right] < target){
                left--;
            }
            else if(arr[left] + arr[right] == target){
                // return new int[]{left+1,right+1};
                System.out.println((left+1)+" , " + (right+1));
                return;
            }
        }
        // return new int[]{-1,-1}; //incase nhi mila target toh
        System.out.println(-1+ ", "+-1);
    }
}