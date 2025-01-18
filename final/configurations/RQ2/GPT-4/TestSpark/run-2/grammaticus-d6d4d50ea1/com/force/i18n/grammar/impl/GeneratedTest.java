package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.RenamingProvider;
import com.force.i18n.grammar.GrammaticalTerm;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.io.StringWriter;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void equalsTest() {
        Map<String, GrammaticalTerm> map = new HashMap<>();
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>(map, false);
        assertTrue(termMap.equals(termMap));
    }

    @Test
    public void hashCodeTest() {
        Map<String, GrammaticalTerm> map = new HashMap<>();
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>(map, false);
        assertNotEquals(0, termMap.hashCode());
    }

    @Test
    public void isSkinnyTest() {
        Map<String, GrammaticalTerm> map = new HashMap<>();
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>(map, false);
        assertFalse(termMap.isSkinny());
    }

    @Test
    public void makeSkinnyTest() {
        Map<String, GrammaticalTerm> map = new HashMap<>();
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>(map, false);
        assertTrue(termMap.makeSkinny().isSkinny());
    }

    @Test
    public void writeJsonTest() throws IOException {
        Map<String, GrammaticalTerm> map = new HashMap<>();
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>(map, false);
        RenamingProvider provider = Mockito.mock(RenamingProvider.class);
        LanguageDictionary dictionary = Mockito.mock(LanguageDictionary.class);
        StringWriter out = new StringWriter();
        Collection<String> terms = new HashSet<>();
        termMap.writeJson(out, provider, dictionary, terms);
        assertEquals("{}", out.toString());
    }

    @Test
    public void keySetTest() {
        Map<String, GrammaticalTerm> map = new HashMap<>();
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>(map, false);
        assertTrue(termMap.keySet().isEmpty());
    }

    @Test
    public void getTest() {
        Map<String, GrammaticalTerm> map = new HashMap<>();
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>(map, false);
        assertNull(termMap.get("key"));
    }

    @Test
    public void containsKeyTest() {
        Map<String, GrammaticalTerm> map = new HashMap<>();
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>(map, false);
        assertFalse(termMap.containsKey("key"));
    }

    @Test
    public void entrySetTest() {
        Map<String, GrammaticalTerm> map = new HashMap<>();
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>(map, false);
        assertTrue(termMap.entrySet().isEmpty());
    }

    @Test
    public void valuesTest() {
        Map<String, GrammaticalTerm> map = new HashMap<>();
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>(map, false);
        assertTrue(termMap.values().isEmpty());
    }

    @Test
    public void putTest() {
        Map<String, GrammaticalTerm> map = new HashMap<>();
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>(map, false);
        GrammaticalTerm term = Mockito.mock(GrammaticalTerm.class);
        termMap.put("key", term);
        assertTrue(termMap.containsKey("key"));
    }

    @Test
    public void putAllTest() {
        Map<String, GrammaticalTerm> map1 = new HashMap<>();
        Map<String, GrammaticalTerm> map2 = new HashMap<>();

        GrammaticalTerm term = Mockito.mock(GrammaticalTerm.class);
        map2.put("key", term);

        GrammaticalTermMapImpl<GrammaticalTerm> termMap1 = new GrammaticalTermMapImpl<>(map1, false);
        GrammaticalTermMapImpl<GrammaticalTerm> termMap2 = new GrammaticalTermMapImpl<>(map2, false);

        termMap1.putAll(termMap2);
        assertTrue(termMap1.containsKey("key"));
    }

    @Test
    public void isEmptyTest() {
        Map<String, GrammaticalTerm> map = new HashMap<>();
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>(map, false);
        assertTrue(termMap.isEmpty());
    }

}