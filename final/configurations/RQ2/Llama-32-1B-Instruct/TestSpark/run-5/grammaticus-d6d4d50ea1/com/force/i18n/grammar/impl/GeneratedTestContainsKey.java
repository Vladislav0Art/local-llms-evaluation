package com.force.i18n.grammar.impl;

public class GeneratedTestContainsKey {

    @Test
    public void testContainsKey() {
        GrammaticalTermMapImpl<String, String> map = new GrammaticalTermMapImpl<>(new HashMap<>(), false);

        boolean contains = map.containsKey("key");

        assertTrue(contains);
    }

}