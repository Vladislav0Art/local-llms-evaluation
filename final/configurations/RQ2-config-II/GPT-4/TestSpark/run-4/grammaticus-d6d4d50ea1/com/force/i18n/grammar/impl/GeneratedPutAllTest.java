package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.RenamingProvider;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;

public class GeneratedPutAllTest {

    @Test
    public void putAllTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> sampleMap1 = new GrammaticalTermMapImpl<>();
        GrammaticalTermMapImpl<GrammaticalTerm> sampleMap2 = new GrammaticalTermMapImpl<>();
        GrammaticalTerm mockTerm = Mockito.mock(GrammaticalTerm.class);
        sampleMap1.put("term", mockTerm);
        sampleMap2.putAll(sampleMap1);
        assertEquals(sampleMap1.get("term"), sampleMap2.get("term"));
    }

}