package com.force.i18n.grammar.impl;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Map;

import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;

public class GeneratedTest {

    @Test
    public void equalsTest() {
        GrammaticalTermMapImpl map = new GrammaticalTermMapImpl();
        Assert.assertTrue(map.equals(map));
        Assert.assertFalse(map.equals(null));
        Assert.assertFalse(map.equals(new Object()));
    }

    @Test
    public void hashCodeTest() {
        GrammaticalTermMapImpl map = new GrammaticalTermMapImpl();
        int expectedHashCode = map.hashCode();
        Assert.assertEquals(expectedHashCode, map.hashCode());
    }

    @Test
    public void isSkinnyTest() {
        GrammaticalTermMapImpl map = new GrammaticalTermMapImpl(new HashMap<String, GrammaticalTerm>(), true);
        Assert.assertTrue(map.isSkinny());
    }

    @Test
    public void makeSkinnyTest() {
        GrammaticalTermMapImpl map = new GrammaticalTermMapImpl(new HashMap<String, GrammaticalTerm>(), false);
        map = map.makeSkinny();
        Assert.assertTrue(map.isSkinny());
    }

    @Test
    public void keySetTest() {
        Map<String, GrammaticalTerm> testMap = new HashMap<String, GrammaticalTerm>() {{
            put("test", new Noun());
        }};
        GrammaticalTermMapImpl map = new GrammaticalTermMapImpl(testMap, false);
        Set<String> keys = map.keySet();
        Assert.assertEquals(1, keys.size());
        Assert.assertTrue(keys.contains("test"));
    }

    @Test
    public void getTest() {
        Noun testNoun = new Noun();
        Map<String, GrammaticalTerm> testMap = new HashMap<String, GrammaticalTerm>() {{
            put("test", testNoun);
        }};
        GrammaticalTermMapImpl map = new GrammaticalTermMapImpl(testMap, false);
        Assert.assertEquals(testNoun, map.get("test"));
    }

    @Test
    public void containsKeyTest() {
        Map<String, GrammaticalTerm> testMap = new HashMap<String, GrammaticalTerm>() {{
            put("test", new Noun());
        }};
        GrammaticalTermMapImpl map = new GrammaticalTermMapImpl(testMap, false);
        Assert.assertTrue(map.containsKey("test"));
        Assert.assertFalse(map.containsKey("not_present_key"));
    }

    @Test
    public void entrySetTest() {
        Map<String, GrammaticalTerm> testMap = new HashMap<String, GrammaticalTerm>() {{
            put("test", new Noun());
        }};
        GrammaticalTermMapImpl map = new GrammaticalTermMapImpl(testMap, false);
        Set<Map.Entry<String, GrammaticalTerm>> entries = map.entrySet();
        Assert.assertEquals(1, entries.size());
        Assert.assertEquals("test", entries.iterator().next().getKey());
    }

}