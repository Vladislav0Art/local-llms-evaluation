package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.RenamingProvider;
import com.force.i18n.grammar.GrammaticalTerm;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.*;

public class GeneratedContainsKeyTest {

    @Test
    public void containsKeyTest() {
        Map<String, GrammaticalTerm> testMap = new HashMap<>();
        GrammaticalTerm term = mock(GrammaticalTerm.class);
        testMap.put("test", term);
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>(testMap, false);

        assertTrue(termMap.containsKey("test"));
        assertFalse(termMap.containsKey("nonexistent"));
    }

}