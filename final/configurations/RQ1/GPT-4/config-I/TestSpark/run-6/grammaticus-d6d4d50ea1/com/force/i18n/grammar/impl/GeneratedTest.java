package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import org.junit.Test;

import static org.junit.Assert.*;

import com.force.i18n.grammar.LanguageTerm;

import java.util.HashMap;

public class GeneratedTest {

    @Test
    public void equalsSameObjectTest() {
        GrammaticalTermMapImpl<LanguageTerm> termMap = new GrammaticalTermMapImpl<>();
        assertTrue(termMap.equals(termMap));
    }

    @Test
    public void equalsDifferentObjectTest() {
        GrammaticalTermMapImpl<LanguageTerm> termMap1 = new GrammaticalTermMapImpl<>();
        GrammaticalTermMapImpl<LanguageTerm> termMap2 = new GrammaticalTermMapImpl<>();
        assertTrue(termMap1.equals(termMap2));
    }

    @Test
    public void hashCodeTest() {
        GrammaticalTermMapImpl<LanguageTerm> termMap = new GrammaticalTermMapImpl<>();
        assertEquals(termMap.hashCode(), termMap.hashCode());
    }

    @Test
    public void isSkinnyTest() {
        GrammaticalTermMapImpl<LanguageTerm> termMap = new GrammaticalTermMapImpl<>(new HashMap<>(), true);
        assertTrue(termMap.isSkinny());
    }

    @Test
    public void makeSkinnyTest() {
        GrammaticalTermMapImpl<LanguageTerm> termMap = new GrammaticalTermMapImpl<>(new HashMap<>(), false);
        assertTrue(termMap.makeSkinny().isSkinny());
    }

    @Test
    public void keySetTest() {
        GrammaticalTermMapImpl<LanguageTerm> termMap = new GrammaticalTermMapImpl<LanguageTerm>();
        termMap.put("key", new LanguageTerm());
        assertTrue(termMap.keySet().contains("key"));
    }

    @Test
    public void getExistTest() {
        GrammaticalTermMapImpl<LanguageTerm> termMap = new GrammaticalTermMapImpl<>();
        LanguageTerm term = new LanguageTerm();
        termMap.put("key", term);
        assertEquals(term, termMap.get("key"));
    }

    @Test
    public void containsKeyExistTest() {
        GrammaticalTermMapImpl<LanguageTerm> termMap = new GrammaticalTermMapImpl<>();
        termMap.put("key", new LanguageTerm());
        assertTrue(termMap.containsKey("key"));
    }

    @Test
    public void entrySetTest() {
        GrammaticalTermMapImpl<LanguageTerm> termMap = new GrammaticalTermMapImpl<>();
        termMap.put("key", new LanguageTerm());
        assertFalse(termMap.entrySet().isEmpty());
    }

    @Test
    public void valuesTest() {
        GrammaticalTermMapImpl<LanguageTerm> termMap = new GrammaticalTermMapImpl<>();
        termMap.put("key", new LanguageTerm());
        assertEquals(1, termMap.values().size());
    }

    @Test
    public void putTest_isSkinny() {
        GrammaticalTermMapImpl<LanguageTerm> termMap = new GrammaticalTermMapImpl<>(new HashMap<>(), true);
        termMap.put("key", new LanguageTerm());
    }

    @Test
    public void isEmptyTest() {
        GrammaticalTermMapImpl<LanguageTerm> termMap = new GrammaticalTermMapImpl<>();
        assertTrue(termMap.isEmpty());
    }

}