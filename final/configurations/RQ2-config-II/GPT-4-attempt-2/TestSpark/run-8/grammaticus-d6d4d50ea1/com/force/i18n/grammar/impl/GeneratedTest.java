package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import com.force.i18n.grammar.GrammaticalTerm;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class GeneratedTest {

    @Test
    public void putMethodWhenParamIsValidTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> grammaticalTermMap = new GrammaticalTermMapImpl<>();
        GrammaticalTerm grammaticalTermMock = mock(GrammaticalTerm.class);
        grammaticalTermMap.put("key", grammaticalTermMock);
        assertNotNull(grammaticalTermMap.get("key"));
    }

    @Test
    public void putMethodWhenParamsAreNullOrEmptyTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> grammaticalTermMap = new GrammaticalTermMapImpl<>();
        GrammaticalTerm grammaticalTermMock = mock(GrammaticalTerm.class);
        grammaticalTermMap.put("", grammaticalTermMock);
        assertNull(grammaticalTermMap.get(""));

        grammaticalTermMap.put(null, grammaticalTermMock);
        assertNull(grammaticalTermMap.get(null));

        grammaticalTermMap.put("key", null);
        assertNull(grammaticalTermMap.get("key"));
    }

    @Test
    public void equalsMethodWhenObjectsAreEqualTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> grammaticalTermMap1 = new GrammaticalTermMapImpl<>();
        GrammaticalTermMapImpl<GrammaticalTerm> grammaticalTermMap2 = new GrammaticalTermMapImpl<>();
        assertTrue(grammaticalTermMap1.equals(grammaticalTermMap2));
    }

    @Test
    public void equalsMethodWhenObjectsAreNotEqualTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> grammaticalTermMap1 = new GrammaticalTermMapImpl<>();
        GrammaticalTermMapImpl<GrammaticalTerm> grammaticalTermMap2 = new GrammaticalTermMapImpl<>();
        GrammaticalTerm grammaticalTermMock = mock(GrammaticalTerm.class);
        grammaticalTermMap2.put("key", grammaticalTermMock);
        assertFalse(grammaticalTermMap1.equals(grammaticalTermMap2));
    }

    @Test
    public void isEmptyMethodWhenMapIsEmptyTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> grammaticalTermMap = new GrammaticalTermMapImpl<>();
        assertTrue(grammaticalTermMap.isEmpty());
    }

    @Test
    public void isEmptyMethodWhenMapIsNotEmptyTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> grammaticalTermMap = new GrammaticalTermMapImpl<>();
        GrammaticalTerm grammaticalTermMock = mock(GrammaticalTerm.class);
        grammaticalTermMap.put("key", grammaticalTermMock);
        assertFalse(grammaticalTermMap.isEmpty());
    }

    @Test
    public void putAllMethodWhenMapIsValidTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> grammaticalTermMap1 = new GrammaticalTermMapImpl<>();
        GrammaticalTermMapImpl<GrammaticalTerm> grammaticalTermMap2 = new GrammaticalTermMapImpl<>();
        GrammaticalTerm grammaticalTermMock = mock(GrammaticalTerm.class);
        grammaticalTermMap2.put("key", grammaticalTermMock);
        grammaticalTermMap1.putAll(grammaticalTermMap2);
        assertNotNull(grammaticalTermMap1.get("key"));
    }

    @Test
    public void putAllMethodWhenMapIsNullTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> grammaticalTermMap1 = new GrammaticalTermMapImpl<>();
        grammaticalTermMap1.putAll(null);
    }

    @Test
    public void containsKeyMethodWhenKeyDoesExistTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> grammaticalTermMap = new GrammaticalTermMapImpl<>();
        GrammaticalTerm grammaticalTermMock = mock(GrammaticalTerm.class);
        grammaticalTermMap.put("key", grammaticalTermMock);
        assertTrue(grammaticalTermMap.containsKey("key"));
    }

    @Test
    public void containsKeyMethodWhenKeyDoesNotExistTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> grammaticalTermMap = new GrammaticalTermMapImpl<>();
        assertFalse(grammaticalTermMap.containsKey("key"));
    }

    @Test
    public void valuesMethodWhenMapIsEmptyTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> grammaticalTermMap = new GrammaticalTermMapImpl<>();
        assertTrue(grammaticalTermMap.values().isEmpty());
    }

    @Test
    public void valuesMethodWhenMapIsNotEmptyTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> grammaticalTermMap = new GrammaticalTermMapImpl<>();
        GrammaticalTerm grammaticalTermMock = mock(GrammaticalTerm.class);
        grammaticalTermMap.put("key", grammaticalTermMock);
        assertFalse(grammaticalTermMap.values().isEmpty());
        assertTrue(grammaticalTermMap.values().contains(grammaticalTermMock));
    }

}