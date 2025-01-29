package com.force.i18n.grammar.impl;

public class GeneratedTestGetNoMatch {

    @Test
    public void testGetNoMatch() {
        Map<String, String> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key3", "value3");

        GrammaticalTermMap<T> mapInstance = new GrammaticalTermMapImpl<>(map);
        assertNotNull(mapInstance.get("key2"));
    }

}