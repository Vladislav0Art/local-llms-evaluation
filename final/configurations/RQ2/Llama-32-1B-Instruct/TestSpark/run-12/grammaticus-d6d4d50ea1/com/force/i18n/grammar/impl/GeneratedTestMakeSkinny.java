package com.force.i18n.grammar.impl;

public class GeneratedTestMakeSkinny {

    private static final HumanLanguage humanLanguage = new HumanLanguage();

    @Test
    public void testMakeSkinny() {
        GrammaticalTermMap<String, String> map = new GrammaticalTermMapImpl<>(Map.of("noun", "word1"), true);
        GrammaticalTermMap<T> skinnyMap = map.makeSkinny();
        assertTrue(skinnyMap instanceof T);
    }

}