package com.force.i18n.grammar.impl;

public class GeneratedTestKeySetMethod {

    @Test
    public void testKeySetMethod() {
        TestUtils.createGrammaticalTermMap(new HashMap<>(), true)
                .keySet()
                .assertThat(sets -> sets.containsAll(TestUtils.getGrammaticalTerms("test")));
    }

}