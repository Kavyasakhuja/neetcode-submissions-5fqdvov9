class Solution {
    public boolean isPalindrome(String s) {
        String original="";
        String newStr="";
        for(int i=0;i<s.length();i++){
            char c= s.charAt(i);
            if(Character.isLetterOrDigit(c)){
                original=original + Character.toLowerCase(c);
            }
        }
        for(int i=original.length() -1 ; i>=0 ; i--){
            newStr =newStr + original.charAt(i);
        }
        if(original.equals(newStr)){
            return true;
        }
        else{
            return false;
        }
    }
}
