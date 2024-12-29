package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedEntrySetEmptyMapTest {

    @Test
    public void entrySetEmptyMapTest() {
        GrammaticalTermMapImpl<T> obj = new GrammaticalTermMapImpl<>();

        assertEquals(0, obj.entrySet().size());
    }

}