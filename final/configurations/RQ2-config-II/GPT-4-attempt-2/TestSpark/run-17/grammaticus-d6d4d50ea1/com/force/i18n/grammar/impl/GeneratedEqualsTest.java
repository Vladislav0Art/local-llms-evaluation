package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.RenamingProvider;
import com.force.i18n.grammar.GrammaticalTerm;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.*;

public class GeneratedEqualsTest {

    @Test
    public void equalsTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> termMap1 = new GrammaticalTermMapImpl<>();
        GrammaticalTermMapImpl<GrammaticalTerm> termMap2 = new GrammaticalTermMapImpl<>();
        assertTrue(termMap1.equals(termMap2));

        Map<String, GrammaticalTerm> testMap = new HashMap<>();
        GrammaticalTerm term = mock(GrammaticalTerm.class);
        testMap.put("test", term);

        termMap1 = new GrammaticalTermMapImpl<>(testMap, true);
        assertFalse(termMap1.equals(termMap2));
    }

}