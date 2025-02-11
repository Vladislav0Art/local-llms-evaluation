package com.force.i18n.grammar.impl;

public class GeneratedTestPut {

    private static final GrammaticalTermMapImpl<String> map = new GrammaticalTermMapImpl<>();
    private static final RenamingProvider renamingProvider = mock(RenamingProvider.class);
    private static final LanguageDictionary dictionary = mock(LanguageDictionary.class);

    @Test
    public void testPut() {
        GrammaticalTermMapImpl<String> map = new GrammaticalTermMapImpl<>();
        map.put("test", null);
        assertEquals(0, map.map.size());
    }

}