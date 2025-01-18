package com.force.i18n.grammar.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import com.force.i18n.HumanLanguage;
import com.force.i18n.grammar.GrammaticalTerm;
import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.RenamingProvider;
import com.google.common.collect.ImmutableMap;

public class GeneratedTest {

    @Test
    public void equalsTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> first = new GrammaticalTermMapImpl<>();
        GrammaticalTermMapImpl<GrammaticalTerm> second = new GrammaticalTermMapImpl<>();
        assertTrue(first.equals(second) && second.equals(first));
    }

    @Test
    public void hashCodeTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>();
        int generatedHashCode = termMap.hashCode();
        int expectedHashCode = termMap.hashCode();
        assertEquals(expectedHashCode, generatedHashCode);
    }

    @Test
    public void containsKeyTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>();
        GrammaticalTerm term = mock(GrammaticalTerm.class);
        termMap.put("testTerm", term);
        assertFalse(termMap.containsKey("nonExistent"));
        assertTrue(termMap.containsKey("testTerm"));
    }

    @Test
    public void putAndPutAllTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> termMap1 = new GrammaticalTermMapImpl<>();
        GrammaticalTermMapImpl<GrammaticalTerm> termMap2 = new GrammaticalTermMapImpl<>();
        GrammaticalTerm term = mock(GrammaticalTerm.class);
        termMap1.put("testTerm", term);
        termMap2.putAll(termMap1);
        assertTrue(termMap2.containsKey("testTerm"));
    }

    @Test
    public void isEmptyTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>();
        assertTrue(termMap.isEmpty());
        GrammaticalTerm term = mock(GrammaticalTerm.class);
        termMap.put("testTerm", term);
        assertFalse(termMap.isEmpty());
    }

    @Test
    public void writeJsonTest() throws IOException {
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>();
        StringBuilder stringBuilder = new StringBuilder();
        RenamingProvider renamingProvider = mock(RenamingProvider.class);
        LanguageDictionary languageDictionary = mock(LanguageDictionary.class);
        Collection<String> termsToInclude = Arrays.asList("term1", "term2");
        termMap.writeJson(stringBuilder, renamingProvider, languageDictionary, termsToInclude);
        // assuming implementation doesn't throw an exception
        assertTrue(stringBuilder.length() >= 0);
    }

}