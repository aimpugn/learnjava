package com.leetcode.abstracts;

public class TestCase<T> {
    private T value;

    public TestCase(T value){
        this.value = value;
    }

    public void setValuee(T value) {
        this.value = value;
    }

    public T getValue() {
        return this.value;
    }
}
