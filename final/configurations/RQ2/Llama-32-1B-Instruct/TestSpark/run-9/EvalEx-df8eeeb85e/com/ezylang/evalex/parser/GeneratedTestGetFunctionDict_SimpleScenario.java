package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GeneratedTestGetFunctionDict_SimpleScenario {

    @Test
    public void testGetFunctionDict_SimpleScenario() {
        String input = "{x: (print x)}";
        Object output = Parser.getFunctionDict(input);
        assertThat(output).isInstanceOf(java.util.HashMap.class);
        ((java.util.HashMap<String, Object>) output).containsKey("x");
        ((java.util.HashMap<String, Object>) output).get("x").toString();
    }

}