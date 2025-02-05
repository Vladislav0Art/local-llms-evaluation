package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.RenamingProvider;
import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import com.force.i18n.grammar.GrammaticalTerm;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedPutAllTest {

    @Test
    public void putAllTest() {
        GrammaticalTerm grammaticalTerm1 = Mockito.mock(GrammaticalTerm.class);
        GrammaticalTerm grammaticalTerm2 = Mockito.mock(GrammaticalTerm.class);
        Map<String, GrammaticalTerm> termMap1 = new HashMap<>();
        termMap1.put("k1", grammaticalTerm1);
        Map<String, GrammaticalTerm> termMap2 = new HashMap<>();
        termMap2.put("k2", grammaticalTerm2);

        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>(termMap1, false);
        termMap.putAll(new GrammaticalTermMapImpl<>(termMap2, true));

        assertTrue(termMap.containsKey("k1"));
        assertTrue(termMap.containsKey("k2"));
    }

}