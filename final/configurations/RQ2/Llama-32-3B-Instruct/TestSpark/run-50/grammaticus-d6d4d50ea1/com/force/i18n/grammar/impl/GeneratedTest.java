package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

public class GeneratedTest {

    @Test
    public void constructorIsInitializedCorrectly() {
        GrammaticalTermMapImpl<T> map = new GrammaticalTermMapImpl<>();
        assertNotNull(map);
    }

    @Test
    public void constructorWithInitialDataIsInitializedCorrectly() {
        Map<String, GrammaticalTerm> map = new HashMap<>();
        map.put("term1", new GrammaticalTerm());
        GrammaticalTermMapImpl<T> mapImpl = new GrammaticalTermMapImpl<>(map, false);
        assertNotNull(mapImpl);
    }

    @Test
    public void equalsMethodWorksCorrectly() {
        GrammaticalTermMapImpl<T> map1 = new GrammaticalTermMapImpl<>();
        GrammaticalTermMapImpl<T> map2 = new GrammaticalTermMapImpl<>();
        assertTrue(map1.equals(map2));
        assertFalse(map1.equals(null));
    }

    @Test
    public void hashCodeMethodWorksCorrectly() {
        GrammaticalTermMapImpl<T> map1 = new GrammaticalTermMapImpl<>();
        GrammaticalTermMapImpl<T> map2 = new GrammaticalTermMapImpl<>();
        assertEquals(0, map1.hashCode());
        assertEquals(0, map2.hashCode());
    }

    @Test
    public void isSkinnyMethodWorksCorrectly() {
        GrammaticalTermMapImpl<T> map = new GrammaticalTermMapImpl<>(new HashMap<>(), false);
        assertTrue(map.isSkinny());
    }

    @Test
    public void makeSkinnyMethodWorksCorrectly() {
        GrammaticalTermMapImpl<T> map = new GrammaticalTermMapImpl<>(new HashMap<>(), true);
        GrammaticalTermMapImpl<T> skinnyMap = map.makeSkinny();
        assertNotNull(skinnyMap);
        assertTrue(skinnyMap.isSkinny());
    }

    @Test
    public void writeJsonMethodWorksCorrectly() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        RenamingProvider renamingProvider = new RenamingProvider();
        LanguageDictionary dictionary = new LanguageDictionary();
        Collection<String> termsToInclude = new HashSet<>();
        GrammaticalTermMapImpl<T> map = new GrammaticalTermMapImpl<>(new HashMap<>(), false);
        map.writeJson(oos, renamingProvider, dictionary, termsToInclude);
        oos.flush();
    }

    @Test
    public void keySetMethodWorksCorrectly() {
        GrammaticalTermMapImpl<T> map = new GrammaticalTermMapImpl<>();
        Set<String> keys = map.keySet();
        assertNotNull(keys);
    }

    @Test
    public void getMethodWorksCorrectly() {
        GrammaticalTermMapImpl<T> map = new GrammaticalTermMapImpl<>(new HashMap<>(), false);
        GrammaticalTerm term = map.get("term");
        assertNull(term);
    }

    @Test
    public void containsKeyMethodWorksCorrectly() {
        GrammaticalTermMapImpl<T> map = new GrammaticalTermMapImpl<>();
        assertTrue(map.containsKey("term"));
        assertFalse(map.containsKey("nonExistentTerm"));
    }

    @Test
    public void entrySetMethodWorksCorrectly() {
        GrammaticalTermMapImpl<T> map = new GrammaticalTermMapImpl<>();
        Set<Map.Entry<String, T>> entries = map.entrySet();
        assertNotNull(entries);
    }

    @Test
    public void valuesMethodWorksCorrectly() {
        GrammaticalTermMapImpl<T> map = new GrammaticalTermMapImpl<>();
        Collection<T> values = map.values();
        assertNotNull(values);
    }

    @Test
    public void putMethodWorksCorrectly() {
        GrammaticalTermMapImpl<T> map = new GrammaticalTermMapImpl<>();
        map.put("term", new GrammaticalTerm());
        T value = map.get("term");
        assertNotNull(value);
    }

    @Test
    public void putAllMethodWorksCorrectly() throws IOException {
        GrammaticalTermMap<T> other = new GrammaticalTermMapImpl<>(new HashMap<>(), false);
        GrammaticalTermMapImpl<T> map = new GrammaticalTermMapImpl<>();
        map.putAll(other);
        assertEquals(0, other.get("term").hashCode());
    }

    @Test
    public void isEmptyMethodWorksCorrectly() {
        GrammaticalTermMapImpl<T> map = new GrammaticalTermMapImpl<>();
        assertTrue(map.isEmpty());
    }

}