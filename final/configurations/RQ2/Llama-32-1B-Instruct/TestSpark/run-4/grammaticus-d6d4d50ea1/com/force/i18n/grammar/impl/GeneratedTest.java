package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class GeneratedTest {

    @Test
    public void testWriteJson() {
        LanguageDictionary languageDictionary = new LanguageDictionary();
        String[] json = {"key1", "value1"};
        RenamingProvider renamingProvider = new RenamingProvider("oldKey");
        assertTrue(GrammaticalTermMapImpl.of(new HashMap<>()).writeJson(null, null, languageDictionary, java.util.Arrays.asList(json)).equals(true));
    }

    @Test
    public void testWriteJsonNull() {
        LanguageDictionary languageDictionary = new LanguageDictionary();
        RenamingProvider renamingProvider = new RenamingProvider("oldKey");
        assertTrue(GrammaticalTermMapImpl.of(new HashMap<>()).writeJson(null, null, languageDictionary, java.util.Arrays.asList(json)).equals(true));
    }

    @Test
    public void testWriteJsonEmpty() {
        LanguageDictionary languageDictionary = new LanguageDictionary();
        String[] json = {};
        RenamingProvider renamingProvider = new RenamingProvider("oldKey");
        assertTrue(GrammaticalTermMapImpl.of(new HashMap<>()).writeJson(null, null, languageDictionary, java.util.Arrays.asList(json)).equals(true));
    }

    @Test
    public void testPutAll() {
        LanguageDictionary languageDictionary = new LanguageDictionary();
        String[] json1 = {"key1", "value1"};
        RenamingProvider renamingProvider = new RenamingProvider("oldKey");
        assertTrue(GrammaticalTermMapImpl.of(new HashMap<>()).putAll(null).equals(true));
    }

    @Test
    public void testPutAllEmpty() {
        LanguageDictionary languageDictionary = new LanguageDictionary();
        String[] json1 = {};
        RenamingProvider renamingProvider = new RenamingProvider("oldKey");
        assertTrue(GrammaticalTermMapImpl.of(new HashMap<>()).putAll(null).equals(true));
    }

    @Test
    public void testPutAllNonMap() {
        LanguageDictionary languageDictionary = new LanguageDictionary();
        String[] json1 = {"key1", "value1"};
        RenamingProvider renamingProvider = new RenamingProvider("oldKey");
        assertTrue(GrammaticalTermMapImpl.of(new HashMap<>()).putAll(null).equals(false));
    }

}