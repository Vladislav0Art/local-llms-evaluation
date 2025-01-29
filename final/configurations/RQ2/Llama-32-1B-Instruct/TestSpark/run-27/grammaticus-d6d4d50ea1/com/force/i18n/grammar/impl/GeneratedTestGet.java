package com.force.i18n.grammar.impl;

public class GeneratedTestGet {

    @Test
    public void testGet() {
        String termName = "test_term";
        GrammaticalTermMap<T> map = new GrammaticalTermMapImpl<Map<String, T>, String>(new HashMap<>(), false);
        T expectedTerm = new Noun("Test");
        GrammaticalTerm actualTerm = map.get(termName);
        assertEquals(expectedTerm, actualTerm);
    }

}