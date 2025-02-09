package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class GeneratedTest {

    @Test
    public void EqualsSameObjectTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>();
        assertTrue(termMap.equals(termMap));
    }

    @Test
    public void EqualsNullObjectTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>();
        assertFalse(termMap.equals(null));
    }

    @Test
    public void HashCodeSameObjectTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>();
        assertEquals(termMap.hashCode(), termMap.hashCode());
    }

    @Test
    public void IsSkinnyTest() {
        Map<String, GrammaticalTerm> map = new HashMap<>();
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>(map, false);
        assertFalse(termMap.isSkinny());
    }

    @Test
    public void MakeSkinnyTest() {
        Map<String, GrammaticalTerm> map = new HashMap<>();
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>(map, false);
        assertTrue(termMap.makeSkinny().isSkinny());
    }

    @Test
    public void KeySetTest() {
        Map<String, GrammaticalTerm> map = new HashMap<>();
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>(map, false);
        Set<String> keys = termMap.keySet();
        assertEquals(0, keys.size());
    }

    @Test
    public void GetTest() {
        Map<String, GrammaticalTerm> map = new HashMap<>();
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>(map, false);
        assertNull(termMap.get("test"));
    }

    @Test
    public void ContainsKeyTest() {
        Map<String, GrammaticalTerm> map = new HashMap<>();
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>(map, false);
        assertFalse(termMap.containsKey("test"));
    }

    @Test
    public void EntrySetTest() {
        Map<String, GrammaticalTerm> map = new HashMap<>();
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>(map, false);
        Set<Map.Entry<String, GrammaticalTerm>> entries = termMap.entrySet();
        assertEquals(0, entries.size());
    }

    @Test
    public void ValuesTest() {
        Map<String, GrammaticalTerm> map = new HashMap<>();
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>(map, false);
        assertEquals(0, termMap.values().size());
    }

    @Test
    public void PutTest() {
        Map<String, GrammaticalTerm> map = new HashMap<>();
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>(map, false);
        termMap.put("test", null);
        assertTrue(termMap.containsKey("test"));
    }

    @Test
    public void PutAllTest() {
        Map<String, GrammaticalTerm> map1 = new HashMap<>();
        GrammaticalTermMapImpl<GrammaticalTerm> termMap1 = new GrammaticalTermMapImpl<>(map1, false);
        Map<String, GrammaticalTerm> map2 = new HashMap<>();
        map2.put("test", null);
        GrammaticalTermMapImpl<GrammaticalTerm> termMap2 = new GrammaticalTermMapImpl<>(map2, false);
        termMap1.putAll(termMap2);
        assertTrue(termMap1.containsKey("test"));
    }

    @Test
    public void IsEmptyTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>();
        assertTrue(termMap.isEmpty());
    }

}