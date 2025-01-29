package com.force.i18n.grammar.impl;

public class GeneratedTestMakeSkinny {

    @Test
    public void testMakeSkinny() {
        Map<String, Noun> map = new HashMap<>();
        map.put("term1", "value1");
        map.put("term2", "value2");

        GrammaticalTermMapImpl<Noun, String> mockGrammaticalTermMap = new GrammaticalTermMapImpl<>(map, false);

        GrammaticalTermMap<String, Noun> skinnyMockGrammaticalTermMap = new GrammaticalTermMap<>();
        skinnyMockGrammaticalTermMap.makeSkinny();
        assertEquals("value1", skinnyMockGrammaticalTermMap.get("term1"));

        mockGrammaticalTermMap.putAll(skinnyMockGrammaticalTermMap);
        assertTrue(mockGrammaticalTermMap.isEmpty());
    }

}