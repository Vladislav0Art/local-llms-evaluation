package com.force.i18n.grammar.impl;

public class GeneratedTestKeySetNull {

    @Test
    public void testKeySetNull() {
        Map<String, String> map = new HashMap<>();
        map.put("key1", "value1");

        GrammaticalTermMap<T> mapInstance = new GrammaticalTermMapImpl<>(map);
        assertNotNull(mapInstance.keySet());
    }

}