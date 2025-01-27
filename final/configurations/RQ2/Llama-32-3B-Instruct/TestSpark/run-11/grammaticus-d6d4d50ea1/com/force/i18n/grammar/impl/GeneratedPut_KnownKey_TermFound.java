package com.force.i18n.grammar.impl;

public class GeneratedPut_KnownKey_TermFound {

    private static final Map<String, String> LANGUAGE_DICTIONARY = ImmutableMap.of(
            "en", "English",
            "fr", "French"
    );

    @Test
    public void put_KnownKey_TermFound() {
        // given
        Map<String, GrammaticalTerm> map = ImmutableMap.of(
                "test", new GrammaticalTermImpl()
        );
        boolean isSkinny = true;
        GrammaticalTermMap<GrammaticalTerm> instance = new GrammaticalTermMapImpl<>(map, isSkinny);
        RenamingProvider renamingProvider = Mockito.mock(RenamingProvider.class);
        LanguageDictionary dictionary = LANGUAGE_DICTIONARY;
        Collection<String> termsToInclude = Collections.emptySet();
        Appendable out = mock(Appendable.class);

        // when
        instance.put("test", new GrammaticalTermImpl());

        // then
        verify(renamingProvider).doNothing();
    }

}