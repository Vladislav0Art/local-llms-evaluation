package com.force.i18n.grammar.impl;

public class GeneratedTestEquals {

    @Test
    public void testEquals() {
        Map<String, String> map1 = new HashMap<>();
        map1.put("key1", "value1");

        Map<String, String> map2 = new HashMap<>();
        map2.put("key1", "value1");

        GrammaticalTermMap<T> mapInstance1 = new GrammaticalTermMapImpl<>(map1);
        GrammaticalTermMap<T> mapInstance2 = new GrammaticalTermMapImpl<>(map2);

        assertTrue(mapInstance1.equals(mapInstance2));
    }

}