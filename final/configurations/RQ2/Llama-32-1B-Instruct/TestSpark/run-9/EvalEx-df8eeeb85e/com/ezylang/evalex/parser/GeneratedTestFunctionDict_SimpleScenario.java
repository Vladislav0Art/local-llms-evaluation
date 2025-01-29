package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GeneratedTestFunctionDict_SimpleScenario {

    @Test
    public void testFunctionDict_SimpleScenario() {
        String input = "(x) { print(x); }";
        Object output = Parser.parse(input);
        assertThat(output).isInstanceOf(java.util.List.class);
        ((java.util.List) output).get(0).toString();
    }

}