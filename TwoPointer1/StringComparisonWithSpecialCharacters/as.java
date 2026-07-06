class as{
    public static void main(String args[]){

        String s= "ab#cds#f";
        int index = getNextValidCharIndex(s, s.length()-1);
        System.out.println(index); 
    }
        private static int getNextValidCharIndex(String str, int i) {
        int hashCount = 0;
        for(; i >= 0;i--){
            if(str.charAt(i) =='#')
            {
                hashCount++;
                continue;
            }
            if(hashCount > 0){
                hashCount--;
            }
            else{
                break;
            }
        }
        return i;
    }
    
}