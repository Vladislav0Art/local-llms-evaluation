package com.force.i18n.grammar.impl;

public class GeneratedTestGet {

    private static final GrammaticalTermMapImpl<String> map = new GrammaticalTermMapImpl<>();
    private static final RenamingProvider renamingProvider = mock(RenamingProvider.class);
    private static final LanguageDictionary dictionary = mock(LanguageDictionary.class);

    @Test
    public void testGet() {
        map.put("test", new GrammaticalTermImpl());
        assertEquals(new GrammaticalTermImpl(), map.get("test"));
    }

}