package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.GrammaticalTerm;
import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.RenamingProvider;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.*;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void GrammaticalTermMapImplDefaultConstructorTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>();
        assertFalse(termMap.isSkinny());
        assertNotNull(termMap.map);
    }

    @Test
    public void GrammaticalTermMapImplConstructorTest() {
        TreeMap<String, GrammaticalTerm> map = new TreeMap<>();
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>(map, true);
        assertTrue(termMap.isSkinny());
        assertNotNull(termMap.map);
    }

    @Test
    public void equalsTest() {
        TreeMap<String, GrammaticalTerm> map = new TreeMap<>();
        GrammaticalTermMapImpl<GrammaticalTerm> termMap1 = new GrammaticalTermMapImpl<>(map, true);
        GrammaticalTermMapImpl<GrammaticalTerm> termMap2 = new GrammaticalTermMapImpl<>(map, true);
        assertEquals(termMap1, termMap2);
    }

    @Test
    public void hashCodeTest() {
        TreeMap<String, GrammaticalTerm> map = new TreeMap<>();
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>(map, true);
        assertEquals(map.hashCode() + 37, termMap.hashCode());
    }

    @Test
    public void putSkinnyExceptionTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>(new TreeMap<>(), true);
        GrammaticalTerm term = Mockito.mock(GrammaticalTerm.class);
        termMap.put("testKey", term);
    }

    @Test
    public void putAllSkinnyExceptionTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> termMap1 = new GrammaticalTermMapImpl<>(new TreeMap<>(), true);
        GrammaticalTermMapImpl<GrammaticalTerm> termMap2 = new GrammaticalTermMapImpl<>(new TreeMap<>(), false);
        termMap1.putAll(termMap2);
    }

    @Test
    public void writeJsonIncludeTermsTest() throws IOException {
        TreeMap<String, GrammaticalTerm> map = new TreeMap<>();
        LanguageDictionary dictionary = Mockito.mock(LanguageDictionary.class);
        RenamingProvider renamingProvider = Mockito.mock(RenamingProvider.class);
        GrammaticalTerm term1 = Mockito.mock(GrammaticalTerm.class);
        Mockito.when(term1.getName()).thenReturn("term1");
        map.put("term1", term1);
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>(map, false);
        StringBuilder out = new StringBuilder();
        termMap.writeJson(out, renamingProvider, dictionary, new HashSet<>(Arrays.asList("term1")));
        assertTrue(out.toString().contains("term1"));
    }

}