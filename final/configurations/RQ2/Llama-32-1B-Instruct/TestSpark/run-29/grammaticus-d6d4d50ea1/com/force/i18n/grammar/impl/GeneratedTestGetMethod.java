package com.force.i18n.grammar.impl;

public class GeneratedTestGetMethod {

    @Test
    public void testGetMethod() {
        TestUtils.createGrammaticalTermMap(new HashMap<>(), true)
                .get("test")
                .assertSame(TestUtils.getGrammaticalTerm("test"));
    }

}