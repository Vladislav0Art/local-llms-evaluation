package com.force.i18n.grammar.impl;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.mock;

public class GeneratedTest {

    @Test
    public void constructorEmptyTest() {
        GrammaticalTermMapImpl grammaticalTermMap = new GrammaticalTermMapImpl();
        assertNotNull(grammaticalTermMap);
    }

    @Test
    public void constructorWithParamsTest() {
        HashMap<String, GrammaticalTerm> map = new HashMap<>();
        GrammaticalTermMapImpl grammaticalTermMap = new GrammaticalTermMapImpl(map, true);
        assertNotNull(grammaticalTermMap);
    }

    @Test
    public void isSkinnyTest() {
        HashMap<String, GrammaticalTerm> map = new HashMap<>();
        GrammaticalTermMapImpl grammaticalTermMap = new GrammaticalTermMapImpl(map, true);
        assertTrue(grammaticalTermMap.isSkinny());
    }

    @Test
    public void makeSkinnyTest() {
        HashMap<String, GrammaticalTerm> map = new HashMap<>();
        GrammaticalTermMapImpl beforeSkinnyTermMap = new GrammaticalTermMapImpl(map, false);
        GrammaticalTermMapImpl afterSkinnyTermMap = (GrammaticalTermMapImpl) beforeSkinnyTermMap.makeSkinny();
        assertTrue(afterSkinnyTermMap.isSkinny());
    }

    @Test
    public void getTest() {
        GrammaticalTerm term = mock(GrammaticalTerm.class);
        Map<String, GrammaticalTerm> map = new HashMap<>();
        map.put("Term", term);
        GrammaticalTermMapImpl termMap = new GrammaticalTermMapImpl(map, false);
        assertEquals(term, termMap.get("Term"));
    }

    @Test
    public void containsKeyTest() {
        GrammaticalTerm term = mock(GrammaticalTerm.class);
        Map<String, GrammaticalTerm> map = new HashMap<>();
        map.put("Term", term);
        GrammaticalTermMapImpl termMap = new GrammaticalTermMapImpl(map, false);
        assertTrue(termMap.containsKey("Term"));
    }

    @Test
    public void putTest() {
        GrammaticalTerm term = mock(GrammaticalTerm.class);
        Map<String, GrammaticalTerm> map = new HashMap<>();
        GrammaticalTermMapImpl termMap = new GrammaticalTermMapImpl(map, false);
        termMap.put("newTerm", term);
        assertTrue(termMap.containsKey("newTerm"));
    }

    @Test
    public void putAllTest() {
        GrammaticalTerm term = mock(GrammaticalTerm.class);
        Map<String, GrammaticalTerm> mapOne = new HashMap<>();
        mapOne.put("Term", term);
        Map<String, GrammaticalTerm> mapTwo = new HashMap<>();
        mapTwo.put("newTerm", term);
        GrammaticalTermMapImpl termMapOne = new GrammaticalTermMapImpl(mapOne, false);
        GrammaticalTermMapImpl termMapTwo = new GrammaticalTermMapImpl(mapTwo, false);
        termMapOne.putAll(termMapTwo);
        assertTrue(termMapOne.containsKey("newTerm"));
    }

    @Test
    public void isEmptyTest() {
        GrammaticalTermMapImpl emptyTermMap = new GrammaticalTermMapImpl();
        assertTrue(emptyTermMap.isEmpty());
        GrammaticalTerm term = mock(GrammaticalTerm.class);
        Map<String, GrammaticalTerm> map = new HashMap<>();
        map.put("Term", term);
        GrammaticalTermMapImpl notEmptyTermMap = new GrammaticalTermMapImpl(map, false);
        assertFalse(notEmptyTermMap.isEmpty());
    }

}