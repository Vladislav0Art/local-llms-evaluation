package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.GrammaticalTerm;
import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.RenamingProvider;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class GeneratedPutAllTest {

    @Test
    public void putAllTest() {
        Map<String, GrammaticalTerm> testMap = new HashMap<>();
        Noun noun = new Noun();
        testMap.put("key", noun);
        GrammaticalTermMapImpl<GrammaticalTerm> other = new GrammaticalTermMapImpl<>(testMap, true);
        GrammaticalTermMapImpl<GrammaticalTerm> map = new GrammaticalTermMapImpl<>();
        map.putAll(other);
        assertEquals(1, map.size());
        assertEquals(noun, map.get("key"));
    }

}