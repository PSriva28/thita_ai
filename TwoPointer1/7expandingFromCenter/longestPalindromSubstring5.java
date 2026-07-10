class longestPalindromSubstring5{
    public static void main(String args[]){
        String s = "abbacdracecar";
        String maxString = "";

        for(int i = 0;i <s.length(); i++){
            String odd = expand(s,i,i);
            String even = expand(s, i, i+1);

            if(odd.length() > maxString.length()){
                maxString = odd;
            }
            if(even.length() > maxString.length()){
                maxString = even;
            }
        }
        System.out.println(maxString);

    }
    private static String expand(String s, int l, int r){
        while(l>=0 && r<s.length() && s.charAt(l) == s.charAt(r)){
            l--;r++;
        }
        return s.substring(l +1, r);
    }
}