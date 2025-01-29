package com.force.i18n.grammar.impl;

public class GeneratedTestGetKeySet {

    @Test
    public void testGetKeySet() {
        Map<String, String> map = new HashMap<>();
        map.put("term1", "value1");
        map.put("term2", "value2");

        GrammaticalTermMapImpl<String, String> mockGrammaticalTermMap = new GrammaticalTermMapImpl<>(map, false);

        Set<String> expectedSet = ImmutableMap.copyOf(map);
        assertEquals(expectedSet, mockGrammaticalTermMap.getKeySet());
    }

}