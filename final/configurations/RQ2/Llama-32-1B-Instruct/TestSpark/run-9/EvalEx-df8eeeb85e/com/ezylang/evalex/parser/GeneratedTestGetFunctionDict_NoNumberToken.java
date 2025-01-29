package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GeneratedTestGetFunctionDict_NoNumberToken {

    @Test
    public void testGetFunctionDict_NoNumberToken() {
        String input = "{x: (print x)}";
        Object output = Parser.getFunctionDict(input);
        assertThat(output).isInstanceOf(java.util.HashMap.class);
        ((java.util.HashMap<String, Object>) output).containsKey("x");
        ((java.util.HashMap<String, Object>) output).get("x").toString();
    }

}