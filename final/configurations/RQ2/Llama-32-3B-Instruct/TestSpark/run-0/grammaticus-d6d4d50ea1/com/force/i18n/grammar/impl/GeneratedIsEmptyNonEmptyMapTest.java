package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedIsEmptyNonEmptyMapTest {

    @Test
    public void isEmptyNonEmptyMapTest() {
        GrammaticalTermMapImpl<T> obj = new GrammaticalTermMapImpl<>(new HashMap<>());

        assertFalse(obj.isEmpty());
    }

}