//https://leetcode.com/problems/find-first-palindromic-string-in-the-array/description/?envType=daily-question&envId=2024-02-13
class FirstPalindrome {
    public String firstPalindrome(String[] words) {
        for(int i=0; i<words.length; i++){
            if(isPalindrome(words[i]))
                return words[i];
        }
        return "";
    }

    private boolean isPalindrome(String word){
        int i=0, j=word.length()-1;

        while(i<j){
            if(word.charAt(i)==word.charAt(j)){
                i++; j--;
            }else{
                return false;
            }
        }

        return true;
    }
}
