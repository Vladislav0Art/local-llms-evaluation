package com.force.i18n.grammar.impl;

public class GeneratedMakeSkinnyTests {

    private static final HumanLanguage ENGLISH = new HumanLanguage("English");
    private static final ImmutableMap<String, T> ENGLISH_MAP = ImmutableMap.of("term1", new Noun(ENGLISH, "Noun"));
    private static final ImmutableMap<String, T> EMPTY_MAP = ImmutableMap.of();

    @Test
    public void makeSkinnyTests() {
        GrammaticalTermMapImpl<T> map = new GrammaticalTermMapImpl<>(ENGLISH_MAP);
        GrammaticalTermMapImpl<T> skinnyMap = map.makeSkinny();
        assertNotNull(skinnyMap);
        assertTrue(skinnyMap.isSkinny());
    }

}