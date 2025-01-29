package com.force.i18n.grammar.impl;

public class GeneratedTestGetKeySetNonExistentKey {

    @Test
    public void testGetKeySetNonExistentKey() {
        Map<String, String> map = new HashMap<>();
        map.put("term1", "value1");

        GrammaticalTermMapImpl<String, String> mockGrammaticalTermMap = new GrammaticalTermMapImpl<>(map, false);

        Set<String> expectedSet = ImmutableMap.of();

        assertEquals(expectedSet, mockGrammaticalTermMap.getKeySet());
    }

}