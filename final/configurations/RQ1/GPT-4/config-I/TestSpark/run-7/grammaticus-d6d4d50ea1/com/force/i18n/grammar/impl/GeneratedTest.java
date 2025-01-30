package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.GrammaticalTerm;
import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.*;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void equalsSameInstanceTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> grammaticalTermMap = new GrammaticalTermMapImpl<>();
        assertTrue(grammaticalTermMap.equals(grammaticalTermMap));
    }

    @Test
    public void equalsDifferentClassesTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> grammaticalTermMap = new GrammaticalTermMapImpl<>();
        Object obj = new Object();
        assertFalse(grammaticalTermMap.equals(obj));
    }

    @Test
    public void equalsDifferentInstancesTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> grammaticalTermMap1 = new GrammaticalTermMapImpl<>();
        GrammaticalTermMapImpl<GrammaticalTerm> grammaticalTermMap2 = new GrammaticalTermMapImpl<>();
        assertTrue(grammaticalTermMap1.equals(grammaticalTermMap2));
    }

    @Test
    public void hashCodeNonSkinnyTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> grammaticalTermMap = new GrammaticalTermMapImpl<>();
        assertEquals(1, grammaticalTermMap.hashCode());
    }

    @Test
    public void isSkinnyTrueTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> grammaticalTermMap = new GrammaticalTermMapImpl<>(new HashMap<>(), true);
        assertTrue(grammaticalTermMap.isSkinny());
    }

    @Test
    public void isSkinnyFalseTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> grammaticalTermMap = new GrammaticalTermMapImpl<>(new HashMap<>(), false);
        assertFalse(grammaticalTermMap.isSkinny());
    }

    @Test
    public void makeSkinnyTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> grammaticalTermMap = new GrammaticalTermMapImpl<>();
        boolean isSkinny = grammaticalTermMap.makeSkinny().isSkinny();
        assertTrue(isSkinny);
    }

    @Test
    public void keySetEmptyTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> grammaticalTermMap = new GrammaticalTermMapImpl<>();
        Set<String> keySet = grammaticalTermMap.keySet();
        assertTrue(keySet.isEmpty());
    }

    @Test
    public void keySetNotEmptyTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> grammaticalTermMap = new GrammaticalTermMapImpl<>();
        GrammaticalTerm gt = Mockito.mock(GrammaticalTerm.class);
        grammaticalTermMap.put("test", gt);
        Set<String> keySet = grammaticalTermMap.keySet();
        assertFalse(keySet.isEmpty());
    }

    @Test
    public void containsKeyFalseTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> grammaticalTermMap = new GrammaticalTermMapImpl<>();
        assertFalse(grammaticalTermMap.containsKey("test"));
    }

    @Test
    public void containsKeyTrueTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> grammaticalTermMap = new GrammaticalTermMapImpl<>();
        GrammaticalTerm gt = Mockito.mock(GrammaticalTerm.class);
        grammaticalTermMap.put("test", gt);
        assertTrue(grammaticalTermMap.containsKey("test"));
    }

    @Test
    public void getNullTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> grammaticalTermMap = new GrammaticalTermMapImpl<>();
        assertNull(grammaticalTermMap.get("test"));
    }

    @Test
    public void getNotNullTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> grammaticalTermMap = new GrammaticalTermMapImpl<>();
        GrammaticalTerm gt = Mockito.mock(GrammaticalTerm.class);
        grammaticalTermMap.put("test", gt);
        assertEquals(gt, grammaticalTermMap.get("test"));
    }

    @Test
    public void putToSkinnyTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> grammaticalTermMap = new GrammaticalTermMapImpl<>(new HashMap<>(), true);
        GrammaticalTerm gt = Mockito.mock(GrammaticalTerm.class);
        grammaticalTermMap.put("test", gt);
    }

    @Test
    public void putAllToSkinnyTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> grammaticalTermMap = new GrammaticalTermMapImpl<>(new HashMap<>(), true);
        GrammaticalTermMapImpl<GrammaticalTerm> other = new GrammaticalTermMapImpl<>();
        grammaticalTermMap.putAll(other);
    }

}