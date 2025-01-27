package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedKeySetTest {

    @Test
    public void keySetTest() {
        GrammaticalTermMapImpl<T> map = new GrammaticalTermMapImpl<>();
        Set<String> keys = map.keySet();
        assertTrue(keys.isEmpty());
    }

}