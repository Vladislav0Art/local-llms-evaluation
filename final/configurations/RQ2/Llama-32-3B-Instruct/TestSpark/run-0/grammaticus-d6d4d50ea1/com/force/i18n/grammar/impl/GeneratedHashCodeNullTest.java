package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedHashCodeNullTest {

    @Test
    public void hashCodeNullTest() {
        GrammaticalTermMapImpl<T> obj = new GrammaticalTermMapImpl<>();
        assertTrue(obj.hashCode() == 0);
    }

}