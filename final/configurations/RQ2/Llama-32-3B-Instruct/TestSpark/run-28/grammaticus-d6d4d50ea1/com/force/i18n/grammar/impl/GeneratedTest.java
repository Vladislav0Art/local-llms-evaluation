package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class GeneratedTest {

    @Test
    public void constructorTest() {
        assertNotEquals(null, new GrammaticalTermMapImpl());
    }

    @Test
    public void constructorWithEmptyMapTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> map = new GrammaticalTermMapImpl<>();
        assertTrue(map.isEmpty());
        assertEquals(0, map.keySet().size());
    }

    @Test
    public void putAndGetTest() {
        GrammaticalTerm term1 = new GrammaticalTerm();
        GrammaticalTerm term2 = new GrammaticalTerm();

        GrammaticalTermMapImpl<GrammaticalTerm> map = new GrammaticalTermMapImpl<>();
        map.put("key", term1);
        assertEquals(term1, map.get("key"));
    }

    @Test
    public void putAndGetNullKeyTest() {
        GrammaticalTerm term = new GrammaticalTerm();

        GrammaticalTermMapImpl<GrammaticalTerm> map = new GrammaticalTermMapImpl<>();
        assertThrows(NullPointerException.class, () -> map.put(null, term));
    }

    @Test
    public void putAllTest() {
        GrammaticalTerm term1 = new GrammaticalTerm();
        GrammaticalTerm term2 = new GrammaticalTerm();

        GrammaticalTermMap<GrammaticalTerm> otherMap = new HashMap<>();
        otherMap.put("key", term1);
        otherMap.put("otherKey", term2);

        GrammaticalTermMapImpl<GrammaticalTerm> map = new GrammaticalTermMapImpl<>();
        map.putAll(otherMap);

        assertEquals(term1, map.get("key"));
        assertEquals(term2, map.get("otherKey"));
    }

    @Test
    public void containsKeyTest() {
        GrammaticalTerm term = new GrammaticalTerm();

        GrammaticalTermMap<GrammaticalTerm> map = new HashMap<>();
        map.put("key", term);

        assertTrue(map.containsKey("key"));
        assertFalse(map.containsKey("otherKey"));
    }

    @Test
    public void isEmptyTest() {
        GrammaticalTermMap<GrammaticalTerm> map = new HashMap<>();

        assertTrue(map.isEmpty());
        assertFalse(map.isEmpty());

        map.put("key", new GrammaticalTerm());

        assertFalse(map.isEmpty());
        assertEquals(1, map.keySet().size());
    }

    @Test
    public void makeSkinnyTest() {
        assertSame(GrammaticalTermMapImpl.class, new GrammaticalTermMapImpl<>().makeSkinny());
    }

    @Test
    public void writeJsonTest() throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(out));
        RenamingProvider renamingProvider = new RenameProvider();
        LanguageDictionary dictionary = new Dictionary();
        Collection<String> termsToInclude = new HashSet<>();

        GrammaticalTerm term = new GrammaticalTerm();
        GrammaticalTermMap<GrammaticalTerm> map = new HashMap<>();
        map.put("key", term);
        map.writeJson(System.out, renamingProvider, dictionary, termsToInclude);

        System.setOut(originalOut);
        assertEquals("{\"key\":{}}", out.toString());
    }

    @Test
    public void keySetTest() {
        GrammaticalTermMap<GrammaticalTerm> map = new HashMap<>();

        assertTrue(map.keySet().isEmpty());

        map.put("key", new GrammaticalTerm());
        assertEquals(1, map.keySet().size());
    }

}