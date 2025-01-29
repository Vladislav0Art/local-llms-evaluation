package com.force.i18n.grammar.impl;

public class GeneratedTestEntrySet {

    @Test
    public void testEntrySet() {
        GrammaticalTermMapImpl<String, String> map = new GrammaticalTermMapImpl<>(new HashMap<>(), false);

        Set<Map.Entry<String, String>> entrySet = map.entrySet();

        assertTrue(entrySet.size() == 1);
    }

}