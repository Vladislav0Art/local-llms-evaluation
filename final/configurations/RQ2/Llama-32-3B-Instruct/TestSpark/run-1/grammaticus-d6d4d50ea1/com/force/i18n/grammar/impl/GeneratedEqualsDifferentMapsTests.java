package com.force.i18n.grammar.impl;

public class GeneratedEqualsDifferentMapsTests {

    private static final HumanLanguage ENGLISH = new HumanLanguage("English");
    private static final ImmutableMap<String, T> ENGLISH_MAP = ImmutableMap.of("term1", new Noun(ENGLISH, "Noun"));
    private static final ImmutableMap<String, T> EMPTY_MAP = ImmutableMap.of();

    @Test
    public void equalsDifferentMapsTests() {
        GrammaticalTermMapImpl<T> obj1 = new GrammaticalTermMapImpl<>(ENGLISH_MAP);
        GrammaticalTermMapImpl<T> obj2 = new GrammaticalTermMapImpl<>(ImmutableMap.of());
        assertFalse(obj1.equals(obj2));
    }

}