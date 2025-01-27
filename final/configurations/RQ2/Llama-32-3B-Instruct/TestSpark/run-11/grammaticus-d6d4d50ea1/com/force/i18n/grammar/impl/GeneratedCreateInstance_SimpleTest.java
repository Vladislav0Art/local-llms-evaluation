package com.force.i18n.grammar.impl;

public class GeneratedCreateInstance_SimpleTest {

    private static final Map<String, String> LANGUAGE_DICTIONARY = ImmutableMap.of(
            "en", "English",
            "fr", "French"
    );

    @Test
    public void createInstance_SimpleTest() {
        // given
        GrammaticalTermMap<GrammaticalTerm> map = new GrammaticalTermMapImpl<>();

        // when
        GrammaticalTerm term = map.get("test");

        // then
        assertNotNull(term);
    }

}