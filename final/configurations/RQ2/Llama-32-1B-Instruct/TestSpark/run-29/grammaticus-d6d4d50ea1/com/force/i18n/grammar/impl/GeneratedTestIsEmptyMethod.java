package com.force.i18n.grammar.impl;

public class GeneratedTestIsEmptyMethod {

    @Test
    public void testIsEmptyMethod() {
        TestUtils.createGrammaticalTermMap(new HashMap<>(), true)
                .isEmpty()
                .assertThat(false);
    }

}