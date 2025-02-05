package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.impl.*;
import com.force.i18n.grammar.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Test
    public void equalsTest() {
        Map<String, GrammaticalTerm> grammaticalTermMap = new HashMap<>();
        GrammaticalTermMapImpl<GrammaticalTerm> grammaticalTermMapImpl1 = new GrammaticalTermMapImpl<>(grammaticalTermMap, false);
        GrammaticalTermMapImpl<GrammaticalTerm> grammaticalTermMapImpl2 = new GrammaticalTermMapImpl<>(grammaticalTermMap, false);

        assertTrue(grammaticalTermMapImpl1.equals(grammaticalTermMapImpl2));
    }

    @Test
    public void hashCodeTest() {
        Map<String, GrammaticalTerm> grammaticalTermMap = new HashMap<>();
        GrammaticalTermMapImpl<GrammaticalTerm> grammaticalTermMapImpl = new GrammaticalTermMapImpl<>(grammaticalTermMap, false);

        assertNotNull(grammaticalTermMapImpl.hashCode());
    }

    @Test
    public void isSkinnyTest() {
        Map<String, GrammaticalTerm> grammaticalTermMap = new HashMap<>();
        GrammaticalTermMapImpl<GrammaticalTerm> grammaticalTermMapImpl = new GrammaticalTermMapImpl<>(grammaticalTermMap, true);

        assertTrue(grammaticalTermMapImpl.isSkinny());
    }

    @Test
    public void makeSkinnyTest() {
        Map<String, GrammaticalTerm> grammaticalTermMap = new HashMap<>();
        GrammaticalTermMapImpl<GrammaticalTerm> grammaticalTermMapImpl = new GrammaticalTermMapImpl<>(grammaticalTermMap, false);

        GrammaticalTermMap<GrammaticalTerm> result = grammaticalTermMapImpl.makeSkinny();

        assertTrue(result.isSkinny());
    }

    @Test
    public void getTest() {
        Map<String, GrammaticalTerm> grammaticalTermMap = new HashMap<>();
        GrammaticalTerm grammaticalTerm = mock(GrammaticalTerm.class);
        grammaticalTermMap.put("test", grammaticalTerm);
        GrammaticalTermMapImpl<GrammaticalTerm> grammaticalTermMapImpl = new GrammaticalTermMapImpl<>(grammaticalTermMap, false);

        assertEquals(grammaticalTerm, grammaticalTermMapImpl.get("test"));
    }

    @Test
    public void containsKeyTest() {
        Map<String, GrammaticalTerm> grammaticalTermMap = new HashMap<>();
        grammaticalTermMap.put("test", null);
        GrammaticalTermMapImpl<GrammaticalTerm> grammaticalTermMapImpl = new GrammaticalTermMapImpl<>(grammaticalTermMap, false);

        assertTrue(grammaticalTermMapImpl.containsKey("test"));
    }

    @Test
    public void putTest() {
        Map<String, GrammaticalTerm> grammaticalTermMap = new HashMap<>();
        GrammaticalTermMapImpl<GrammaticalTerm> grammaticalTermMapImpl = new GrammaticalTermMapImpl<>(grammaticalTermMap, false);
        GrammaticalTerm grammaticalTerm = mock(GrammaticalTerm.class);

        grammaticalTermMapImpl.put("test", grammaticalTerm);

        assertTrue(grammaticalTermMapImpl.containsKey("test"));
    }

    @Test
    public void isEmptyTest() {
        Map<String, GrammaticalTerm> grammaticalTermMap = new HashMap<>();
        GrammaticalTermMapImpl<GrammaticalTerm> grammaticalTermMapImpl = new GrammaticalTermMapImpl<>(grammaticalTermMap, false);

        assertTrue(grammaticalTermMapImpl.isEmpty());
    }

}