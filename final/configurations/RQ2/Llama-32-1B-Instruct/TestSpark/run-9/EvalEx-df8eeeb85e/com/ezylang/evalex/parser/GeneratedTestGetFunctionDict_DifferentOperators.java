package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GeneratedTestGetFunctionDict_DifferentOperators {

    @Test
    public void testGetFunctionDict_DifferentOperators() {
        String input = "(a * b) { print(a * b); }";
        Object output = Parser.getFunctionDict(input);
        assertThat(output).isInstanceOf(java.util.HashMap.class);
        ((java.util.HashMap<String, Object>) output).containsKey("print");
        ((java.util.HashMap<String, Object>) output).get("print").toString();
    }

}