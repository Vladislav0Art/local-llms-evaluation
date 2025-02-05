package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.RenamingProvider;
import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void equalsSameObjectTest() {
        GrammaticalTermMapImpl<String> termMap = new GrammaticalTermMapImpl<>();
        assertTrue(termMap.equals(termMap));
    }

    @Test
    public void equalsSameContentTest() {
        Map<String, String> map = new HashMap<>();
        map.put("key", "value");
        GrammaticalTermMapImpl<String> termMap1 = new GrammaticalTermMapImpl<>(map, false);
        GrammaticalTermMapImpl<String> termMap2 = new GrammaticalTermMapImpl<>(map, false);
        assertTrue(termMap1.equals(termMap2));
    }

    @Test
    public void equalsDifferentObjectTest() {
        GrammaticalTermMapImpl<String> termMap = new GrammaticalTermMapImpl<>();
        assertFalse(termMap.equals(new Object()));
    }

    @Test
    public void isSkinnyTrueTest() {
        GrammaticalTermMapImpl<String> termMap = new GrammaticalTermMapImpl<>(new HashMap<>(), true);
        assertTrue(termMap.isSkinny());
    }

    @Test
    public void isSkinnyFalseTest() {
        GrammaticalTermMapImpl<String> termMap = new GrammaticalTermMapImpl<>(new HashMap<>(), false);
        assertFalse(termMap.isSkinny());
    }

    @Test
    public void makeSkinnyTest() {
        Map<String, String> map = new HashMap<>();
        map.put("key", "value");
        GrammaticalTermMapImpl<String> termMap = new GrammaticalTermMapImpl<>(map, false);
        assertTrue(termMap.makeSkinny().isSkinny());
    }

    @Test
    public void writeJsonTest() throws IOException {
        Appendable out = new StringBuilder();
        RenamingProvider renamingProvider = Mockito.mock(RenamingProvider.class);
        LanguageDictionary dictionary = Mockito.mock(LanguageDictionary.class);
        GrammaticalTermMapImpl<String> termMap = new GrammaticalTermMapImpl<>();
        termMap.writeJson(out, renamingProvider, dictionary, new HashSet<>());
    }

    @Test
    public void keySetTest() {
        Map<String, String> map = new HashMap<>();
        map.put("key", "value");
        GrammaticalTermMapImpl<String> termMap = new GrammaticalTermMapImpl<>(map, false);
        assertEquals(map.keySet(), termMap.keySet());
    }

    @Test
    public void getTest() {
        Map<String, String> map = new HashMap<>();
        map.put("key", "value");
        GrammaticalTermMapImpl<String> termMap = new GrammaticalTermMapImpl<>(map, false);
        assertEquals("value", termMap.get("key"));
    }

    @Test
    public void containsKeyTest() {
        Map<String, String> map = new HashMap<>();
        map.put("key", "value");
        GrammaticalTermMapImpl<String> termMap = new GrammaticalTermMapImpl<>(map, false);
        assertTrue(termMap.containsKey("key"));
    }

    @Test
    public void entrySetTest() {
        Map<String, String> map = new HashMap<>();
        map.put("key", "value");
        GrammaticalTermMapImpl<String> termMap = new GrammaticalTermMapImpl<>(map, false);
        assertEquals(map.entrySet(), termMap.entrySet());
    }

    @Test
    public void valuesTest() {
        Map<String, String> map = new HashMap<>();
        map.put("key", "value");
        GrammaticalTermMapImpl<String> termMap = new GrammaticalTermMapImpl<>(map, false);
        assertEquals(map.values(), termMap.values());
    }

    @Test
    public void putTest() {
        GrammaticalTermMapImpl<String> termMap = new GrammaticalTermMapImpl<>();
        termMap.put("key", "value");
        assertEquals("value", termMap.get("key"));
    }

    @Test
    public void putAllTest() {
        Map<String, String> map = new HashMap<>();
        map.put("key", "value");
        GrammaticalTermMapImpl<String> termMap1 = new GrammaticalTermMapImpl<>();
        GrammaticalTermMapImpl<String> termMap2 = new GrammaticalTermMapImpl<>(map, false);
        termMap1.putAll(termMap2);
        assertEquals("value", termMap1.get("key"));
    }

    @Test
    public void isEmptyTrueTest() {
        GrammaticalTermMapImpl<String> termMap = new GrammaticalTermMapImpl<>();
        assertTrue(termMap.isEmpty());
    }

    @Test
    public void isEmptyFalseTest() {
        Map<String, String> map = new HashMap<>();
        map.put("key", "value");
        GrammaticalTermMapImpl<String> termMap = new GrammaticalTermMapImpl<>(map, false);
        assertFalse(termMap.isEmpty());
    }

}