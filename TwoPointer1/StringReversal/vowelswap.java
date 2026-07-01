class vowelswap{
    public static void main(String args[]){
        String str = "Prerna"; //--->"Hollew"
        char arr[] = str.toCharArray(); //---> H, o, l, l, e, w

        int left = 0, right = str.length() - 1;
        while(left < right){
            //Move left till you find the vowel
            while(left < right && !isVowel(arr[left])){
                left++;
            }

            //Move right till you find the vowel
            while(left < right && !isVowel(arr[right])){
                right--;
            }

            //incase find both side then swap
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
        System.out.println(new String(arr));
        
    }
    private static boolean isVowel(char c){
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'; 
    }
}