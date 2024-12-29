package com.force.i18n.grammar.impl;

public class GeneratedContainsKeyTests {

    private static final HumanLanguage ENGLISH = new HumanLanguage("English");
    private static final ImmutableMap<String, T> ENGLISH_MAP = ImmutableMap.of("term1", new Noun(ENGLISH, "Noun"));
    private static final ImmutableMap<String, T> EMPTY_MAP = ImmutableMap.of();

    @Test
    public void containsKeyTests() {
        GrammaticalTermMapImpl<T> map = new GrammaticalTermMapImpl<>(ENGLISH_MAP);
        assertTrue(map.containsKey("term1"));
        assertFalse(map.containsKey("nonExistentTerm"));
    }

}