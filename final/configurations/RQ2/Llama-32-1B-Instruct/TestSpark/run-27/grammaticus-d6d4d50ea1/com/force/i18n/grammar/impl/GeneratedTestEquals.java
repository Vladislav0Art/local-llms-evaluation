package com.force.i18n.grammar.impl;

public class GeneratedTestEquals {

    @Test
    public void testEquals() {
        String term1 = "test_term";
        String term2 = "test_term";
        GrammaticalTermMap<T> map = new GrammaticalTermMapImpl<Map<String, T>, String>(new HashMap<>(), false);
        T expectedTerm = new Noun("Test");
        GrammaticalTerm actualTerm = map.get(term1);
        assertEquals(expectedTerm, actualTerm);
    }

}