package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class GeneratedTestWriteJsonEmpty {

    @Test
    public void testWriteJsonEmpty() {
        LanguageDictionary languageDictionary = new LanguageDictionary();
        String[] json = {};
        RenamingProvider renamingProvider = new RenamingProvider("oldKey");
        assertTrue(GrammaticalTermMapImpl.of(new HashMap<>()).writeJson(null, null, languageDictionary, java.util.Arrays.asList(json)).equals(true));
    }

}