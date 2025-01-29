package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class GeneratedTestWriteJsonNull {

    @Test
    public void testWriteJsonNull() {
        LanguageDictionary languageDictionary = new LanguageDictionary();
        RenamingProvider renamingProvider = new RenamingProvider("oldKey");
        assertTrue(GrammaticalTermMapImpl.of(new HashMap<>()).writeJson(null, null, languageDictionary, java.util.Arrays.asList(json)).equals(true));
    }

}