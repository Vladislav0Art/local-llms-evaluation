package com.force.i18n.grammar.impl;

public class GeneratedTestValues {

    @Test
    public void testValues() {
        String termName = "test_term";
        GrammaticalTermMap<T> map = new GrammaticalTermMapImpl<Map<String, T>, String>(new HashMap<>(), false);
        T expectedTerm = new Noun("Test");
        map.put(termName, expectedTerm);
        List<T> actualValues = map.values();
        assertEquals(1, actualValues.size());
        GrammaticalTerm actualTerm = actualValues.get(0);
        assertEquals(expectedTerm, actualTerm);
    }

}