package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.RenamingProvider;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;

public class GeneratedEqualsDifferentObjectTest {

    @Test
    public void equalsDifferentObjectTest() {
        GrammaticalTermMapImpl sampleMap1 = new GrammaticalTermMapImpl();
        GrammaticalTermMapImpl sampleMap2 = new GrammaticalTermMapImpl();
        assertTrue(sampleMap1.equals(sampleMap2));
    }

}