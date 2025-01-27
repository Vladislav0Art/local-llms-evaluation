package com.force.i18n.grammar.impl;

public class GeneratedIsEmpty_NewInstance_ReturnsTrue {

    private static final Map<String, String> LANGUAGE_DICTIONARY = ImmutableMap.of(
            "en", "English",
            "fr", "French"
    );

    @Test
    public void isEmpty_NewInstance_ReturnsTrue() {
        // given
        boolean isSkinny = true;
        GrammaticalTermMap<GrammaticalTerm> instance = new GrammaticalTermMapImpl<>();

        // when
        boolean isEmpty = instance.isEmpty();

        // then
        assertTrue(isEmpty);
    }

}