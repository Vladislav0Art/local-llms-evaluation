package com.force.i18n.grammar.impl;

public class GeneratedIsSkinnyTests {

    private static final HumanLanguage ENGLISH = new HumanLanguage("English");
    private static final ImmutableMap<String, T> ENGLISH_MAP = ImmutableMap.of("term1", new Noun(ENGLISH, "Noun"));
    private static final ImmutableMap<String, T> EMPTY_MAP = ImmutableMap.of();

    @Test
    public void isSkinnyTests() {
        GrammaticalTermMapImpl<T> map = new GrammaticalTermMapImpl<>(ENGLISH_MAP);
        assertTrue(map.isSkinny());
        GrammaticalTermMapImpl<T> skinnyMap = new GrammaticalTermMapImpl<>(ENGLISH_MAP, true);
        assertTrue(skinnyMap.isSkinny());
    }

}