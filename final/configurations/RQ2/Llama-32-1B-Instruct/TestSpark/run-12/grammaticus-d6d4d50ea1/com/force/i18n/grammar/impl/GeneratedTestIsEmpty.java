package com.force.i18n.grammar.impl;

public class GeneratedTestIsEmpty {

    private static final HumanLanguage humanLanguage = new HumanLanguage();

    @Test
    public void testIsEmpty() {
        GrammaticalTermMapImpl<String, String> map = new GrammaticalTermMapImpl<>(Map.of(), true);
        assertTrue(map.isEmpty());
    }

}