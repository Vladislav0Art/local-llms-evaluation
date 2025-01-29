package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void createMap() {
        Map<String, String> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");
        assertEquals(2, map.size());
    }

    @Test
    public void putAll() {
        Map<String, String> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");

        GrammaticalTermMap<T> grammaticalTermMap = (GrammaticalTermMap<T>) Mockito.mock(GrammaticalTermMap.class);
        Map<String, String> result = grammaticalTermMap.putAll(map);

        assertEquals(3, result.size());
        assertTrue(result.containsKey("key1"));
        assertEquals(2, result.get("key1").size());

        assertTrue(result.containsKey("key2"));
        assertEquals(2, result.get("key2").size());
    }

    @Test
    public void removeKey() {
        Map<String, String> map = new HashMap<>();
        map.put("key1", "value1");
        map.remove("key2");

        GrammaticalTermMap<T> grammaticalTermMap = (GrammaticalTermMap<T>) Mockito.mock(GrammaticalTermMap.class);
        Map<String, String> result = grammaticalTermMap.get(map);

        assertEquals(1, result.size());
        assertTrue(result.containsKey("key1"));
    }

    @Test
    public void put() {
        GrammaticalTermMap<T> grammaticalTermMap = (GrammaticalTermMap<T>) Mockito.mock(GrammaticalTermMap.class);
        Map<String, String> map = new HashMap<>();
        map.put("key1", "value1");
        assertEquals(2, map.size());
    }

    @Test
    public void get() {
        GrammaticalTermMap<T> grammaticalTermMap = (GrammaticalTermMap<T>) Mockito.mock(GrammaticalTermMap.class);
        Map<String, String> map = new HashMap<>();
        map.put("key1", "value1");

        assertEquals(2, grammaticalTermMap.get(map).size());

        // Test with null key
        Map<String, String> mapNullKey = new HashMap<>();
        assertEquals(0, grammaticalTermMap.get(mapNullKey).size());
    }

}