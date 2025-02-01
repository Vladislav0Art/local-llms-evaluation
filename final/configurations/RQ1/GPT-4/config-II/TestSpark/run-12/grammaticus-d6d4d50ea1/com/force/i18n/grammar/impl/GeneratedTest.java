package com.force.i18n.grammar.impl;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void equalsSameInstanceTest() {
        GrammaticalTermMapImpl<String> termMapA = new GrammaticalTermMapImpl<>();
        assertTrue(termMapA.equals(termMapA));
    }

    @Test
    public void equalsDifferentTypeTest() {
        GrammaticalTermMapImpl<String> termMapA = new GrammaticalTermMapImpl<>();
        assertFalse(termMapA.equals("test string"));
    }

    @Test
    public void equalsDifferentSkinnyTest() {
        GrammaticalTermMapImpl<String> termMapA = new GrammaticalTermMapImpl<>();
        GrammaticalTermMapImpl<String> termMapB = new GrammaticalTermMapImpl<>(new HashMap<>(), true);
        assertFalse(termMapA.equals(termMapB));
    }

    @Test
    public void equalsSameSkinnyTest() {
        GrammaticalTermMapImpl<String> termMapA = new GrammaticalTermMapImpl<>(new HashMap<>(), true);
        GrammaticalTermMapImpl<String> termMapB = new GrammaticalTermMapImpl<>(new HashMap<>(), true);
        assertTrue(termMapA.equals(termMapB));
    }

    @Test
    public void putSkinnyMapTest() {
        GrammaticalTermMapImpl<String> termMap = new GrammaticalTermMapImpl<>(new HashMap<>(), true);
        termMap.put("key", "value");
    }

    @Test
    public void putAllSkinnyMapTest() {
        GrammaticalTermMapImpl<String> termMapA = new GrammaticalTermMapImpl<>(new HashMap<>(), true);
        GrammaticalTermMapImpl<String> termMapB = new GrammaticalTermMapImpl<>();
        termMapA.putAll(termMapB);
    }

    @Test
    public void isEmptyTest() {
        GrammaticalTermMapImpl<String> termMap = new GrammaticalTermMapImpl<>();
        assertTrue(termMap.isEmpty());
    }

    @Test
    public void isNotEmptyTest() {
        GrammaticalTermMapImpl<String> termMap = new GrammaticalTermMapImpl<>();
        termMap.put("key", "value");
        assertFalse(termMap.isEmpty());
    }

    @Test
    public void containsKeyTest() {
        GrammaticalTermMapImpl<String> termMap = new GrammaticalTermMapImpl<>();
        termMap.put("key", "value");
        assertTrue(termMap.containsKey("key"));
    }

    @Test
    public void makeSkinnyTest() {
        GrammaticalTermMapImpl<String> termMap = new GrammaticalTermMapImpl<>();
        assertTrue(termMap.makeSkinny().isSkinny());
    }

    @Test
    public void writeJsonEmptyTest() throws IOException {
        GrammaticalTermMapImpl<String> termMap = new GrammaticalTermMapImpl<>();
        StringBuilder out = new StringBuilder();
        termMap.writeJson(out, null, null, null);
        assertEquals("{}", out.toString());
    }

    @Test
    public void writeJsonWithTermsToIncludeTest() throws IOException {
        TermMap t = Mockito.mock(TermMap.class);
        Mockito.when(t.getName()).thenReturn("test");
        Mockito.doNothing().when(t).toJson(any(Appendable.class));
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>();
        termMap.put("test", t);
        StringBuilder out = new StringBuilder()
        termMap.writeJson(out, null, null, new HashSet<>(Arrays.asList("test")));
        assertEquals("{\"test\":}", out.toString());
    }

}