class normalstringreversal{
    public static void main(String args[]){
        String s = "Hello Prerna.";
        char str[] = s.toCharArray();
        int left = 0, right = s.length() - 1; 

        while(left < right){
            char temp = str[left];
            str[left] = str[right];
            str[right]= temp;
            left++;
            right--;
        }
        System.out.println(new String(str));
    }
}