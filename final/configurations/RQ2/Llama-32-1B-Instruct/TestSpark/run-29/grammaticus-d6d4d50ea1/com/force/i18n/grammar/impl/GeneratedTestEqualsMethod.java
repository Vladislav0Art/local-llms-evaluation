package com.force.i18n.grammar.impl;

public class GeneratedTestEqualsMethod {

    @Test
    public void testEqualsMethod() {
        TestUtils.createGrammaticalTermMap(new HashMap<>(), true)
                .equals(TestUtils.getGrammaticalTermMap(new HashMap<>(), false))
                .assertThat(true);
    }

}