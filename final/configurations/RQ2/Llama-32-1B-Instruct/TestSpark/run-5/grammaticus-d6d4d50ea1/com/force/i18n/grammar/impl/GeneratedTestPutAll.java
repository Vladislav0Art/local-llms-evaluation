package com.force.i18n.grammar.impl;

public class GeneratedTestPutAll {

    @Test
    public void testPutAll() {
        GrammaticalTermMapImpl<String, String> map = new GrammaticalTermMapImpl<>(new HashMap<>(), false);

        Map<String, String> otherMap = new HashMap<>();

        map.putAll(otherMap);

        assertEquals(1, map.keySet().size());
    }

}