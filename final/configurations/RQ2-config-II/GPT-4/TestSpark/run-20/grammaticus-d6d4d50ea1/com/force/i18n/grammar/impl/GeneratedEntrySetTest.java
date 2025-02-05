package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.GrammaticalTerm;
import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.RenamingProvider;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class GeneratedEntrySetTest {

    @Test
    public void entrySetTest() {
        Map<String, GrammaticalTerm> testMap = new HashMap<>();
        Noun noun = new Noun();
        testMap.put("key", noun);
        GrammaticalTermMapImpl<GrammaticalTerm> map = new GrammaticalTermMapImpl<>(testMap, true);
        Set<Map.Entry<String, T>> entries = map.entrySet();
        assertEquals(1, entries.size());
        Map.Entry<String, T> entry = entries.iterator().next();
        assertEquals("key", entry.getKey());
        assertEquals(noun, entry.getValue());
    }

}