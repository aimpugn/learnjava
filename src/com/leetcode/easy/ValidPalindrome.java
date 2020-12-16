package com.leetcode.easy;

import com.leetcode.abstracts.Answer;
import com.leetcode.abstracts.Solution;
import com.leetcode.abstracts.TestCase;

/**
 * 문제: 주어진 문자열이 팰린드롬인지 확인 조건 - 대소문자 구분 없음 - 영문자와 숫자만 대상 팰린드롬: 앞뒤가 똑같은 단어나 문장
 */

public class ValidPalindrome extends Solution {
    private ValidPalindrome validPalindrome = null;
    private Boolean value = null;
    private TestCase<String> testCase = null;

    public ValidPalindrome() {
    }

    public ValidPalindrome(String str) {
        if(this.validPalindrome == null){
            this.validPalindrome = new ValidPalindrome();
        }
        this.testCase = new TestCase<String>(str);
        this.validPalindrome.setCase(this.testCase);
    }


    public boolean isValidPalindrome(String str) {
        // 대소문자 구분 없으므로 소문자로만 비교
        str = str.toLowerCase();
        // 공백은 취급하지 않으므로 공백 제거
        // 영문 또는 숫자만 남긴다
        str = this.getAlnum(str);
        int start = 0;
        int last = str.length() - 1;

        while (start <= last) {
            if (str.charAt(start) != str.charAt(last)) {
                return false;
            } else {
                start++;
                last--;
            }
        }

        return true;
    }


    public String getAlnum(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            boolean isAl = true;
            char c = str.charAt(i);
            if (Character.isAlphabetic(c)){
                sb.append(c);
            }
            else {
                isAl = false;
            }
            if (!isAl && Character.isDigit(c)) {
                sb.append(c);
            }
        }

        return sb.toString();
    }

    // 쓸데없는 추상화... 과연 이걸로 모든 Solution, Answer, TestCase를 커버할 수 있을까???
    @Override
    public Answer<?> answer() {
        Answer<Boolean> ans = new Answer<Boolean>();
        System.out.println(this.testCase.getValue());
        ans.setValue(this.validPalindrome.isValidPalindrome(this.testCase.getValue()));

        return ans;
    }
}
