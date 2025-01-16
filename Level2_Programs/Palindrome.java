class PalindromeChecker{
    String text;
    PalindromeChecker(String text){
        this.text = text;
    }
    boolean isPalindrome(){
        String reverse = "";
        for(int i=text.length()-1; i>=0; i--){
            reverse += text.charAt(i);
        }
        if(text.equals(reverse)){
            return true;
        }
        else{
            return false;
        }
    }
    void display(){
        if(isPalindrome()){
            System.out.println(text+" is a Palindrome");
        }
        else{
            System.out.println(text+" is not a Palindrome");
        }
    }
}
public class Palindrome{
    public static void main(String[] args) {
        PalindromeChecker p1 = new PalindromeChecker("madam");
        p1.display();
        PalindromeChecker p2 = new PalindromeChecker("hello");
        p2.display();
    }
}