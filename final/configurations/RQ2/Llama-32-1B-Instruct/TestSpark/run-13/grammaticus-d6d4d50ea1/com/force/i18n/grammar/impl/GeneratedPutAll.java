package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedPutAll {

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

}