package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedValuesEmptyMapTest {

    @Test
    public void valuesEmptyMapTest() {
        GrammaticalTermMapImpl<T> obj = new GrammaticalTermMapImpl<>();

        assertTrue(obj.values().isEmpty());
    }

}