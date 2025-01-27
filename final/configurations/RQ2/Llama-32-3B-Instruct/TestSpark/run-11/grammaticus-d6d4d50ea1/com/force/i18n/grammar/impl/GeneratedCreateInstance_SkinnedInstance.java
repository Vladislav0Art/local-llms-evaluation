package com.force.i18n.grammar.impl;

public class GeneratedCreateInstance_SkinnedInstance {

    private static final Map<String, String> LANGUAGE_DICTIONARY = ImmutableMap.of(
            "en", "English",
            "fr", "French"
    );

    @Test
    public void createInstance_SkinnedInstance() {
        // given
        Map<String, GrammaticalTerm> map = ImmutableMap.of(
                "test", new GrammaticalTermImpl()
        );
        boolean isSkinny = true;
        GrammaticalTermMap<GrammaticalTerm> instance = new GrammaticalTermMapImpl<>(map, isSkinny);

        // when
        GrammaticalTerm term = instance.get("test");

        // then
        assertNotNull(term);
    }

}