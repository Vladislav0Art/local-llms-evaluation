package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.GrammaticalTerm;
import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.RenamingProvider;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class GeneratedContainsKeyExistingKeyTest {

    @Test
    public void containsKeyExistingKeyTest() {
        Map<String, GrammaticalTerm> testMap = new HashMap<>();
        testMap.put("key", new Noun());
        GrammaticalTermMapImpl<GrammaticalTerm> map = new GrammaticalTermMapImpl<>(testMap, true);
        assertTrue(map.containsKey("key"));
    }

}