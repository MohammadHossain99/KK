package Others;

public class palindrom {
    public static void main(String[] args){
        String wordOne ="racecar";
        String wordTwo = "calendar";
        String wordThree= "mom";
        String wordFour = "calculator";

        System.out.println(isPalindrome(wordOne));
        System.out.println(isPalindrome(wordTwo));
        System.out.println(isPalindrome(wordThree));
        System.out.println(isPalindrome(wordFour));
    }
    public static boolean isPalindrome(String word){
        String actualWord = word.toLowerCase();
        String reverseWord = "";
        for (int i = actualWord.lenghth()-1; i>=0, i--){
            reverseWotd = reverseWord + actualWord.chatAt(i);
        }
        if (actualWord.equals(reverseWord)) {
            return true;
        } else {
            return false;
        }
        }
    }
}
