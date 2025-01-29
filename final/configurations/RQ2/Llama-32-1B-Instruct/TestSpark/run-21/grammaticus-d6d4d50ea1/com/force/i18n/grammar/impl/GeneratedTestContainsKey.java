package com.force.i18n.grammar.impl;

public class GeneratedTestContainsKey {

    @Test
    public void testContainsKey() {
        GrammaticalTermMapImpl<String, String> map = new GrammaticalTermMapImpl<>();
        map.put("term1", "value1");
        assertTrue(map.containsKey("term1"));
    }

}