package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.RenamingProvider;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;

public class GeneratedIsEmptyTest {

    @Test
    public void isEmptyTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> sampleMap = new GrammaticalTermMapImpl<>();
        assertTrue(sampleMap.isEmpty());
        GrammaticalTerm mockTerm = Mockito.mock(GrammaticalTerm.class);
        sampleMap.put("term", mockTerm);
        assertFalse(sampleMap.isEmpty());
    }

}