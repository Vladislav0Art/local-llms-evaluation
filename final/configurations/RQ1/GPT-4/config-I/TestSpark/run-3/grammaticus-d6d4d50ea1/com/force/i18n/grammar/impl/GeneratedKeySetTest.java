package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.Noun;
import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import com.force.i18n.grammar.GrammaticalTerm;
import com.force.i18n.grammar.RenamingProvider;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedKeySetTest {

    @Test
    public void keySetTest() {
        GrammaticalTerm term = mock(GrammaticalTerm.class);
        Map<String, GrammaticalTerm> termMap = new HashMap<>();
        termMap.put("term", term);
        GrammaticalTermMapImpl<GrammaticalTerm> map = new GrammaticalTermMapImpl<>(termMap, false);
        Set<String> keys = map.keySet();
        assertEquals(1, keys.size());
        assertTrue(keys.contains("term"));
    }

}