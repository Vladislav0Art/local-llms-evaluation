package com.force.i18n.grammar.impl;

public class GeneratedTestKeySet {

    @Test
    public void testKeySet() {
        String term1 = "term1";
        String term2 = "term2";
        GrammaticalTermMap<T> map = new GrammaticalTermMapImpl<Map<String, T>, String>(new HashMap<>(), false);
        Set<String> expectedKeySet = new HashSet<>();
        expectedKeySet.add(term1);
        expectedKeySet.add(term2);
        map.put(term1, "expected_term");
        map.put(term2, "expected_term");
        assertEquals(expectedKeySet, map.keySet());
    }

}