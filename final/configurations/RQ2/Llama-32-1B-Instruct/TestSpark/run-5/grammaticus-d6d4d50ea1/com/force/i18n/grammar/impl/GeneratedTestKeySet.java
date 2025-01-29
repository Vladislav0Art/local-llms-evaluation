package com.force.i18n.grammar.impl;

public class GeneratedTestKeySet {

    @Test
    public void testKeySet() {
        GrammaticalTermMapImpl<String, String> map = new GrammaticalTermMapImpl<>(new HashMap<>(), false);

        Set<String> keys = map.keySet();

        assertTrue(keys.size() == 1);
    }

}