package com.force.i18n.grammar.impl;

public class GeneratedTestEqualsNull {

    @Test
    public void testEqualsNull() {
        Map<String, String> map = new HashMap<>();
        map.put("key1", "value1");

        GrammaticalTermMap<T> mapInstance = null;

        assertTrue(mapInstance.equals(null));
    }

}