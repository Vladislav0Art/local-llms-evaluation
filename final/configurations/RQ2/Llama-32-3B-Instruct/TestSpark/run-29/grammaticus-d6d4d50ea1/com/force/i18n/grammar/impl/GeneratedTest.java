package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.HashSet;
import java.io.ByteArrayOutputStream;
import java.io.StringWriter;

import com.force.i18n.HumanLanguage;
import com.force.i18n.commons.util.collection.MapSerializer;
import com.force.i18n.grammar.GrammaticalTerm;
import com.force.i18n.grammar.GrammaticalTermMap;
import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.Noun;
import com.force.i18n.grammar.RenamingProvider;

public class GeneratedTest {

    @Test
    public void constructorTest() {
        GrammaticalTermMapImpl<Noun> termMap = new GrammaticalTermMapImpl<>();
        assertNotNull(termMap);
    }

    @Test
    public void constructorWithInitialDataTest() {
        Map<String, Noun> initialData = new HashMap<>();
        initialData.put("noun1", new Noun());
        GrammaticalTermMapImpl<Noun> termMap = new GrammaticalTermMapImpl<>(initialData, false);
        assertEquals(1, termMap.keySet().size());
    }

    @Test
    public void makeSkinnyTest() {
        GrammaticalTermMapImpl<Noun> termMap = new GrammaticalTermMapImpl<>();
        assertTrue(termMap.isSkinny());
    }

    @Test
    public void writeJsonTest() throws IOException {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        StringWriter stringWriter = new StringWriter();
        GrammaticalTermMapImpl<Noun> termMap = new GrammaticalTermMapImpl<>();
        termMap.writeJson(stringWriter, null, null, new HashSet<>());
        assertTrue(outContent.toString().contains("{"));
    }

    @Test
    public void keySetTest() {
        GrammaticalTermMapImpl<Noun> termMap = new GrammaticalTermMapImpl<>();
        Set<String> keySet = termMap.keySet();
        assertTrue(keySet.isEmpty());
    }

    @Test
    public void getTest() {
        Map<String, Noun> initialData = new HashMap<>();
        initialData.put("noun1", new Noun());
        GrammaticalTermMap<Noun> termMap = new GrammaticalTermMapImpl<>(initialData, false);
        assertEquals(termMap.get("noun1"), termMap.get("noun1"));
    }

    @Test
    public void containsKeyTest() {
        Map<String, Noun> initialData = new HashMap<>();
        initialData.put("noun1", new Noun());
        GrammaticalTermMap<Noun> termMap = new GrammaticalTermMapImpl<>(initialData, false);
        assertTrue(termMap.containsKey("noun1"));
    }

    @Test
    public void entrySetTest() {
        Map<String, Noun> initialData = new HashMap<>();
        initialData.put("noun1", new Noun());
        GrammaticalTermMap<Noun> termMap = new GrammaticalTermMapImpl<>(initialData, false);
        assertEquals(0, termMap.entrySet().size());
    }

    @Test
    public void valuesTest() {
        Map<String, Noun> initialData = new HashMap<>();
        initialData.put("noun1", new Noun());
        GrammaticalTermMap<Noun> termMap = new GrammaticalTermMapImpl<>(initialData, false);
        assertEquals(0, termMap.values().size());
    }

    @Test
    public void putTest() {
        Map<String, Noun> initialData = new HashMap<>();
        initialData.put("noun1", new Noun());
        GrammaticalTermMap<Noun> termMap = new GrammaticalTermMapImpl<>(initialData, false);
        termMap.put("noun2", new Noun());
        assertEquals(2, termMap.keySet().size());
    }

    @Test
    public void putAllTest() {
        Map<String, Noun> initialData = new HashMap<>();
        initialData.put("noun1", new Noun());
        GrammaticalTermMap<Noun> termMap = new GrammaticalTermMapImpl<>(initialData, false);
        termMap.putAll(new GrammaticalTermMapImpl<>());
        assertEquals(0, termMap.keySet().size());
    }

    @Test
    public void isEmptyTest() {
        Map<String, Noun> initialData = new HashMap<>();
        GrammaticalTermMap<Noun> termMap = new GrammaticalTermMapImpl<>(initialData, false);
        assertTrue(termMap.isEmpty());
    }

}