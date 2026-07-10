class PalindromeSubstrings647{
    public static void main(String args[]){
        String s = "abbac";
        int count = 0;
        for(int center = 0; center<s.length();center++){
            //odd length, single character center
            count+= expand(s,center,center);

            //even length, 
            count+= expand(s,center, center+1);
        }
        System.out.println("Total substring count :- "+count);
    }
    private static int expand(String s, int i, int j){
        int count = 0;
        while(i >= 0 && j<s.length() && s.charAt(i) == s.charAt(j)){
            count++;
            i--;j++;
        }
        return count;
    }
}