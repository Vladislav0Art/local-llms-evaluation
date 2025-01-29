package com.force.i18n.grammar.impl;

public class GeneratedTestWriteJson {

    @Test
    public void testWriteJson() {
        String[] termsToInclude = {"term1", "term2"};
        Appendable out = System.out;
        RenamingProvider renamingProvider = new RenamingProvider();
        LanguageDictionary dictionary = new LanguageDictionary();
        Collection<String> termsToIncludeCopy = new HashSet<>(termsToInclude);
        GrammaticalTermMapImpl<T> map = new GrammaticalTermMapImpl<Map<String, T>, String>(new HashMap<>(), false);
        map.writeJson(out, renamingProvider, dictionary, termsToIncludeCopy);
        assertEquals(2, out.length());
    }

}