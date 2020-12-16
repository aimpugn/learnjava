package com.leetcode.abstracts;

public abstract class Solution {
    protected TestCase<?> testCase;

    public abstract Answer<?> answer(); 

    public void setCase(TestCase<?> testCase){
        this.testCase = testCase;
    } 

}
