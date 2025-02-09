package com.force.i18n.grammar.impl;

import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import java.util.HashMap;
import java.util.Map;

public class GeneratedTest {

    @Test
    public void equalsSameObjectTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> map = new GrammaticalTermMapImpl<>();
        assertTrue(map.equals(map));
    }

    @Test
    public void equalsNullTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> map = new GrammaticalTermMapImpl<>();
        assertFalse(map.equals(null));
    }

    @Test
    public void hashCodeTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> map = new GrammaticalTermMapImpl<>();
        assertEquals(map.hashCode(), map.hashCode());
    }

    @Test
    public void isSkinnyTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> map = new GrammaticalTermMapImpl<>();
        Assert.assertFalse(map.isSkinny());
    }

    @Test
    public void makeSkinnyTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> map = new GrammaticalTermMapImpl<>();
        Assert.assertEquals(map.makeSkinny(), map.makeSkinny());
    }

    @Test
    public void keySetTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> map = new GrammaticalTermMapImpl<>();
        assertEquals(0, map.keySet().size());
    }

    @Test
    public void getTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> map = new GrammaticalTermMapImpl<>();
        Assert.assertNull(map.get("test"));
    }

    @Test
    public void containsKeyTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> map = new GrammaticalTermMapImpl<>();
        assertFalse(map.containsKey("test"));
    }

    @Test
    public void entrySetTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> map = new GrammaticalTermMapImpl<>();
        assertEquals(0, map.entrySet().size());
    }

    @Test
    public void valuesTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> map = new GrammaticalTermMapImpl<>();
        assertEquals(0, map.values().size());
    }

    @Test
    public void putTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> map = new GrammaticalTermMapImpl<>();
        GrammaticalTerm term = new Noun() {
        };
        map.put("test", term);

        assertEquals(map.get("test"), term);
    }

    @Test
    public void putAllTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> map = new GrammaticalTermMapImpl<>();
        Map<String, GrammaticalTerm> tempMap = new HashMap<>();
        GrammaticalTerm term = new Noun() {
        };
        tempMap.put("test", term);
        map.putAll((GrammaticalTermMap<GrammaticalTerm>) tempMap);

        assertEquals(map.get("test"), term);
    }

    @Test
    public void isEmptyTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> map = new GrammaticalTermMapImpl<>();
        assertTrue(map.isEmpty());
    }

}