package com.force.i18n.grammar.impl;

import org.junit.Test;
import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.Noun;
import com.force.i18n.grammar.RenamingProvider;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedTest {

    @Test
    public void equalsSameObjectTest() {
        GrammaticalTermMapImpl<Noun> termMap = new GrammaticalTermMapImpl<>();
        assertTrue(termMap.equals(termMap));
    }

    @Test
    public void equalsNullObjectTest() {
        GrammaticalTermMapImpl<Noun> termMap = new GrammaticalTermMapImpl<>();
        assertFalse(termMap.equals(null));
    }

    @Test
    public void hashCodeTest() {
        GrammaticalTermMapImpl<Noun> termMap1 = new GrammaticalTermMapImpl<>();
        GrammaticalTermMapImpl<Noun> termMap2 = new GrammaticalTermMapImpl<>();
        assertEquals(termMap1.hashCode(), termMap2.hashCode());
    }

    @Test
    public void isSkinnyTest() {
        Map<String, Noun> map = new HashMap<>();
        GrammaticalTermMapImpl<Noun> termMap = new GrammaticalTermMapImpl<>(map, true);
        assertTrue(termMap.isSkinny());
    }

    @Test
    public void makeSkinnyTest() {
        GrammaticalTermMapImpl<Noun> termMap = new GrammaticalTermMapImpl<>();
        termMap = termMap.makeSkinny();
        assertTrue(termMap.isSkinny());
    }

    @Test
    public void writeJsonTest() throws IOException {
        RenamingProvider renamingProvider = mock(RenamingProvider.class);
        LanguageDictionary dictionary = mock(LanguageDictionary.class);
        GrammaticalTermMapImpl<Noun> termMap = new GrammaticalTermMapImpl<>();
        StringBuilder out = new StringBuilder();
        termMap.writeJson(out, renamingProvider, dictionary, null);
        assertEquals("{}", out.toString());
    }

    @Test
    public void getExistingKeyTest() {
        Noun noun = mock(Noun.class);
        Map<String, Noun> map = new HashMap<>();
        map.put("key", noun);
        GrammaticalTermMapImpl<Noun> termMap = new GrammaticalTermMapImpl<>(map, true);
        assertEquals(noun, termMap.get("key"));
    }

    @Test
    public void containsExistingKeyTest() {
        Noun noun = mock(Noun.class);
        Map<String, Noun> map = new HashMap<>();
        map.put("key", noun);
        GrammaticalTermMapImpl<Noun> termMap = new GrammaticalTermMapImpl<>(map, true);
        assertTrue(termMap.containsKey("key"));
    }

    @Test
    public void putTest() {
        GrammaticalTermMapImpl<Noun> termMap = new GrammaticalTermMapImpl<>();
        Noun noun = mock(Noun.class);
        termMap.put("key", noun);
        assertTrue(termMap.containsKey("key"));
    }

}