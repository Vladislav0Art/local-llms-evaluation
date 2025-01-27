package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedPutAndGet {

    @Test
    public void putAndGet() {
        String key = "existing-key";
        Object value = "value";
        GrammaticalTermMapImpl<Object> map = new GrammaticalTermMapImpl<>();
        map.put(key, value);
        assertEquals(value, map.get(key));
        assertTrue(map.containsKey(key));
    }

}