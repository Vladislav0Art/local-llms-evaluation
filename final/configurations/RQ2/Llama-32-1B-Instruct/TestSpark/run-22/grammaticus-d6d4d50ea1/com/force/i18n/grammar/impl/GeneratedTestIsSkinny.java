package com.force.i18n.grammar.impl;

public class GeneratedTestIsSkinny {

    @Test
    public void testIsSkinny() {
        Map<String, Noun> map = new HashMap<>();
        map.put("term1", "value1");
        map.put("term2", "value2");

        GrammaticalTermMapImpl<Noun, String> mockGrammaticalTermMap = new GrammaticalTermMapImpl<>(map, true);

        assertTrue(mockGrammaticalTermMap.isSkinny());
    }

}