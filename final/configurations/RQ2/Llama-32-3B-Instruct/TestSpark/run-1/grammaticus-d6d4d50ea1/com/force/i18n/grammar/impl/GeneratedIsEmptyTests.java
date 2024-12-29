package com.force.i18n.grammar.impl;

public class GeneratedIsEmptyTests {

    private static final HumanLanguage ENGLISH = new HumanLanguage("English");
    private static final ImmutableMap<String, T> ENGLISH_MAP = ImmutableMap.of("term1", new Noun(ENGLISH, "Noun"));
    private static final ImmutableMap<String, T> EMPTY_MAP = ImmutableMap.of();

    @Test
    public void isEmptyTests() {
        GrammaticalTermMapImpl<T> obj = new GrammaticalTermMapImpl<>();
        assertTrue(obj.isEmpty());
        GrammaticalTermMapImpl<T> nonEmptyObj = new GrammaticalTermMapImpl<>(ENGLISH_MAP);
        assertFalse(nonEmptyObj.isEmpty());
    }

}