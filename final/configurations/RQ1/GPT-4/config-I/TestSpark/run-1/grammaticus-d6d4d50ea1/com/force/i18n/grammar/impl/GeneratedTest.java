package com.force.i18n.grammar.impl;

import com.force.i18n.HumanLanguage;
import com.force.i18n.grammar.GrammaticalTerm;
import com.force.i18n.grammar.Noun;
import com.force.i18n.grammar.RenamingProvider;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void equalsTrueTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> testTerm = new GrammaticalTermMapImpl<>();
        assertTrue(testTerm.equals(testTerm));
    }

    @Test
    public void equalsFalseTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> testTerm1 = new GrammaticalTermMapImpl<>();
        GrammaticalTermMapImpl<GrammaticalTerm> testTerm2 = new GrammaticalTermMapImpl<>();
        Mockito.when(testTerm2.isSkinny()).thenReturn(true);
        assertFalse(testTerm1.equals(testTerm2));
        assertFalse(testTerm1.equals("wrong object"));
    }

    @Test
    public void hashCodeTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> testTerm = new GrammaticalTermMapImpl<>();
        assertEquals(new HashMap<String, GrammaticalTerm>().hashCode(), testTerm.hashCode());
    }

    @Test
    public void makeSkinnyTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> testTerm = new GrammaticalTermMapImpl<>();
        assertTrue(testTerm.makeSkinny().isSkinny());
    }

    @Test
    public void putExceptionTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> testTerm = new GrammaticalTermMapImpl<>(new HashMap<>(), true);
        testTerm.put("test", Mockito.mock(GrammaticalTerm.class));
    }

    @Test
    public void putAllExceptionTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> testTerm = new GrammaticalTermMapImpl<>(new HashMap<>(), true);
        testTerm.putAll(new GrammaticalTermMapImpl<>());
    }

    @Test
    public void getNullTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> testTerm = new GrammaticalTermMapImpl<>();
        assertNull(testTerm.get("test"));
    }

    @Test
    public void containsKeyFalseTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> testTerm = new GrammaticalTermMapImpl<>();
        assertFalse(testTerm.containsKey("test"));
    }

    @Test
    public void valuesIsEmptyTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> testTerm = new GrammaticalTermMapImpl<>();
        assertTrue(testTerm.values().isEmpty());
    }

    @Test
    public void equalsFalseTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> testTerm1 = new GrammaticalTermMapImpl<>();
        GrammaticalTermMapImpl<GrammaticalTerm> testTerm2 = new GrammaticalTermMapImpl<>();

        assertFalse(testTerm1.equals(testTerm2.makeSkinny()));
        assertFalse(testTerm1.equals("wrong object"));
    }

}