package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedPutTest {

    @Test
    public void putTest() {
        GrammaticalTermMapImpl<T> map = new GrammaticalTermMapImpl<>();
        map.put("key", Mockito.mock(T.class));
        assertEquals(1, map.keySet().size());
    }

}