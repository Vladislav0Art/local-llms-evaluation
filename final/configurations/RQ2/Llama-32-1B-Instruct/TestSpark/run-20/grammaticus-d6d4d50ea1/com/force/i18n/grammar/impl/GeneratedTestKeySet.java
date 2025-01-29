package com.force.i18n.grammar.impl;

public class GeneratedTestKeySet {

    @Test
    public void testKeySet() {
        Map<String, String> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key3", "value3");

        GrammaticalTermMap<T> mapInstance = new GrammaticalTermMapImpl<>(map);
        Set<String> expected = ImmutableMap.of("key1", "value1");
        assertEquals(expected, mapInstance.keySet());
    }

}