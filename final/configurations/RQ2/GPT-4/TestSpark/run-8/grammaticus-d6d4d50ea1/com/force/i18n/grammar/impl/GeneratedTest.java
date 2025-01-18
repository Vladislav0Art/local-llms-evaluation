package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import com.force.i18n.grammar.GrammaticalTerm;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void constructorEmptyTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> grammaticalTermMap = new GrammaticalTermMapImpl<>();
        assertTrue(grammaticalTermMap.isEmpty());
    }

    @Test
    public void constructorMapTest() {
        Map<String, GrammaticalTerm> map = new HashMap<>();
        map.put("key1", Mockito.mock(GrammaticalTerm.class));
        GrammaticalTermMapImpl<GrammaticalTerm> grammaticalTermMap = new GrammaticalTermMapImpl<>(map, false);
        assertFalse(grammaticalTermMap.isEmpty());
    }

    @Test
    public void equalsTest() {
        Map<String, GrammaticalTerm> map = new HashMap<>();
        GrammaticalTerm term = Mockito.mock(GrammaticalTerm.class);
        map.put("key1", term);
        GrammaticalTermMapImpl<GrammaticalTerm> grammaticalTermMap1 = new GrammaticalTermMapImpl<>(map, false);
        GrammaticalTermMapImpl<GrammaticalTerm> grammaticalTermMap2 = new GrammaticalTermMapImpl<>(map, false);
        assertTrue(grammaticalTermMap1.equals(grammaticalTermMap2));
    }

    @Test
    public void hashCodeTest() {
        Map<String, GrammaticalTerm> map = new HashMap<>();
        GrammaticalTerm term = Mockito.mock(GrammaticalTerm.class);
        map.put("key1", term);
        GrammaticalTermMapImpl<GrammaticalTerm> grammaticalTermMap = new GrammaticalTermMapImpl<>(map, false);
        assertNotNull(grammaticalTermMap.hashCode());
    }

    @Test
    public void isSkinnyTest() {
        Map<String, GrammaticalTerm> map = new HashMap<>();
        map.put("key1", Mockito.mock(GrammaticalTerm.class));
        GrammaticalTermMapImpl<GrammaticalTerm> grammaticalTermMap = new GrammaticalTermMapImpl<>(map, true);
        assertTrue(grammaticalTermMap.isSkinny());
    }

    @Test
    public void makeSkinnyTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> grammaticalTermMap = new GrammaticalTermMapImpl<>();
        grammaticalTermMap.put("key1", Mockito.mock(GrammaticalTerm.class));
        assertFalse(grammaticalTermMap.isSkinny());
        GrammaticalTermMapImpl<GrammaticalTerm> skinnyTermMap = (GrammaticalTermMapImpl<GrammaticalTerm>) grammaticalTermMap.makeSkinny();
        assertTrue(skinnyTermMap.isSkinny());
    }

    @Test
    public void putTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> grammaticalTermMap = new GrammaticalTermMapImpl<>();
        assertNull(grammaticalTermMap.get("key1"));
        grammaticalTermMap.put("key1", Mockito.mock(GrammaticalTerm.class));
        assertNotNull(grammaticalTermMap.get("key1"));
    }

    @Test
    public void putAllTest() {
        Map<String, GrammaticalTerm> map = new HashMap<>();
        map.put("key1", Mockito.mock(GrammaticalTerm.class));
        GrammaticalTermMapImpl<GrammaticalTerm> grammaticalTermMap = new GrammaticalTermMapImpl<>();
        assertTrue(grammaticalTermMap.isEmpty());
        grammaticalTermMap.putAll(new GrammaticalTermMapImpl<>(map, false));
        assertFalse(grammaticalTermMap.isEmpty());
    }

    @Test
    public void valuesTest() {
        Map<String, GrammaticalTerm> map = new HashMap<>();
        map.put("key1", Mockito.mock(GrammaticalTerm.class));
        GrammaticalTermMapImpl<GrammaticalTerm> grammaticalTermMap = new GrammaticalTermMapImpl<>(map, false);
        assertEquals(map.values(), grammaticalTermMap.values());
    }

}