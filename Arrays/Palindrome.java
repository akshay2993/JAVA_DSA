public class Palindrome {
    public static void main(String[] args) {
        String word = "madam";

        if(isPalindrome(word)){
            System.out.println(word+" is a palindrome.");
        }else{
            System.out.println(word+" is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String word){
        char[] charArr = word.toCharArray();
        int start = 0;
        int end = charArr.length-1;

        while(start < end){
            if(charArr[start] != charArr[end]){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
