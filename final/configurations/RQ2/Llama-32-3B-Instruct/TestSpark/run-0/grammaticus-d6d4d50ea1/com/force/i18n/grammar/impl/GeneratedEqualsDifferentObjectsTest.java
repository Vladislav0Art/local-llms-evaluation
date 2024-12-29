package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedEqualsDifferentObjectsTest {

    @Test
    public void equalsDifferentObjectsTest() {
        GrammaticalTermMapImpl<T> obj1 = new GrammaticalTermMapImpl<>();
        GrammaticalTermMapImpl<T> obj2 = new GrammaticalTermMapImpl<>();

        assertFalse(obj1.equals(obj2));
    }

}