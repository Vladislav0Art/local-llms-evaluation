package com.force.i18n.grammar.impl;

public class GeneratedIsEmpty_KnownInstance_ReturnsFalse {

    private static final Map<String, String> LANGUAGE_DICTIONARY = ImmutableMap.of(
            "en", "English",
            "fr", "French"
    );

    @Test
    public void isEmpty_KnownInstance_ReturnsFalse() {
        // given
        Map<String, GrammaticalTerm> map = ImmutableMap.of(
                "test", new GrammaticalTermImpl()
        );
        boolean isSkinny = true;
        GrammaticalTermMap<GrammaticalTerm> instance = new GrammaticalTermMapImpl<>(map, isSkinny);

        // when
        boolean isEmpty = instance.isEmpty();

        // then
        assertFalse(isEmpty);
    }

}