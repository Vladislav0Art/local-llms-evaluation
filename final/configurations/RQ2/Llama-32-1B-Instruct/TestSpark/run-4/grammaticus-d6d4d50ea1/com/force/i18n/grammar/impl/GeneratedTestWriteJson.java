package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class GeneratedTestWriteJson {

    @Test
    public void testWriteJson() {
        LanguageDictionary languageDictionary = new LanguageDictionary();
        String[] json = {"key1", "value1"};
        RenamingProvider renamingProvider = new RenamingProvider("oldKey");
        assertTrue(GrammaticalTermMapImpl.of(new HashMap<>()).writeJson(null, null, languageDictionary, java.util.Arrays.asList(json)).equals(true));
    }

}