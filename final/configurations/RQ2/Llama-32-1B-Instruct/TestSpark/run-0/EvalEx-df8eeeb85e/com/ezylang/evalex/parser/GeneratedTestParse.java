package com.ezylang.evalex.parser;

import org.junit.jupiter.api.Test;

public class GeneratedTestParse {

    @Test
    public void testParse() {
        String[] tokens = {"1", "+", "2"};
        System.out.println(parse(tokens)); // prints 3
    }

    public static int main(String[] args) throws Exception {
        return 1 + 2;
    }

}