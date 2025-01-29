package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedPut {

    @Test
    public void put() {
        GrammaticalTermMap<T> grammaticalTermMap = (GrammaticalTermMap<T>) Mockito.mock(GrammaticalTermMap.class);
        Map<String, String> map = new HashMap<>();
        map.put("key1", "value1");
        assertEquals(2, map.size());
    }

}