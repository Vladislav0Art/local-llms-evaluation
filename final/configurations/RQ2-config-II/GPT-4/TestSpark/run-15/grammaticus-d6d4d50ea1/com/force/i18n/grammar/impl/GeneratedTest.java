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
public class GeneratedTest {

    @Test
    public void equalsIdenticalObjectsTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> termMap1 = new GrammaticalTermMapImpl<>();
        assertTrue(termMap1.equals(termMap1));
    }

    @Test
    public void equalsDifferentObjectsTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> termMap1 = new GrammaticalTermMapImpl<>(new HashMap<>(), true);
        GrammaticalTermMapImpl<GrammaticalTerm> termMap2 = new GrammaticalTermMapImpl<>(new HashMap<>(), true);

        assertTrue(termMap1.equals(termMap2));
    }

    @Test
    public void isSkinnyTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>(new HashMap<>(), true);
        assertTrue(termMap.isSkinny());
    }

    @Test
    public void makeSkinnyTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>(new HashMap<>(), false);
        assertTrue(termMap.makeSkinny().isSkinny());
    }

    @Test
    public void writeJsonTest() throws IOException {
        GrammaticalTerm grammaticalTerm = Mockito.mock(GrammaticalTerm.class);
        Map<String, GrammaticalTerm> termMap = new HashMap<>();
        termMap.put("k", grammaticalTerm);
        StringBuilder sb = new StringBuilder();
        RenamingProvider renamingProvider = Mockito.mock(RenamingProvider.class);
        LanguageDictionary dictionary = Mockito.mock(LanguageDictionary.class);
        Collection<String> termsToInclude = new HashSet<>(Arrays.asList("k"));

        new GrammaticalTermMapImpl<>(termMap, true).writeJson(sb, renamingProvider, dictionary, termsToInclude);
    }

    @Test
    public void keySetTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>();
        assertTrue(termMap.keySet().isEmpty());
    }

    @Test
    public void getTest() {
        GrammaticalTerm grammaticalTerm = Mockito.mock(GrammaticalTerm.class);
        Map<String, GrammaticalTerm> termMap = new HashMap<>();
        termMap.put("k", grammaticalTerm);

        assertEquals(grammaticalTerm, new GrammaticalTermMapImpl<>(termMap, true).get("k"));
    }

    @Test
    public void containsKeyTest() {
        GrammaticalTerm grammaticalTerm = Mockito.mock(GrammaticalTerm.class);
        Map<String, GrammaticalTerm> termMap = new HashMap<>();
        termMap.put("k", grammaticalTerm);

        assertTrue(new GrammaticalTermMapImpl<>(termMap, true).containsKey("k"));
    }

    @Test
    public void entrySetTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>();
        assertTrue(termMap.entrySet().isEmpty());
    }

    @Test
    public void valuesTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>();
        assertTrue(termMap.values().isEmpty());
    }

    @Test
    public void putTest() {
        GrammaticalTerm grammaticalTerm = Mockito.mock(GrammaticalTerm.class);
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>();

        termMap.put("k", grammaticalTerm);

        assertTrue(termMap.containsKey("k"));
    }

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

    @Test
    public void isEmptyTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>();
        assertTrue(termMap.isEmpty());
    }

}