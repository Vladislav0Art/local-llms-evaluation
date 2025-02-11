package com.force.i18n.grammar.impl;

public class GeneratedTestEquals {

    private static final GrammaticalTermMapImpl<String> map = new GrammaticalTermMapImpl<>();
    private static final RenamingProvider renamingProvider = mock(RenamingProvider.class);
    private static final LanguageDictionary dictionary = mock(LanguageDictionary.class);

    @Test
    public void testEquals() {
        GrammaticalTermMapImpl<String> map1 = new GrammaticalTermMapImpl<>();
        GrammaticalTermMapImpl<String> map2 = new GrammaticalTermMapImpl<>();
        assertEquals(false, map1.equals(map2));
        map1.put("test", null);
        assertEquals(true, map1.equals(map2));
    }

}