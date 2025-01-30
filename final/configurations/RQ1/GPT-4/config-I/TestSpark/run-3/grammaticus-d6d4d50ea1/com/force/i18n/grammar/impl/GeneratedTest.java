package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.Noun;
import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import com.force.i18n.grammar.GrammaticalTerm;
import com.force.i18n.grammar.RenamingProvider;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedTest {

    @Test
    public void equalsSameObjectTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> map = new GrammaticalTermMapImpl<>();
        assertTrue(map.equals(map));
    }

    @Test
    public void equalsDifferentObjectTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> map1 = new GrammaticalTermMapImpl<>();
        GrammaticalTermMapImpl<GrammaticalTerm> map2 = new GrammaticalTermMapImpl<>();
        map2.put("test", (GrammaticalTerm) mock(GrammaticalTerm.class));
        assertFalse(map1.equals(map2));
    }

    @Test
    public void equalsDifferentTypeTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> map = new GrammaticalTermMapImpl<>();
        assertFalse(map.equals(new Object()));
    }

    @Test
    public void hashCodeTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> map = new GrammaticalTermMapImpl<>();
        assertEquals(map.hashCode(), map.map.hashCode());
    }

    @Test
    public void isSkinnyTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> map = new GrammaticalTermMapImpl<>();
        assertFalse(map.isSkinny());
    }

    @Test
    public void makeSkinnyTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> map = new GrammaticalTermMapImpl<>();
        GrammaticalTermMapImpl<GrammaticalTerm> newMap = (GrammaticalTermMapImpl<GrammaticalTerm>) map.makeSkinny();
        assertTrue(newMap.isSkinny());
    }

    @Test
    public void putNotSkinnyMapTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> map = new GrammaticalTermMapImpl<>();
        GrammaticalTerm term = mock(GrammaticalTerm.class);
        map.put("term", term);
        assertEquals(term, map.get("term"));
    }

    @Test
    public void putSkinnyMapTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> map = new GrammaticalTermMapImpl<>();
        GrammaticalTermMapImpl<GrammaticalTerm> newMap = (GrammaticalTermMapImpl<GrammaticalTerm>) map.makeSkinny();
        GrammaticalTerm term = mock(GrammaticalTerm.class);
        newMap.put("term", term);
    }

    @Test
    public void putAllNotSkinnyMapTest() {
        GrammaticalTerm term = mock(GrammaticalTerm.class);
        Map<String, GrammaticalTerm> termMap = new HashMap<>();
        termMap.put("term", term);
        GrammaticalTermMapImpl<GrammaticalTerm> map1 = new GrammaticalTermMapImpl<>(termMap, false);
        GrammaticalTermMapImpl<GrammaticalTerm> map2 = new GrammaticalTermMapImpl<>();
        map2.putAll(map1);
        assertEquals(term, map2.get("term"));
    }

    @Test
    public void putAllSkinnyMapTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> map1 = new GrammaticalTermMapImpl<>();
        GrammaticalTermMapImpl<GrammaticalTerm> newMap1 = (GrammaticalTermMapImpl<GrammaticalTerm>) map1.makeSkinny();
        GrammaticalTermMapImpl<GrammaticalTerm> newMap2 = new GrammaticalTermMapImpl<>();
        newMap2.putAll(newMap1);
    }

    @Test
    public void isEmptyTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> map = new GrammaticalTermMapImpl<>();
        assertTrue(map.isEmpty());
    }

    @Test
    public void getTest() {
        GrammaticalTerm term = mock(GrammaticalTerm.class);
        Map<String, GrammaticalTerm> termMap = new HashMap<>();
        termMap.put("term", term);
        GrammaticalTermMapImpl<GrammaticalTerm> map = new GrammaticalTermMapImpl<>(termMap, false);
        assertEquals(term, map.get("term"));
    }

    @Test
    public void containsKeyTest() {
        GrammaticalTerm term = mock(GrammaticalTerm.class);
        Map<String, GrammaticalTerm> termMap = new HashMap<>();
        termMap.put("term", term);
        GrammaticalTermMapImpl<GrammaticalTerm> map = new GrammaticalTermMapImpl<>(termMap, false);
        assertTrue(map.containsKey("term"));
    }

    @Test
    public void keySetTest() {
        GrammaticalTerm term = mock(GrammaticalTerm.class);
        Map<String, GrammaticalTerm> termMap = new HashMap<>();
        termMap.put("term", term);
        GrammaticalTermMapImpl<GrammaticalTerm> map = new GrammaticalTermMapImpl<>(termMap, false);
        Set<String> keys = map.keySet();
        assertEquals(1, keys.size());
        assertTrue(keys.contains("term"));
    }

}