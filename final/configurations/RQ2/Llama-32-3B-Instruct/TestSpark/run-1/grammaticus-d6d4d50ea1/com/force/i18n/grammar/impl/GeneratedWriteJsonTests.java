package com.force.i18n.grammar.impl;

public class GeneratedWriteJsonTests {

    private static final HumanLanguage ENGLISH = new HumanLanguage("English");
    private static final ImmutableMap<String, T> ENGLISH_MAP = ImmutableMap.of("term1", new Noun(ENGLISH, "Noun"));
    private static final ImmutableMap<String, T> EMPTY_MAP = ImmutableMap.of();

    @Test
    public void writeJsonTests() throws IOException {
        GrammaticalTermMapImpl<T> obj = new GrammaticalTermMapImpl<>(ENGLISH_MAP);
        Appendable out = new StringBuilder();
        RenamingProvider renamingProvider = new RenamingProvider();
        LanguageDictionary dictionary = new LanguageDictionary();
        Collection<String> termsToInclude = ImmutableSet.of("term1");
        obj.writeJson(out, renamingProvider, dictionary, termsToInclude);
        assertNotNull(out.toString());
    }

}