package com.force.i18n.grammar.impl;

public class GeneratedEqualsNullTests {

    private static final HumanLanguage ENGLISH = new HumanLanguage("English");
    private static final ImmutableMap<String, T> ENGLISH_MAP = ImmutableMap.of("term1", new Noun(ENGLISH, "Noun"));
    private static final ImmutableMap<String, T> EMPTY_MAP = ImmutableMap.of();

    @Test
    public void equalsNullTests() {
        GrammaticalTermMapImpl<T> obj1 = new GrammaticalTermMapImpl<>();
        GrammaticalTermMapImpl<T> obj2 = null;
        assertTrue(obj1.equals(obj2));
    }

}