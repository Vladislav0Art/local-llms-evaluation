package com.force.i18n.grammar.impl;

public class GeneratedTestContainsKey {

    private static final HumanLanguage humanLanguage = new HumanLanguage();

    @Test
    public void testContainsKey() {
        GrammaticalTermMapImpl<String, String> map = new GrammaticalTermMapImpl<>(Map.of("noun", "word1"), false);
        assertTrue(map.containsKey("noun"));
        assertFalse(map.containsKey("other"));
    }

}