package com.force.i18n.grammar.impl;

public class GeneratedTestValues {

    private static final HumanLanguage humanLanguage = new HumanLanguage();

    @Test
    public void testValues() {
        GrammaticalTermMapImpl<String, String> map = new GrammaticalTermMapImpl<>(Map.of("noun", "word1"), false);
        Collection<T> values = map.values();
        assertTrue(values.contains(T.class));
    }

}