package com.force.i18n.grammar.impl;

public class GeneratedEqualsSelfTests {

    private static final HumanLanguage ENGLISH = new HumanLanguage("English");
    private static final ImmutableMap<String, T> ENGLISH_MAP = ImmutableMap.of("term1", new Noun(ENGLISH, "Noun"));
    private static final ImmutableMap<String, T> EMPTY_MAP = ImmutableMap.of();

    @Test
    public void equalsSelfTests() {
        GrammaticalTermMapImpl<T> obj = new GrammaticalTermMapImpl<>(ENGLISH_MAP);
        assertTrue(obj.equals(obj));
    }

}