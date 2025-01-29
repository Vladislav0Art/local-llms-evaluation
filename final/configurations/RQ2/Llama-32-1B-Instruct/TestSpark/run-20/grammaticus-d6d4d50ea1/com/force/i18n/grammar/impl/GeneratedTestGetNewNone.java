package com.force.i18n.grammar.impl;

public class GeneratedTestGetNewNone {

    @Test
    public void testGetNewNone() {
        Map<String, String> map = new HashMap<>();
        map.put("key1", "value1");

        GrammaticalTermMap<T> mapInstance = new GrammaticalTermMapImpl<>(map);
        assertNull(mapInstance.get("key2"));
    }

}