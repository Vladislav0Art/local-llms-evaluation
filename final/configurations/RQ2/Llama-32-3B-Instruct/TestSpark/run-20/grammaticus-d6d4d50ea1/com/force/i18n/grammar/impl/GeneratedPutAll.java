package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedPutAll {

    @Test
    public void putAll() {
        String key1 = "existing-key-1";
        Object value1 = "value-1";

        String key2 = "existing-key-2";
        Object value2 = "value-2";

        GrammaticalTermMapImpl<Object> map = new GrammaticalTermMapImpl<>();
        map.put(key1, value1);
        map.put(key2, value2);

        GrammaticalTermMap<Object> otherMap = new GrammaticalTermMapImpl<>();
        otherMap.put("existing-key-3", "value-3");
        otherMap.put("existing-key-4", "value-4");

        map.putAll(otherMap);
        assertEquals(2, map.keySet().size());
        assertTrue(map.containsKey(key1));
        assertTrue(map.containsKey(key2));
    }

}