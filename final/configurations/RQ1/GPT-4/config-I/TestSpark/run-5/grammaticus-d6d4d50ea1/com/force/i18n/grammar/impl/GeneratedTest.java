package com.force.i18n.grammar.impl;

import com.force.i18n.HumanLanguage;
import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.Noun;
import com.force.i18n.grammar.RenamingProvider;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void equalsTest() {
        Map<String, Noun> testMap = new HashMap<>();
        GrammaticalTermMapImpl<Noun> testTermMap1 = new GrammaticalTermMapImpl<>(testMap, true);
        GrammaticalTermMapImpl<Noun> testTermMap2 = new GrammaticalTermMapImpl<>(testMap, true);
        assertEquals(testTermMap1, testTermMap2);
    }

    @Test
    public void hashCodeTest() {
        Map<String, Noun> testMap = new HashMap<>();
        GrammaticalTermMapImpl<Noun> testTermMap = new GrammaticalTermMapImpl<>(testMap, true);
        assertEquals(testMap.hashCode() + 37, testTermMap.hashCode());
    }

    @Test
    public void isSkinnyTrueTest() {
        Map<String, Noun> testMap = new HashMap<>();
        GrammaticalTermMapImpl<Noun> testTermMap = new GrammaticalTermMapImpl<>(testMap, true);
        assertTrue(testTermMap.isSkinny());
    }

    @Test
    public void makeSkinnyTest() {
        Map<String, Noun> testMap = new HashMap<>();
        GrammaticalTermMapImpl<Noun> testTermMap = new GrammaticalTermMapImpl<>(testMap, false);
        assertTrue(testTermMap.makeSkinny().isSkinny());
    }

    @Test
    public void writeJsonTest() throws IOException {
        Map<String, Noun> testMap = new HashMap<>();
        GrammaticalTermMapImpl<Noun> testTermMap = new GrammaticalTermMapImpl<>(testMap, false);
        RenamingProvider renamingProvider = Mockito.mock(RenamingProvider.class);
        LanguageDictionary dictionary = Mockito.mock(LanguageDictionary.class);
        Collection<String> termsToInclude = Collections.singleton("term");
        StringBuilder stringBuilder = new StringBuilder();
        testTermMap.writeJson(stringBuilder, renamingProvider, dictionary, termsToInclude);
        assertEquals("{}", stringBuilder.toString());
    }

    @Test
    public void keySetTest() {
        Map<String, Noun> testMap = new HashMap<>();
        testMap.put("key", null);
        GrammaticalTermMapImpl<Noun> testTermMap = new GrammaticalTermMapImpl<>(testMap, false);
        assertEquals(testMap.keySet(), testTermMap.keySet());
    }

    @Test
    public void getTest() {
        Map<String, Noun> testMap = new HashMap<>();
        Noun noun = Mockito.mock(Noun.class);
        testMap.put("key", noun);
        GrammaticalTermMapImpl<Noun> testTermMap = new GrammaticalTermMapImpl<>(testMap, false);
        assertEquals(noun, testTermMap.get("key"));
    }

    @Test
    public void putTest() {
        Map<String, Noun> testMap = new HashMap<>();
        GrammaticalTermMapImpl<Noun> testTermMap = new GrammaticalTermMapImpl<>(testMap, true);
        assertThrows(RuntimeException.class, () -> testTermMap.put("key", null));
    }

    @Test
    public void putAllTest() {
        Map<String, Noun> testMap = new HashMap<>();
        GrammaticalTermMapImpl<Noun> testTermMap1 = new GrammaticalTermMapImpl<>(testMap, true);
        GrammaticalTermMapImpl<Noun> testTermMap2 = new GrammaticalTermMapImpl<>(testMap, false);
        assertThrows(RuntimeException.class, () -> testTermMap1.putAll(testTermMap2));
    }

    @Test
    public void isEmptyTest() {
        Map<String, Noun> testMap = new HashMap<>();
        GrammaticalTermMapImpl<Noun> testTermMap = new GrammaticalTermMapImpl<>(testMap, true);
        assertTrue(testTermMap.isEmpty());
    }

}