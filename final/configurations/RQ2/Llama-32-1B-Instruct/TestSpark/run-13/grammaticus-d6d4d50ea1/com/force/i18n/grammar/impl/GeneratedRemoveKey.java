package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedRemoveKey {

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

}