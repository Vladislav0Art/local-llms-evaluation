package com.force.i18n.grammar.impl;

public class GeneratedTestGet {

    @Test
    public void testGet() {
        GrammaticalTermMapImpl<String, String> map = new GrammaticalTermMapImpl<>();
        map.put("term1", "value1");
        Map<String, String> value = map.get("term1");
        assertEquals("value1", value);
    }

}