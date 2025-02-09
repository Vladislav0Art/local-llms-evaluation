package com.force.i18n.grammar.impl;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.util.*;

import org.junit.Test;
import com.force.i18n.HumanLanguage;
import com.force.i18n.grammar.GrammaticalTerm;
import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.RenamingProvider;

public class GeneratedTest {

    @Test
    public void equalsShouldReturnTrueTest() {
        Map<String, GrammaticalTerm> map = new HashMap<>();
        GrammaticalTerm term = mock(GrammaticalTerm.class);
        map.put("term", term);
        GrammaticalTermMapImpl<GrammaticalTerm> termMapImpl = new GrammaticalTermMapImpl<>(map, false);
        assertTrue(termMapImpl.equals(termMapImpl));
    }

    @Test
    public void equalsShouldReturnFalseTest() {
        Map<String, GrammaticalTerm> map = new HashMap<>();
        GrammaticalTerm term = mock(GrammaticalTerm.class);
        map.put("term", term);
        GrammaticalTermMapImpl<GrammaticalTerm> termMapImpl = new GrammaticalTermMapImpl<>(map, false);
        GrammaticalTermMapImpl<GrammaticalTerm> termMapImpl2 = new GrammaticalTermMapImpl<>();
        assertFalse(termMapImpl.equals(termMapImpl2));
    }

    @Test
    public void isSkinnyTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> termMapImpl = new GrammaticalTermMapImpl<>();
        assertFalse(termMapImpl.isSkinny());
    }

    @Test
    public void makeSkinnyTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> termMapImpl = new GrammaticalTermMapImpl<>();
        assertNotNull(termMapImpl.makeSkinny());
    }

    @Test
    public void writeJsonTest() throws IOException {
        Appendable out = new StringBuilder();
        RenamingProvider renamingProvider = mock(RenamingProvider.class);
        LanguageDictionary dictionary = mock(LanguageDictionary.class);
        Collection<String> termsToInclude = new ArrayList<>();

        GrammaticalTermMapImpl<GrammaticalTerm> termMapImpl = new GrammaticalTermMapImpl<>();
        termMapImpl.writeJson(out, renamingProvider, dictionary, termsToInclude);
    }

    @Test
    public void getTest() {
        Map<String, GrammaticalTerm> map = new HashMap<>();
        GrammaticalTerm term = mock(GrammaticalTerm.class);
        map.put("term", term);
        GrammaticalTermMapImpl<GrammaticalTerm> termMapImpl = new GrammaticalTermMapImpl<>(map, false);
        assertEquals(term, termMapImpl.get("term"));
    }

    @Test
    public void containsKeyTest() {
        Map<String, GrammaticalTerm> map = new HashMap<>();
        GrammaticalTerm term = mock(GrammaticalTerm.class);
        map.put("term", term);
        GrammaticalTermMapImpl<GrammaticalTerm> termMapImpl = new GrammaticalTermMapImpl<>(map, false);
        assertTrue(termMapImpl.containsKey("term"));
    }

    @Test
    public void isEmptyShouldReturnFalseWhenNotEmptyTest() {
        Map<String, GrammaticalTerm> map = new HashMap<>();
        GrammaticalTerm term = mock(GrammaticalTerm.class);
        map.put("term", term);
        GrammaticalTermMapImpl<GrammaticalTerm> termMapImpl = new GrammaticalTermMapImpl<>(map, false);
        assertFalse(termMapImpl.isEmpty());
    }

    @Test
    public void isEmptyShouldReturnTrueWhenEmptyTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> termMapImpl = new GrammaticalTermMapImpl<>();
        assertTrue(termMapImpl.isEmpty());
    }

}