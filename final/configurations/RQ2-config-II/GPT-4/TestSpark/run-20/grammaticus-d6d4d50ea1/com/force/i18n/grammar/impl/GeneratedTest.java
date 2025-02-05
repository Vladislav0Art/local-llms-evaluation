package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.GrammaticalTerm;
import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.RenamingProvider;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void equalsCheckEqualObjectTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> map1 = new GrammaticalTermMapImpl<>();
        GrammaticalTermMapImpl<GrammaticalTerm> map2 = new GrammaticalTermMapImpl<>();
        boolean isEqual = map1.equals(map2);
        assertTrue(isEqual);
    }

    @Test
    public void equalsCheckDifferentObjectTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> map1 = new GrammaticalTermMapImpl<>();
        map1.put("key", new Noun());
        GrammaticalTermMapImpl<GrammaticalTerm> map2 = new GrammaticalTermMapImpl<>();
        map2.put("key", new GrammaticalTerm() {
        });
        assertFalse(map1.equals(map2));
    }

    @Test
    public void hashCodeSameObjectTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> map1 = new GrammaticalTermMapImpl<>();
        GrammaticalTermMapImpl<GrammaticalTerm> map2 = map1;
        assertEquals(map1.hashCode(), map2.hashCode());
    }

    @Test
    public void isSkinnyDefaultTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> map = new GrammaticalTermMapImpl<>();
        assertFalse(map.isSkinny());
    }

    @Test
    public void isSkinnySetTest() {
        Map<String, GrammaticalTerm> testMap = new HashMap<>();
        GrammaticalTermMapImpl<GrammaticalTerm> map = new GrammaticalTermMapImpl<>(testMap, true);
        assertTrue(map.isSkinny());
    }

    @Test
    public void makeSkinnyTest() {
        Map<String, GrammaticalTerm> testMap = new HashMap<>();
        testMap.put("key", new Noun());
        GrammaticalTermMapImpl<GrammaticalTerm> map = new GrammaticalTermMapImpl<>(testMap, true);
        map.makeSkinny();
        assertTrue(map.isSkinny());
    }

    @Test
    public void keySetTest() {
        Map<String, GrammaticalTerm> testMap = new HashMap<>();
        testMap.put("key", new Noun());
        GrammaticalTermMapImpl<GrammaticalTerm> map = new GrammaticalTermMapImpl<>(testMap, true);
        Set<String> keys = map.keySet();
        assertEquals(1, keys.size());
        assertEquals("key", keys.iterator().next());
    }

    @Test
    public void getExistingKeyTest() {
        Map<String, GrammaticalTerm> testMap = new HashMap<>();
        Noun noun = new Noun();
        testMap.put("key", noun);
        GrammaticalTermMapImpl<GrammaticalTerm> map = new GrammaticalTermMapImpl<>(testMap, true);
        GrammaticalTerm term = map.get("key");
        assertEquals(noun, term);
    }

    @Test
    public void getNonExistingKeyTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> map = new GrammaticalTermMapImpl<>();
        GrammaticalTerm term = map.get("key");
        assertNull(term);
    }

    @Test
    public void containsKeyExistingKeyTest() {
        Map<String, GrammaticalTerm> testMap = new HashMap<>();
        testMap.put("key", new Noun());
        GrammaticalTermMapImpl<GrammaticalTerm> map = new GrammaticalTermMapImpl<>(testMap, true);
        assertTrue(map.containsKey("key"));
    }

    @Test
    public void containsKeyNonExistingKeyTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> map = new GrammaticalTermMapImpl<>();
        assertFalse(map.containsKey("key"));
    }

    @Test
    public void entrySetTest() {
        Map<String, GrammaticalTerm> testMap = new HashMap<>();
        Noun noun = new Noun();
        testMap.put("key", noun);
        GrammaticalTermMapImpl<GrammaticalTerm> map = new GrammaticalTermMapImpl<>(testMap, true);
        Set<Map.Entry<String, T>> entries = map.entrySet();
        assertEquals(1, entries.size());
        Map.Entry<String, T> entry = entries.iterator().next();
        assertEquals("key", entry.getKey());
        assertEquals(noun, entry.getValue());
    }

    @Test
    public void valuesTest() {
        Map<String, GrammaticalTerm> testMap = new HashMap<>();
        Noun noun = new Noun();
        testMap.put("key", noun);
        GrammaticalTermMapImpl<GrammaticalTerm> map = new GrammaticalTermMapImpl<>(testMap, true);
        Collection<GrammaticalTerm> values = map.values();
        assertEquals(1, values.size());
        assertEquals(noun, values.iterator().next());
    }

    @Test
    public void putTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> map = new GrammaticalTermMapImpl<>();
        Noun noun = new Noun();
        map.put("key", noun);
        assertEquals(noun, map.get("key"));
    }

    @Test
    public void putAllTest() {
        Map<String, GrammaticalTerm> testMap = new HashMap<>();
        Noun noun = new Noun();
        testMap.put("key", noun);
        GrammaticalTermMapImpl<GrammaticalTerm> other = new GrammaticalTermMapImpl<>(testMap, true);
        GrammaticalTermMapImpl<GrammaticalTerm> map = new GrammaticalTermMapImpl<>();
        map.putAll(other);
        assertEquals(1, map.size());
        assertEquals(noun, map.get("key"));
    }

    @Test
    public void isEmptyCheckEmptyMapTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> map = new GrammaticalTermMapImpl<>();
        assertTrue(map.isEmpty());
    }

    @Test
    public void isEmptyCheckNonEmptyMapTest() {
        Map<String, GrammaticalTerm> testMap = new HashMap<>();
        testMap.put("key", new Noun());
        GrammaticalTermMapImpl<GrammaticalTerm> map = new GrammaticalTermMapImpl<>(testMap, true);
        assertFalse(map.isEmpty());
    }

}