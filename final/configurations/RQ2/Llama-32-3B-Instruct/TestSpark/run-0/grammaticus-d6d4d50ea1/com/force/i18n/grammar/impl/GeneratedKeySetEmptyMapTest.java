package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedKeySetEmptyMapTest {

    @Test
    public void keySetEmptyMapTest() {
        GrammaticalTermMapImpl<T> obj = new GrammaticalTermMapImpl<>();

        assertEquals(0, obj.keySet().size());
    }

}