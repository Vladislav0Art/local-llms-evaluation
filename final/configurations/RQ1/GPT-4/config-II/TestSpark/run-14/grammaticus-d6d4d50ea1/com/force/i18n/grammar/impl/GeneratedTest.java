package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.GrammaticalTerm;
import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void constructorWithTwoParametersTest() {
        Map<String, GrammaticalTerm> map = new HashMap<>();
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>(map, true);
        assertTrue(termMap.isSkinny());
    }

    @Test
    public void makeSkinnyTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>();
        assertFalse(termMap.isSkinny());
        termMap = termMap.makeSkinny();
        assertTrue(termMap.isSkinny());
    }

    @Test
    public void writeJsonTest() throws Exception {
        GrammaticalTerm term = Mockito.mock(GrammaticalTerm.class);
        Mockito.when(term.getName()).thenReturn("Term");

        HashMap<String, GrammaticalTerm> grammarMap = new HashMap<>();
        grammarMap.put("term", term);

        LanguageDictionary dictionary = Mockito.mock(LanguageDictionary.class);
        StringBuilder sb = new StringBuilder();

        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>(grammarMap);
        termMap.writeJson(sb, null, dictionary, new HashSet<>());

        assertTrue(sb.toString().contains("\"term\":"));
    }

    @Test
    public void putTest() {
        GrammaticalTerm term = Mockito.mock(GrammaticalTerm.class);
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>();
        termMap.put("test", term);
        assertNotNull(termMap.get("test"));
    }

    @Test
    public void putWhenSkinnyThrowsExceptionTest() {
        GrammaticalTerm term = Mockito.mock(GrammaticalTerm.class);
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>();
        termMap = termMap.makeSkinny();
        termMap.put("test", term);
    }

    @Test
    public void isEmptyWhenEmptyTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>();
        assertTrue(termMap.isEmpty());
    }

    @Test
    public void isEmptyWhenNotEmptyTest() {
        GrammaticalTerm term = Mockito.mock(GrammaticalTerm.class);
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>();
        termMap.put("test", term);
        assertFalse(termMap.isEmpty());
    }

    @Test
    public void equalsSameInstanceTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>();
        assertTrue(termMap.equals(termMap));
    }

    @Test
    public void equalsDifferentInstanceTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> termMap1 = new GrammaticalTermMapImpl<>();
        GrammaticalTermMapImpl<GrammaticalTerm> termMap2 = new GrammaticalTermMapImpl<>();
        assertTrue(termMap1.equals(termMap2));
    }

    @Test
    public void equalsDifferentInstanceWhenSkinnyTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> termMap1 = new GrammaticalTermMapImpl<>();
        GrammaticalTermMapImpl<GrammaticalTerm> termMap2 = new GrammaticalTermMapImpl<>();
        termMap2 = termMap2.makeSkinny();
        assertFalse(termMap1.equals(termMap2));
    }

    @Test
    public void hashCodeTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>();
        assertEquals(0, termMap.hashCode());
        termMap = termMap.makeSkinny();
        assertEquals(37, termMap.hashCode());
    }

}