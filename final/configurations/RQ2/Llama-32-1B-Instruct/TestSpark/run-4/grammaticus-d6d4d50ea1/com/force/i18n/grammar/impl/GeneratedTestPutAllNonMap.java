package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class GeneratedTestPutAllNonMap {

    @Test
    public void testPutAllNonMap() {
        LanguageDictionary languageDictionary = new LanguageDictionary();
        String[] json1 = {"key1", "value1"};
        RenamingProvider renamingProvider = new RenamingProvider("oldKey");
        assertTrue(GrammaticalTermMapImpl.of(new HashMap<>()).putAll(null).equals(false));
    }

}