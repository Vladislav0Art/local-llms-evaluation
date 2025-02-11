package com.force.i18n.grammar.impl;

public class GeneratedTestIsEmpty {

    private static final GrammaticalTermMapImpl<String> map = new GrammaticalTermMapImpl<>();
    private static final RenamingProvider renamingProvider = mock(RenamingProvider.class);
    private static final LanguageDictionary dictionary = mock(LanguageDictionary.class);

    @Test
    public void testIsEmpty() {
        assertEquals(true, map.isEmpty());
        map.put("test", new GrammaticalTermImpl());
        assertEquals(false, map.isEmpty());
    }

}