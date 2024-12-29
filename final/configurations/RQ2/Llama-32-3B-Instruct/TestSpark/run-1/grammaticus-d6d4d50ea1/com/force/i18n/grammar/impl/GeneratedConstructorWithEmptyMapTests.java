package com.force.i18n.grammar.impl;

public class GeneratedConstructorWithEmptyMapTests {

    private static final HumanLanguage ENGLISH = new HumanLanguage("English");
    private static final ImmutableMap<String, T> ENGLISH_MAP = ImmutableMap.of("term1", new Noun(ENGLISH, "Noun"));
    private static final ImmutableMap<String, T> EMPTY_MAP = ImmutableMap.of();

    @Test
    public void constructorWithEmptyMapTests() {
        GrammaticalTermMapImpl<T> map = new GrammaticalTermMapImpl<>(EMPTY_MAP);
        assertNotNull(map.getTerms());
        assertEquals(EMPTY_MAP, map.getTerms());
    }

}