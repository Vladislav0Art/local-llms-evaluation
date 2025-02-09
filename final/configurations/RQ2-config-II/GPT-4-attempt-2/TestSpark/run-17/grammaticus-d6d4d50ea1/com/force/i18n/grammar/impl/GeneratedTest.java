package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.RenamingProvider;
import com.force.i18n.grammar.GrammaticalTerm;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.*;

public class GeneratedTest {

    @Test
    public void equalsTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> termMap1 = new GrammaticalTermMapImpl<>();
        GrammaticalTermMapImpl<GrammaticalTerm> termMap2 = new GrammaticalTermMapImpl<>();
        assertTrue(termMap1.equals(termMap2));

        Map<String, GrammaticalTerm> testMap = new HashMap<>();
        GrammaticalTerm term = mock(GrammaticalTerm.class);
        testMap.put("test", term);

        termMap1 = new GrammaticalTermMapImpl<>(testMap, true);
        assertFalse(termMap1.equals(termMap2));
    }

    @Test
    public void hashCodeTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> termMap1 = new GrammaticalTermMapImpl<>();
        GrammaticalTermMapImpl<GrammaticalTerm> termMap2 = new GrammaticalTermMapImpl<>();

        Map<String, GrammaticalTerm> testMap = new HashMap<>();
        GrammaticalTerm term = mock(GrammaticalTerm.class);
        testMap.put("test", term);

        termMap1 = new GrammaticalTermMapImpl<>(testMap, true);

        assertEquals(termMap1.hashCode(), termMap1.hashCode());
        assertNotEquals(termMap1.hashCode(), termMap2.hashCode());
    }

    @Test
    public void isSkinnyTrueTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>(Collections.EMPTY_MAP, true);
        assertTrue(termMap.isSkinny());
    }

    @Test
    public void isSkinnyFalseTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>(Collections.EMPTY_MAP, false);
        assertFalse(termMap.isSkinny());
    }

    @Test
    public void makeSkinnyTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>(Collections.EMPTY_MAP, false);
        assertFalse(termMap.isSkinny());
        assertTrue(termMap.makeSkinny().isSkinny());
    }

    @Test
    public void getValidTest() {
        Map<String, GrammaticalTerm> testMap = new HashMap<>();
        GrammaticalTerm term = mock(GrammaticalTerm.class);
        testMap.put("test", term);
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>(testMap, false);

        assertEquals(term, termMap.get("test"));
    }

    @Test
    public void getInvalidTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>(Collections.EMPTY_MAP, false);
        assertNull(termMap.get("test"));
    }

    @Test
    public void containsKeyTest() {
        Map<String, GrammaticalTerm> testMap = new HashMap<>();
        GrammaticalTerm term = mock(GrammaticalTerm.class);
        testMap.put("test", term);
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>(testMap, false);

        assertTrue(termMap.containsKey("test"));
        assertFalse(termMap.containsKey("nonexistent"));
    }

}