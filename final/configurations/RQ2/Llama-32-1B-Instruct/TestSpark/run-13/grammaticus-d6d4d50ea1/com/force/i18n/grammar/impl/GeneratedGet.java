package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedGet {

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