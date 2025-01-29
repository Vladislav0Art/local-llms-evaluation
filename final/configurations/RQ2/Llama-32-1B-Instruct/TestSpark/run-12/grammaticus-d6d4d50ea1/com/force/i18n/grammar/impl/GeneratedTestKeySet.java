package com.force.i18n.grammar.impl;

public class GeneratedTestKeySet {

    private static final HumanLanguage humanLanguage = new HumanLanguage();

    @Test
    public void testKeySet() {
        GrammaticalTermMapImpl<String, String> map = new GrammaticalTermMapImpl<>(Map.of("noun", "word1"), false);
        Set<String> keySet = map.keySet();
        assertEquals(1, keySet.size());
    }

}