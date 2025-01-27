package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedPutAllTest {

    @Test
    public void putAllTest() throws IOException, ClassNotFoundException {
        GrammaticalTermMapImpl<T> map = new GrammaticalTermMapImpl<>(new HashMap<>(), false);
        Map<String, T> otherMap = new HashMap<>();
        otherMap.put("key", Mockito.mock(T.class));
        map.putAll(otherMap);
        assertEquals(1, map.keySet().size());
    }

}