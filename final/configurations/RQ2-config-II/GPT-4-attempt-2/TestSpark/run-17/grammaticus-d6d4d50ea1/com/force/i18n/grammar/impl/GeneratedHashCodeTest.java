package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.RenamingProvider;
import com.force.i18n.grammar.GrammaticalTerm;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.*;

public class GeneratedHashCodeTest {

    @Test
    public void hashCodeTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> termMap1 = new GrammaticalTermMapImpl<>();
        GrammaticalTermMapImpl<GrammaticalTerm> termMap2 = new GrammaticalTermMapImpl<>();

        Map<String, GrammaticalTerm> testMap = new HashMap<>();
        GrammaticalTerm term = mock(GrammaticalTerm.class);
        testMap.put("test", term);

        termMap1 = new GrammaticalTermMapImpl<>(testMap, true);

        assertEquals(termMap1.hashCode(), termMap1.hashCode());
        assertNotEquals(termMap1.hashCode(), termMap2.hashCode());
    }

}