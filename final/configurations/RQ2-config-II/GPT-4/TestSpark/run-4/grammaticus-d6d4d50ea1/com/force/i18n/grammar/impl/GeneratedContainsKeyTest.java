package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.RenamingProvider;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;

public class GeneratedContainsKeyTest {

    @Test
    public void containsKeyTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> sampleMap = new GrammaticalTermMapImpl<>();
        GrammaticalTerm mockTerm = Mockito.mock(GrammaticalTerm.class);
        sampleMap.put("term", mockTerm);
        assertTrue(sampleMap.containsKey("term"));
        assertFalse(sampleMap.containsKey("notPresent"));
    }

}