package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedPutAndGetTest {

    @Test
    public void putAndGetTest() {
        GrammaticalTermMapImpl<T> obj = new GrammaticalTermMapImpl<>();
        T term = Mockito.mock(T.class);

        obj.put("test", term);

        assertEquals(term, obj.get("test"));
    }

}