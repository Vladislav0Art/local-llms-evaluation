package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class GeneratedTest {

    @Test
    public void newGrammaticalTermMapImpl_testNewInstance() {
        GrammaticalTermMapImpl<GrammaticalTerm> map = new GrammaticalTermMapImpl<>();
        assertNotNull(map);
    }

    @Test
    public void newGrammaticalTermMapImpl_withInitialMap_andIsSkinny_testNewInstance() {
        Map<String, GrammaticalTerm> initialMap = new HashMap<>();
        GrammaticalTerm term = mock(GrammaticalTerm.class);
        GrammaticalTermMapImpl<GrammaticalTerm> map = new GrammaticalTermMapImpl<>(initialMap, true);
        assertNotNull(map);
    }

    @Test
    public void equals_testEqualsMethod() {
        GrammaticalTermMapImpl<GrammaticalTerm> map1 = new GrammaticalTermMapImpl<>();
        GrammaticalTermMapImpl<GrammaticalTerm> map2 = new GrammaticalTermMapImpl<>();
        assertFalse(map1.equals(null));
        assertFalse(map1.equals(map2));
    }

    @Test
    public void equals_testEqualsMethod_withSameInstance() {
        GrammaticalTermMapImpl<GrammaticalTerm> map = new GrammaticalTermMapImpl<>();
        assertTrue(map.equals(map));
    }

    @Test
    public void hashCode_testHashCodeMethod() {
        GrammaticalTermMapImpl<GrammaticalTerm> map1 = new GrammaticalTermMapImpl<>();
        GrammaticalTermMapImpl<GrammaticalTerm> map2 = new GrammaticalTermMapImpl<>();
        assertEquals(map1.hashCode(), map2.hashCode());
    }

    @Test
    public void isSkinny_testIsSkinnyMethod() {
        GrammaticalTermMapImpl<GrammaticalTerm> map = new GrammaticalTermMapImpl<>();
        assertTrue(map.isSkinny());
    }

    @Test
    public void makeSkinny_testMakeSkinnyMethod() {
        GrammaticalTermMapImpl<GrammaticalTerm> map = new GrammaticalTermMapImpl<>();
        GrammaticalTermMapImpl<GrammaticalTerm> result = map.makeSkinny();
        assertNotNull(result);
    }

    @Test
    public void writeJson_testWriteJsonMethod() throws IOException {
        GrammaticalTermMapImpl<GrammaticalTerm> map = new GrammaticalTermMapImpl<>();
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(out);
        RenamingProvider renamingProvider = mock(RenamingProvider.class);
        LanguageDictionary dictionary = mock(LanguageDictionary.class);
        Collection<String> termsToInclude = new HashSet<>();
        map.writeJson(oos, renamingProvider, dictionary, termsToInclude);
        oos.close();
    }

    @Test
    public void keySet_testKeyset() {
        GrammaticalTermMapImpl<GrammaticalTerm> map = new GrammaticalTermMapImpl<>();
        Set<String> expected = new HashSet<>();
        // setup expected values
        assertEquals(expected, map.keySet());
    }

    @Test
    public void get_testGetMethod() {
        GrammaticalTermMapImpl<GrammaticalTerm> map = new GrammaticalTermMapImpl<>();
        GrammaticalTerm term = mock(GrammaticalTerm.class);
        map.put("test", term);
        GrammaticalTerm result = map.get("test");
        assertEquals(term, result);
    }

    @Test
    public void containsKey_testContainsKeyMethod() {
        GrammaticalTermMapImpl<GrammaticalTerm> map = new GrammaticalTermMapImpl<>();
        GrammaticalTerm term = mock(GrammaticalTerm.class);
        map.put("test", term);
        assertTrue(map.containsKey("test"));
    }

    @Test
    public void entrySet_testEntryset() {
        GrammaticalTermMapImpl<GrammaticalTerm> map = new GrammaticalTermMapImpl<>();
        Map<String, GrammaticalTerm> expected = new HashMap<>();
        // setup expected values
        assertEquals(expected, map.entrySet());
    }

    @Test
    public void values_testValues() {
        GrammaticalTermMapImpl<GrammaticalTerm> map = new GrammaticalTermMapImpl<>();
        Collection<GrammaticalTerm> expected = new HashSet<>();
        // setup expected values
        assertEquals(expected, map.values());
    }

    @Test
    public void put_testPutMethod() {
        GrammaticalTermMapImpl<GrammaticalTerm> map = new GrammaticalTermMapImpl<>();
        GrammaticalTerm term = mock(GrammaticalTerm.class);
        map.put("test", term);
        assertEquals(term, map.get("test"));
    }

    @Test
    public void putAll_testPutAllMethod() {
        GrammaticalTermMapImpl<GrammaticalTerm> map1 = new GrammaticalTermMapImpl<>();
        GrammaticalTermMapImpl<GrammaticalTerm> map2 = new GrammaticalTermMapImpl<>();
        map1.put("test", mock(GrammaticalTerm.class));
        map1.putAll(map2);
        assertEquals(1, map1.get("test"));
    }

    @Test
    public void isEmpty_testIsEmptyMethod() {
        GrammaticalTermMapImpl<GrammaticalTerm> map = new GrammaticalTermMapImpl<>();
        assertTrue(map.isEmpty());
    }

}