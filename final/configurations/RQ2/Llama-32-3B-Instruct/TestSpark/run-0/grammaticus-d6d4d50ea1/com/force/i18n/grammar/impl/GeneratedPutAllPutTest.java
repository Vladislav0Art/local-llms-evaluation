package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedPutAllPutTest {

    @Test
    public void putAllPutTest() {
        GrammaticalTermMapImpl<T> obj = new GrammaticalTermMapImpl<>();

        Map<String, GrammaticalTerm> map = Mockito.mock(Map.class);
        obj.putAll(map);

        assertEquals(0, obj.keySet().size());
    }

}