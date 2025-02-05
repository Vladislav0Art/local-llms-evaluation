package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.RenamingProvider;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;

public class GeneratedMakeSkinnyTest {

    @Test
    public void makeSkinnyTest() {
        GrammaticalTermMapImpl sampleMap = new GrammaticalTermMapImpl();
        GrammaticalTermMap skinnyMap = sampleMap.makeSkinny();
        assertNotNull(skinnyMap);
        assertTrue(skinnyMap.isSkinny());
    }

}