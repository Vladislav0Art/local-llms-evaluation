package com.force.i18n.grammar.impl;

import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

import java.io.IOException;
import java.util.*;

public class GeneratedTest {

    @Test
    public void equalsSameObjectTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>();
        assertTrue(termMap.equals(termMap));
    }

    @Test
    public void equalsAnotherObjectTest() {
        Map<String, GrammaticalTerm> map = new HashMap<>();
        GrammaticalTermMapImpl<GrammaticalTerm> termMap1 = new GrammaticalTermMapImpl<>(map, false);
        GrammaticalTermMapImpl<GrammaticalTerm> termMap2 = new GrammaticalTermMapImpl<>(map, false);
        assertTrue(termMap1.equals(termMap2));
    }

    @Test
    public void putTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>();
        GrammaticalTerm term = mock(GrammaticalTerm.class);
        termMap.put("test", term);
        assertEquals(term, termMap.get("test"));
    }

    @Test
    public void getTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>();
        GrammaticalTerm term = mock(GrammaticalTerm.class);
        termMap.put("test", term);
        assertEquals(term, termMap.get("test"));
    }

    @Test
    public void keySetTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>();
        termMap.put("test", mock(GrammaticalTerm.class));
        termMap.put("test2", mock(GrammaticalTerm.class));
        Set<String> keys = termMap.keySet();
        assertEquals(2, keys.size());
        assertTrue(keys.contains("test"));
        assertTrue(keys.contains("test2"));
    }

    @Test
    public void entrySetTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>();
        GrammaticalTerm term = mock(GrammaticalTerm.class);
        termMap.put("test", term);
        Set<Map.Entry<String, GrammaticalTerm>> entries = termMap.entrySet();
        assertEquals(1, entries.size());
        assertEquals(term, entries.iterator().next().getValue());
    }

    @Test
    public void putAllTest() {
        GrammaticalTerm term1 = mock(GrammaticalTerm.class);
        GrammaticalTerm term2 = mock(GrammaticalTerm.class);
        GrammaticalTermMapImpl<GrammaticalTerm> termMap1 = new GrammaticalTermMapImpl<>();
        termMap1.put("test1", term1);
        GrammaticalTermMapImpl<GrammaticalTerm> termMap2 = new GrammaticalTermMapImpl<>();
        termMap2.put("test2", term2);
        termMap1.putAll(termMap2);
        assertEquals(term2, termMap1.get("test2"));
    }

    @Test
    public void isEmptyTrueTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>();
        assertTrue(termMap.isEmpty());
    }

    @Test
    public void isEmptyFalseTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>();
        termMap.put("test", mock(GrammaticalTerm.class));
        assertFalse(termMap.isEmpty());
    }

    @Test
    public void hashCodeTest() {
        Map<String, GrammaticalTerm> map = new HashMap<>();
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>(map, true);
        assertEquals(map.hashCode(), termMap.hashCode());
    }

    @Test
    public void isSkinnyTrueTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>(new HashMap<>(), true);
        assertTrue(termMap.isSkinny());
    }

    @Test
    public void isSkinnyFalseTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>(new HashMap<>(), false);
        assertFalse(termMap.isSkinny());
    }

    @Test
    public void makeSkinnyTest() {
        Map<String, GrammaticalTerm> map = new HashMap<>();
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>(map, false);
        GrammaticalTermMap<GrammaticalTerm> skinny = termMap.makeSkinny();
        assertTrue(skinny.isSkinny());
    }

    @Test
    public void containsKeyTrueTest() {
        String testKey = "test";
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>();
        termMap.put(testKey, mock(GrammaticalTerm.class));
        assertTrue(termMap.containsKey(testKey));
    }

    @Test
    public void containsKeyFalseTest() {
        String testKey = "test";
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>();
        assertFalse(termMap.containsKey(testKey));
    }

    @Test
    public void valuesTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>();
        GrammaticalTerm term = mock(GrammaticalTerm.class);
        termMap.put("test", term);
        Collection<GrammaticalTerm> values = termMap.values();
        assertEquals(1, values.size());
        assertEquals(term, values.iterator().next());
    }

}