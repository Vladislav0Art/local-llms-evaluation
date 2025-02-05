package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.GrammaticalTerm;
import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.RenamingProvider;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class GeneratedValuesTest {

    @Test
    public void valuesTest() {
        Map<String, GrammaticalTerm> testMap = new HashMap<>();
        Noun noun = new Noun();
        testMap.put("key", noun);
        GrammaticalTermMapImpl<GrammaticalTerm> map = new GrammaticalTermMapImpl<>(testMap, true);
        Collection<GrammaticalTerm> values = map.values();
        assertEquals(1, values.size());
        assertEquals(noun, values.iterator().next());
    }

}