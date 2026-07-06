class wordswap {
    public static void main(String args[]){
        String s = "the sky is blue";
        String words[] = s.trim().split("\\s+");
        // for(int i = 0; i < words.length;i++){
        //     System.out.println(words[i]);
        // }
        int left = 0, right = words.length - 1;
        while(left < right){
            String temp = words[left];
            words[left] = words[right];
            words[right]= temp;
            left++;
            right--;
        }
        for(int i = 0; i < words.length;i++){
            System.out.println(words[i]);
        }
    }
}