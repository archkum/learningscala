package com.github.learningscala;

/**
 * Created by archana on 12/12/15.
 */
public class FizzBuzz {
    public String getFizzBuzz(int i){

        if (i == 0) {
            return "0";
        }

        else if ((i%3) == 0 && (i%5 == 0)){
            return "fizz buzz";
        }
        else if ((i%3) == 0){
            return "fizz";
        }
        else if ((i%5) == 0){
            return "buzz";
        }
        else
            return i + "";
    }
}
