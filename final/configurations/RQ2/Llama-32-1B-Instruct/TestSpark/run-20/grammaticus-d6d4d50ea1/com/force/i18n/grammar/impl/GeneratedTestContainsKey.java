package com.force.i18n.grammar.impl;

public class GeneratedTestContainsKey {

    @Test
    public void testContainsKey() {
        Map<String, String> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key3", "value3");

        GrammaticalTermMap<T> mapInstance = new GrammaticalTermMapImpl<>(map);
        assertTrue(mapInstance.containsKey("key2"));
    }

}