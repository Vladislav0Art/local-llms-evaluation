package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class GeneratedTestPutAllEmpty {

    @Test
    public void testPutAllEmpty() {
        LanguageDictionary languageDictionary = new LanguageDictionary();
        String[] json1 = {};
        RenamingProvider renamingProvider = new RenamingProvider("oldKey");
        assertTrue(GrammaticalTermMapImpl.of(new HashMap<>()).putAll(null).equals(true));
    }

}