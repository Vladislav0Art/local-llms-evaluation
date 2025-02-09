package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.GrammaticalTerm;
import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.RenamingProvider;
import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import com.google.common.collect.ImmutableMap;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;
import java.util.*;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private GrammaticalTerm grammaticalTermMock;
    @Mock
    private RenamingProvider renamingProviderMock;
    @Mock
    private LanguageDictionary dictionaryMock;

    @Test
    public void grammaticalTermMapImplEmptyConstructorTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> map = new GrammaticalTermMapImpl<>();
        assertNotNull(map);
    }

    @Test
    public void grammaticalTermMapImplConstructorTest() {
        Map<String, GrammaticalTerm> testMap = new HashMap<>();
        testMap.put("test", grammaticalTermMock);
        GrammaticalTermMapImpl<GrammaticalTerm> map = new GrammaticalTermMapImpl<>(testMap, true);
        assertNotNull(map);
    }

    @Test
    public void isSkinnyTest() {
        Map<String, GrammaticalTerm> testMap = new HashMap<>();
        testMap.put("test", grammaticalTermMock);
        GrammaticalTermMapImpl<GrammaticalTerm> map = new GrammaticalTermMapImpl<>(testMap, true);
        assertTrue(map.isSkinny());
    }

    @Test
    public void makeSkinnyTest() {
        Map<String, GrammaticalTerm> testMap = new HashMap<>();
        testMap.put("test", grammaticalTermMock);
        GrammaticalTermMapImpl<GrammaticalTerm> map = new GrammaticalTermMapImpl<>(testMap, false);
        assertFalse(map.isSkinny());
        map = (GrammaticalTermMapImpl<GrammaticalTerm>) map.makeSkinny();
        assertTrue(map.isSkinny());
    }

    @Test
    public void writeJsonTest() throws IOException {
        Map<String, GrammaticalTerm> testMap = new HashMap<>();
        testMap.put("test", grammaticalTermMock);
        GrammaticalTermMapImpl<GrammaticalTerm> map = new GrammaticalTermMapImpl<>(testMap, false);
        StringBuilder builder = new StringBuilder();
        Set<String> termsToInclude = new HashSet<>();
        termsToInclude.add("test");
        map.writeJson(builder, renamingProviderMock, dictionaryMock, termsToInclude);
        assertNotNull(builder.toString());
    }

    @Test
    public void keySetTest() {
        Map<String, GrammaticalTerm> testMap = new HashMap<>();
        testMap.put("test", grammaticalTermMock);
        GrammaticalTermMapImpl<GrammaticalTerm> map = new GrammaticalTermMapImpl<>(testMap, false);
        Set<String> keySet = map.keySet();
        assertEquals(1, keySet.size());
        assertTrue(keySet.contains("test"));
    }

    @Test
    public void getTest() {
        Map<String, GrammaticalTerm> testMap = new HashMap<>();
        testMap.put("test", grammaticalTermMock);
        GrammaticalTermMapImpl<GrammaticalTerm> map = new GrammaticalTermMapImpl<>(testMap, false);
        GrammaticalTerm term = map.get("test");
        assertNotNull(term);
        assertEquals(grammaticalTermMock, term);
    }

    @Test
    public void containsKeyTest() {
        Map<String, GrammaticalTerm> testMap = new HashMap<>();
        testMap.put("test", grammaticalTermMock);
        GrammaticalTermMapImpl<GrammaticalTerm> map = new GrammaticalTermMapImpl<>(testMap, false);
        assertTrue(map.containsKey("test"));
        assertFalse(map.containsKey("fake"));
    }

    @Test
    public void entrySetTest() {
        Map<String, GrammaticalTerm> testMap = new HashMap<>();
        testMap.put("test", grammaticalTermMock);
        GrammaticalTermMapImpl<GrammaticalTerm> map = new GrammaticalTermMapImpl<>(testMap, false);
        Set<Map.Entry<String, GrammaticalTerm>> entrySet = map.entrySet();
        assertEquals(1, entrySet.size());
        assertTrue(entrySet.stream().anyMatch(entry -> entry.getKey().equals("test") && entry.getValue().equals(grammaticalTermMock)));
    }

    @Test
    public void valuesTest() {
        Map<String, GrammaticalTerm> testMap = new HashMap<>();
        testMap.put("test", grammaticalTermMock);
        GrammaticalTermMapImpl<GrammaticalTerm> map = new GrammaticalTermMapImpl<>(testMap, false);
        Collection<GrammaticalTerm> values = map.values();
        assertEquals(1, values.size());
        assertTrue(values.contains(grammaticalTermMock));
    }

    @Test
    public void putTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> map = new GrammaticalTermMapImpl<>();
        assertFalse(map.containsKey("test"));
        map.put("test", grammaticalTermMock);
        assertTrue(map.containsKey("test"));
    }

    @Test
    public void putAllTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> map = new GrammaticalTermMapImpl<>();
        GrammaticalTermMapImpl<GrammaticalTerm> otherMap = new GrammaticalTermMapImpl<>();
        assertFalse(map.containsKey("test"));
        otherMap.put("test", grammaticalTermMock);
        map.putAll(otherMap);
        assertTrue(map.containsKey("test"));
    }

    @Test
    public void isEmptyTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> map = new GrammaticalTermMapImpl<>();
        assertTrue(map.isEmpty());
        map.put("test", grammaticalTermMock);
        assertFalse(map.isEmpty());
    }

}