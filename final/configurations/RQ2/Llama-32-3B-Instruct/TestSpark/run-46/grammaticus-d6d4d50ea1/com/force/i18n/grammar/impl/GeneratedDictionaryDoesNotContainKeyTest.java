package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedDictionaryDoesNotContainKeyTest {

    @Test
    public void dictionaryDoesNotContainKeyTest() {
        LanguageDictionary dictionary = new LanguageDictionary();
        assertFalse(dictionary.containsKey("non-existent key"));
    }
}

}