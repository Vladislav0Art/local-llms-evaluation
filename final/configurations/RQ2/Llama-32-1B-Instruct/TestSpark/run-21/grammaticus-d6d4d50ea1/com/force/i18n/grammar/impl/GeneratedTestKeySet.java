package com.force.i18n.grammar.impl;

public class GeneratedTestKeySet {

    @Test
    public void testKeySet() {
        GrammaticalTermMapImpl<String, String> map = new GrammaticalTermMapImpl<>();
        map.put("term1", "value1");
        Set<String> keySet = map.keySet();
        assertEquals(1, keySet.size());
    }

}