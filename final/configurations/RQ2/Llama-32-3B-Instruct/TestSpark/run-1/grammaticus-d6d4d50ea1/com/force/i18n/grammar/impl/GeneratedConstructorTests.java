package com.force.i18n.grammar.impl;

public class GeneratedConstructorTests {

    private static final HumanLanguage ENGLISH = new HumanLanguage("English");
    private static final ImmutableMap<String, T> ENGLISH_MAP = ImmutableMap.of("term1", new Noun(ENGLISH, "Noun"));
    private static final ImmutableMap<String, T> EMPTY_MAP = ImmutableMap.of();

    @Test
    public void constructorTests() {
        GrammaticalTermMapImpl<T> map1 = new GrammaticalTermMapImpl<>(ENGLISH_MAP);
        GrammaticalTermMapImpl<T> map2 = new GrammaticalTermMapImpl<>();

        assertEquals(ENGLISH_MAP, map1.getTerms());
        assertNull(map2.getTerms());
    }

}