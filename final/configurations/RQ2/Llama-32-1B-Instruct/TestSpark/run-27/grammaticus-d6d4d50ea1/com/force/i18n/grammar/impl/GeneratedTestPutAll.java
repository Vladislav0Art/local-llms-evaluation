package com.force.i18n.grammar.impl;

public class GeneratedTestPutAll {

    @Test
    public void testPutAll() {
        String term1 = "term1";
        String term2 = "term2";
        GrammaticalTermMap<T> map = new GrammaticalTermMapImpl<Map<String, T>, String>(new HashMap<>(), false);
        map.put(term1, "expected_term");
        map.put(term2, "expected_term");

        GrammaticalTerm actualTerm = map.get(term1);
        assertEquals("expected_term", actualTerm);

        T expectedTerm = new Noun("Test");
        GrammaticalTerm actualActualTerm = map.get(term2);
        assertEquals(expectedTerm, actualActualTerm);
    }

}