package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedValuesTest {

    @Test
    public void valuesTest() {
        GrammaticalTermMapImpl<T> map = new GrammaticalTermMapImpl<>();
        Collection<T> values = map.values();
        assertTrue(values.isEmpty());
    }

}