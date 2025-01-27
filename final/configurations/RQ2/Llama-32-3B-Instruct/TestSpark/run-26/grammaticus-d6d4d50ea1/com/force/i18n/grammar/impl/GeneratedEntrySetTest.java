package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedEntrySetTest {

    @Test
    public void entrySetTest() {
        GrammaticalTermMapImpl<T> map = new GrammaticalTermMapImpl<>();
        Set<Map.Entry<String, T>> entries = map.entrySet();
        assertTrue(entries.isEmpty());
    }

}