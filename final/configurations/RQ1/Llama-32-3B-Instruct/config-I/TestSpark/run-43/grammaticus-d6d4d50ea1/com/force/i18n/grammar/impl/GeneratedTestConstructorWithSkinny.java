package com.force.i18n.grammar.impl;

public class GeneratedTestConstructorWithSkinny {

    private static final GrammaticalTermMapImpl<String> map = new GrammaticalTermMapImpl<>();
    private static final RenamingProvider renamingProvider = mock(RenamingProvider.class);
    private static final LanguageDictionary dictionary = mock(LanguageDictionary.class);

    @Test
    public void testConstructorWithSkinny() {
        GrammaticalTermMapImpl<String> map = new GrammaticalTermMapImpl<>(map, true);
        assertTrue(map.isSkinny());
    }

}