package com.force.i18n.grammar.impl;

public class GeneratedTestGet {

    private static final HumanLanguage humanLanguage = new HumanLanguage();

    @Test
    public void testGet() {
        GrammaticalTermMapImpl<String, String> map = new GrammaticalTermMapImpl<>(Map.of("noun", "word1"), false);
        assertEquals("word1", map.get("noun"));
    }

}