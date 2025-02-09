package com.force.i18n.grammar.impl;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.*;

public class GeneratedTest {

    @Test
    public void constructorWithNoArgsTest() {
        GrammaticalTermMapImpl<Object> grammaticalTermMap = new GrammaticalTermMapImpl<>();
        Assert.assertTrue(grammaticalTermMap.isEmpty());
    }

    @Test
    public void constructorWithArgsTest() {
        Map<String, Object> map = new HashMap<>();
        map.put("testKey", "testValue");
        GrammaticalTermMapImpl<Object> grammaticalTermMap = new GrammaticalTermMapImpl<>(map, false);
        Assert.assertFalse(grammaticalTermMap.isEmpty());
    }

    @Test
    public void equalsTest() {
        GrammaticalTermMapImpl<Object> grammaticalTermMap1 = new GrammaticalTermMapImpl<>();
        GrammaticalTermMapImpl<Object> grammaticalTermMap2 = new GrammaticalTermMapImpl<>();
        Assert.assertTrue(grammaticalTermMap1.equals(grammaticalTermMap2));
    }

    @Test
    public void hashCodeTest() {
        GrammaticalTermMapImpl<Object> grammaticalTermMap = new GrammaticalTermMapImpl<>();
        Assert.assertNotNull(grammaticalTermMap.hashCode());
    }

    @Test
    public void isSkinnyTest() {
        Map<String, Object> map = new HashMap<>();
        map.put("testKey", "testValue");
        GrammaticalTermMapImpl<Object> grammaticalTermMap = new GrammaticalTermMapImpl<>(map, true);
        Assert.assertTrue(grammaticalTermMap.isSkinny());
    }

    @Test
    public void makeSkinnyTest() {
        Map<String, Object> map = new HashMap<>();
        map.put("testKey", "testValue");
        GrammaticalTermMapImpl<Object> grammaticalTermMap = new GrammaticalTermMapImpl<>(map, false);
        Assert.assertFalse(grammaticalTermMap.isSkinny());
        grammaticalTermMap = grammaticalTermMap.makeSkinny();
        Assert.assertTrue(grammaticalTermMap.isSkinny());
    }

    @Test
    public void keySetTest() {
        Map<String, Object> map = new HashMap<>();
        map.put("testKey", "testValue");
        GrammaticalTermMapImpl<Object> grammaticalTermMap = new GrammaticalTermMapImpl<>(map, false);
        Set<String> keySet = grammaticalTermMap.keySet();
        Assert.assertTrue(keySet.contains("testKey"));
    }

    @Test
    public void getTest() {
        Map<String, Object> map = new HashMap<>();
        map.put("testKey", "testValue");
        GrammaticalTermMapImpl<Object> grammaticalTermMap = new GrammaticalTermMapImpl<>(map, false);
        Assert.assertEquals("testValue", grammaticalTermMap.get("testKey"));
    }

    @Test
    public void containsKeyTest() {
        Map<String, Object> map = new HashMap<>();
        map.put("testKey", "testValue");
        GrammaticalTermMapImpl<Object> grammaticalTermMap = new GrammaticalTermMapImpl<>(map, false);
        Assert.assertTrue(grammaticalTermMap.containsKey("testKey"));
    }

    @Test
    public void entrySetTest() {
        Map<String, Object> map = new HashMap<>();
        map.put("testKey", "testValue");
        GrammaticalTermMapImpl<Object> grammaticalTermMap = new GrammaticalTermMapImpl<>(map, false);
        Set<Map.Entry<String, Object>> entries = grammaticalTermMap.entrySet();
        boolean foundEntry = entries.stream().anyMatch(entry -> entry.getKey().equals("testKey") && entry.getValue().equals("testValue"));
        Assert.assertTrue(foundEntry);
    }

    @Test
    public void valuesTest() {
        Map<String, Object> map = new HashMap<>();
        map.put("testKey", "testValue");
        GrammaticalTermMapImpl<Object> grammaticalTermMap = new GrammaticalTermMapImpl<>(map, false);
        Collection<Object> values = grammaticalTermMap.values();
        Assert.assertTrue(values.contains("testValue"));
    }

    @Test
    public void putTest() {
        GrammaticalTermMapImpl<Object> grammaticalTermMap = new GrammaticalTermMapImpl<>();
        grammaticalTermMap.put("testKey", "testValue");
        Assert.assertEquals("testValue", grammaticalTermMap.get("testKey"));
    }

    @Test
    public void putAllTest() {
        GrammaticalTermMapImpl<String> grammaticalTermMap1 = new GrammaticalTermMapImpl<>();
        grammaticalTermMap1.put("testKey1", "testValue1");
        GrammaticalTermMapImpl<String> grammaticalTermMap2 = new GrammaticalTermMapImpl<>();
        grammaticalTermMap2.put("testKey2", "testValue2");
        grammaticalTermMap1.putAll(grammaticalTermMap2);
        Assert.assertEquals("testValue2", grammaticalTermMap1.get("testKey2"));
    }

    @Test
    public void isEmptyTest() {
        GrammaticalTermMapImpl<Object> grammaticalTermMap = new GrammaticalTermMapImpl<>();
        Assert.assertTrue(grammaticalTermMap.isEmpty());
        grammaticalTermMap.put("testKey", "testValue");
        Assert.assertFalse(grammaticalTermMap.isEmpty());
    }

}