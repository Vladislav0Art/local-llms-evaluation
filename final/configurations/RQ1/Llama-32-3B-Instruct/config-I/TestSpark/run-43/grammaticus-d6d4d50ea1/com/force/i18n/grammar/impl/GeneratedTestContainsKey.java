package com.force.i18n.grammar.impl;

public class GeneratedTestContainsKey {

    private static final GrammaticalTermMapImpl<String> map = new GrammaticalTermMapImpl<>();
    private static final RenamingProvider renamingProvider = mock(RenamingProvider.class);
    private static final LanguageDictionary dictionary = mock(LanguageDictionary.class);

    @Test
    public void testContainsKey() {
        map.put("test", new GrammaticalTermImpl());
        assertTrue(map.containsKey("test"));
    }

}