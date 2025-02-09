package com.force.i18n.grammar.impl;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class GeneratedTest {

    @Test
    public void GrammaticalTermMapImplDefaultConstructorTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>();
        Assert.assertTrue(termMap.isEmpty());
    }

    @Test
    public void GrammaticalTermMapImplMapConstructorTest() {
        Map<String, GrammaticalTerm> map = new HashMap<>();
        map.put("test1", new Noun.Human("test", "Test", "Tests"));
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>(map, false);
        Assert.assertFalse(termMap.isEmpty());
    }

    @Test
    public void isEmptyTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>();
        Assert.assertTrue(termMap.isEmpty());
        termMap.put("test1", new Noun.Human("test", "Test", "Tests"));
        Assert.assertFalse(termMap.isEmpty());
    }

    @Test
    public void putTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>();
        termMap.put("test1", new Noun.Human("test", "Test", "Tests"));
        Assert.assertEquals("test", termMap.get("test1").getSingularAlias());
    }

    @Test
    public void putAllTest() {
        Map<String, GrammaticalTerm> map = new HashMap<>();
        map.put("test1", new Noun.Human("test1", "Test1", "Tests1"));
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>(map, false);
        GrammaticalTermMapImpl<GrammaticalTerm> newTermMap = new GrammaticalTermMapImpl<>();
        newTermMap.putAll(termMap);
        Assert.assertEquals("test1", newTermMap.get("test1").getSingularAlias());
    }

    @Test
    public void containsKeyTest() {
        Map<String, GrammaticalTerm> map = new HashMap<>();
        map.put("test1", new Noun.Human("test1", "Test1", "Tests1"));
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>(map, false);
        Assert.assertTrue(termMap.containsKey("test1"));
        Assert.assertFalse(termMap.containsKey("test2"));
    }

    @Test
    public void keySetTest() {
        Map<String, GrammaticalTerm> map = new HashMap<>();
        map.put("test1", new Noun.Human("test1", "Test1", "Tests1"));
        map.put("test2", new Noun.Human("test2", "Test2", "Tests2"));
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>(map, false);
        Set<String> keys = termMap.keySet();
        Assert.assertTrue(keys.contains("test1"));
        Assert.assertTrue(keys.contains("test2"));
        Assert.assertFalse(keys.contains("test3"));
    }

    @Test
    public void hashCodeTest() {
        Map<String, GrammaticalTerm> map = new HashMap<>();
        map.put("test1", new Noun.Human("test1", "Test1", "Tests1"));
        Map<String, GrammaticalTerm> map2 = new HashMap<>();
        map2.put("test1", new Noun.Human("test1", "Test1", "Tests1"));
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>(map, false);
        GrammaticalTermMapImpl<GrammaticalTerm> termMap2 = new GrammaticalTermMapImpl<>(map2, false);
        Assert.assertEquals(termMap.hashCode(), termMap2.hashCode());
    }

}