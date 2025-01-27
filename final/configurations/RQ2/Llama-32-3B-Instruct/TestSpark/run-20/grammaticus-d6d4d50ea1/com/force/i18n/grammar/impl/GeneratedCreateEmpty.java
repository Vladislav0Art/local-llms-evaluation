package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedCreateEmpty {

    @Test
    public void createEmpty() {
        GrammaticalTermMapImpl<Object> map = new GrammaticalTermMapImpl<>();
        assertTrue(map.isEmpty());
        assertNull(map.get(null));
        assertFalse(map.containsKey(null));
    }

}