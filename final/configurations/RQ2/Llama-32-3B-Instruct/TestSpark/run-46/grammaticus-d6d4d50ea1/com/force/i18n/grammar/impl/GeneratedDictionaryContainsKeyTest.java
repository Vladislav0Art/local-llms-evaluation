package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedDictionaryContainsKeyTest {

    @Test
    public void dictionaryContainsKeyTest() {
        LanguageDictionary dictionary = new LanguageDictionary();
        dictionary.put("key", "value");
        assertTrue(dictionary.containsKey("key"));
    }

}