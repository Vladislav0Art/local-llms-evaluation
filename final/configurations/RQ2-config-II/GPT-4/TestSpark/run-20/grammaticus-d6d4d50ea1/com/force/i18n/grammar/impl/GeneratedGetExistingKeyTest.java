package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.GrammaticalTerm;
import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.RenamingProvider;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class GeneratedGetExistingKeyTest {

    @Test
    public void getExistingKeyTest() {
        Map<String, GrammaticalTerm> testMap = new HashMap<>();
        Noun noun = new Noun();
        testMap.put("key", noun);
        GrammaticalTermMapImpl<GrammaticalTerm> map = new GrammaticalTermMapImpl<>(testMap, true);
        GrammaticalTerm term = map.get("key");
        assertEquals(noun, term);
    }

}