import java.util.Arrays;
import com.leetcode.abstracts.Solution;
import com.leetcode.abstracts.TestCase;
import com.leetcode.easy.ValidPalindrome;

public class App {
    public static void main(String[] args) throws Exception {
        Solution s = new ValidPalindrome("abcba");
        System.out.println(s.answer().getValue());
        s = new ValidPalindrome("abccxzcba");
        System.out.println(s.answer().getValue());
        s = new ValidPalindrome("a#$bc$:cx_zcba");
        System.out.println(s.answer().getValue());
        
    }
}
