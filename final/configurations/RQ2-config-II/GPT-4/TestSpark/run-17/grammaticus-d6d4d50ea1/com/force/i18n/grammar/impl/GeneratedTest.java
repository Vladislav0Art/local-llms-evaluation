package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.GrammaticalTerm;
import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.RenamingProvider;
import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedTest {

    @Test
    public void equalsTest() {
        GrammaticalTermMapImpl<String> termMap1 = new GrammaticalTermMapImpl<>();
        GrammaticalTermMapImpl<String> termMap2 = new GrammaticalTermMapImpl<>();

        assertTrue(termMap1.equals(termMap2));
        assertFalse(termMap1.equals(null));
        assertFalse(termMap1.equals(new Object()));

        termMap1.put("Test", "Value");
        termMap2.put("Test", "Value");

        assertTrue(termMap1.equals(termMap2));
        assertFalse(termMap1.equals(new GrammaticalTermMapImpl<>()));
    }

    @Test
    public void hashCodeTest() {
        GrammaticalTermMapImpl<String> termMap = new GrammaticalTermMapImpl<>();
        assertEquals(termMap.hashCode(), termMap.hashCode());
    }

    @Test
    public void putTest() {
        GrammaticalTermMapImpl<String> termMap = new GrammaticalTermMapImpl<>();
        assertNull(termMap.get("Test"));
        termMap.put("Test", "Value");
        assertEquals("Value", termMap.get("Test"));
    }

    @Test
    public void putAllTest() {
        GrammaticalTermMapImpl<String> termMap1 = new GrammaticalTermMapImpl<>();
        GrammaticalTermMapImpl<String> termMap2 = new GrammaticalTermMapImpl<>();
        termMap2.put("Test", "Value");
        termMap1.putAll(termMap2);
        assertEquals("Value", termMap1.get("Test"));
    }

    @Test
    public void isEmptyTest() {
        GrammaticalTermMapImpl<String> termMap = new GrammaticalTermMapImpl<>();
        assertTrue(termMap.isEmpty());
        termMap.put("Test", "Value");
        assertFalse(termMap.isEmpty());
    }

    @Test
    public void containsKeyTest() {
        GrammaticalTermMapImpl<String> termMap = new GrammaticalTermMapImpl<>();
        assertFalse(termMap.containsKey("Test"));
        termMap.put("Test", "Value");
        assertTrue(termMap.containsKey("Test"));
    }

    @Test
    public void writeJsonTest() throws IOException {
        Map<String, String> termMap = new HashMap<>();
        termMap.put("Test", "Value");
        GrammaticalTermMapImpl<String> termMapImpl = new GrammaticalTermMapImpl<>(termMap, false);

        Appendable out = new StringBuilder();
        RenamingProvider renamingProvider = mock(RenamingProvider.class);
        LanguageDictionary dictionary = mock(LanguageDictionary.class);
        termMapImpl.writeJson(out, renamingProvider, dictionary, termMap.keySet());

        String expectedJson = ""; // The expected json output based on the termMapImpl content
        assertEquals(expectedJson, out.toString());
    }

    @Test
    public void isSkinnyTest() {
        GrammaticalTermMap<String> termMap1 = new GrammaticalTermMapImpl<>(new HashMap<String, String>(), false);
        assertFalse(termMap1.isSkinny());
        GrammaticalTermMap<String> termMap2 = termMap1.makeSkinny();
        assertTrue(termMap2.isSkinny());
    }

    @Test
    public void makeSkinnyTest() {
        Map<String, String> termMap = new HashMap<>();
        termMap.put("Test", "Value");
        GrammaticalTermMapImpl<String> termMapImpl = new GrammaticalTermMapImpl<>(termMap, false);
        assertFalse(termMapImpl.isSkinny());
        termMapImpl = termMapImpl.makeSkinny();
        assertTrue(termMapImpl.isSkinny());
    }

    @Test
    public void keySetTest() {
        GrammaticalTermMapImpl<String> termMap = new GrammaticalTermMapImpl<>();
        assertTrue(termMap.keySet().isEmpty());
        termMap.put("Test", "Value");
        assertEquals(1, termMap.keySet().size());
        assertTrue(termMap.keySet().contains("Test"));
    }

    @Test
    public void valuesTest() {
        GrammaticalTermMapImpl<String> termMap = new GrammaticalTermMapImpl<>();
        assertTrue(termMap.values().isEmpty());
        termMap.put("Test", "Value");
        assertEquals(1, termMap.values().size());
        assertTrue(termMap.values().contains("Value"));
    }

    @Test
    public void entrySetTest() {
        GrammaticalTermMapImpl<String> termMap = new GrammaticalTermMapImpl<>();
        assertTrue(termMap.entrySet().isEmpty());
        termMap.put("Test", "Value");
        assertEquals(1, termMap.entrySet().size());
    }

}