package com.leetcode.abstracts;

public class Answer<T> {
    public T value;

    public Answer(){
    }

    public void setValue(T value){
        this.value = value;
    }

    public T getValue() {
        return this.value;
    }
}
