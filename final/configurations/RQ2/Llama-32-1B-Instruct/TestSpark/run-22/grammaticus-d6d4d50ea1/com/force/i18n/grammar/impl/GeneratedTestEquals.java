package com.force.i18n.grammar.impl;

public class GeneratedTestEquals {

    @Test
    public void testEquals() {
        Map<String, String> map1 = new HashMap<>();
        map1.put("term1", "value1");
        map1.put("term2", "value2");

        GrammaticalTermMapImpl<String, String> mockGrammaticalTermMap1 = new GrammaticalTermMapImpl<>(map1, false);

        Map<String, String> map2 = new HashMap<>();
        map2.put("term1", "value1");
        map2.put("term3", "value3");

        GrammaticalTermMapImpl<String, String> mockGrammaticalTermMap2 = new GrammaticalTermMapImpl<>(map2, false);

        assertTrue(mockGrammaticalTermMap1.equals(mockGrammaticalTermMap2));
    }

}