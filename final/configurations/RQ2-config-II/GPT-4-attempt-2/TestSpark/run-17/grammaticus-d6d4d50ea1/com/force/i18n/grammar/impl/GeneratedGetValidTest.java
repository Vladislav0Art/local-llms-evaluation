package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.RenamingProvider;
import com.force.i18n.grammar.GrammaticalTerm;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.*;

public class GeneratedGetValidTest {

    @Test
    public void getValidTest() {
        Map<String, GrammaticalTerm> testMap = new HashMap<>();
        GrammaticalTerm term = mock(GrammaticalTerm.class);
        testMap.put("test", term);
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>(testMap, false);

        assertEquals(term, termMap.get("test"));
    }

}