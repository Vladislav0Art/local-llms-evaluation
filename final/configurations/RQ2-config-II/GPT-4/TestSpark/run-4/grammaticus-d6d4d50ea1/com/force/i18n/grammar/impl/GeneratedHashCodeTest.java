package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.RenamingProvider;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;

public class GeneratedHashCodeTest {

    @Test
    public void hashCodeTest() {
        GrammaticalTermMapImpl sampleMap = new GrammaticalTermMapImpl();
        int expectedHashCode = sampleMap.hashCode();
        assertEquals(expectedHashCode, sampleMap.hashCode());
    }

}