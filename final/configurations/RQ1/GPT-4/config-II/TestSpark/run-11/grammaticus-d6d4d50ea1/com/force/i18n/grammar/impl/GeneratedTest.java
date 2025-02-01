package com.force.i18n.grammar.impl;

import org.junit.Test;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

import java.util.*;

public class GeneratedTest {

    @Test
    public void mapConstructorParameterIsSkinnyTrueTest() {
        Map<String, GrammaticalTerm> map = new HashMap<>();
        GrammaticalTermMapImpl<GrammaticalTerm> grammaticalTermMap = new GrammaticalTermMapImpl<>(map, true);
        Assert.assertTrue(grammaticalTermMap.isSkinny());
    }

    @Test
    public void mapConstructorParameterIsSkinnyFalseTest() {
        Map<String, GrammaticalTerm> map = new HashMap<>();
        GrammaticalTermMapImpl<GrammaticalTerm> grammaticalTermMap = new GrammaticalTermMapImpl<>(map, false);
        Assert.assertFalse(grammaticalTermMap.isSkinny());
    }

    @Test
    public void putIsSkinnyTrueTest() {
        Map<String, GrammaticalTerm> map = new HashMap<>();
        GrammaticalTermMapImpl<GrammaticalTerm> grammaticalTermMap = new GrammaticalTermMapImpl<>(map, true);

        // This should throw runtime exception as the map is skinny
        grammaticalTermMap.put("key", new Noun() {
            @Override
            public String getName() {
                return "TestNoun";
            }
        });
    }

    @Test
    public void putIsSkinnyFalseTest() {
        Map<String, GrammaticalTerm> map = new HashMap<>();
        GrammaticalTermMapImpl<GrammaticalTerm> grammaticalTermMap = new GrammaticalTermMapImpl<>(map, false);
        grammaticalTermMap.put("key", new Noun() {
            @Override
            public String getName() {
                return "TestNoun";
            }
        });
        Assert.assertTrue(grammaticalTermMap.containsKey("key"));
    }

    @Test
    public void equalsTest() {
        Map<String, GrammaticalTerm> map = new HashMap<>();
        GrammaticalTermMapImpl<GrammaticalTerm> grammaticalTermMap1 = new GrammaticalTermMapImpl<>(map, true);
        GrammaticalTermMapImpl<GrammaticalTerm> grammaticalTermMap2 = new GrammaticalTermMapImpl<>(map, true);
        Assert.assertEquals(grammaticalTermMap1, grammaticalTermMap2);
    }

    @Test
    public void hashCodeTest() {
        Map<String, GrammaticalTerm> map = new HashMap<>();
        GrammaticalTermMapImpl<GrammaticalTerm> grammaticalTermMap = new GrammaticalTermMapImpl<>(map, true);
        int expectedHashcode = 37;
        Assert.assertEquals(expectedHashcode, grammaticalTermMap.hashCode());
    }

    @Test
    public void isEmptyReturnsTrueOnEmptyMapTest() {
        Map<String, GrammaticalTerm> map = new HashMap<>();
        GrammaticalTermMapImpl<GrammaticalTerm> grammaticalTermMap = new GrammaticalTermMapImpl<>(map, false);
        Assert.assertTrue(grammaticalTermMap.isEmpty());
    }

    @Test
    public void isEmptyReturnsFalseOnNonEmptyMapTest() {
        Map<String, GrammaticalTerm> map = new HashMap<>();
        map.put("n1", new Noun() {
            @Override
            public String getName() {
                return "Noun1";
            }
        });
        GrammaticalTermMapImpl<GrammaticalTerm> grammaticalTermMap = new GrammaticalTermMapImpl<>(map, false);
        Assert.assertFalse(grammaticalTermMap.isEmpty());
    }

    @Test
    public void makeSkinnyTest() {
        Map<String, GrammaticalTerm> map = new HashMap<>();
        map.put("n1", new Noun() {
            @Override
            public String getName() {
                return "Noun1";
            }
        });
        GrammaticalTermMapImpl<GrammaticalTerm> originalTerMap = new GrammaticalTermMapImpl<>(map, false);
        GrammaticalTermMapImpl<GrammaticalTerm> skinnyMap = originalTerMap.makeSkinny();
        Assert.assertNotEquals(originalTerMap, skinnyMap);
        Assert.assertFalse(originalTerMap.isSkinny());
        Assert.assertTrue(skinnyMap.isSkinny());
    }

}