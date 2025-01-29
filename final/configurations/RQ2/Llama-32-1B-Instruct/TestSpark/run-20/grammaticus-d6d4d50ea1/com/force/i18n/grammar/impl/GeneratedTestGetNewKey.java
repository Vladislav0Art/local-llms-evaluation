package com.force.i18n.grammar.impl;

public class GeneratedTestGetNewKey {

    @Test
    public void testGetNewKey() {
        Map<String, String> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");

        GrammaticalTermMap<T> mapInstance = new GrammaticalTermMapImpl<>(map);
        GrammaticalTerm term = mapInstance.get("key3");
        assertNull(term);

        setExpectedValue(term, "");
    }

}