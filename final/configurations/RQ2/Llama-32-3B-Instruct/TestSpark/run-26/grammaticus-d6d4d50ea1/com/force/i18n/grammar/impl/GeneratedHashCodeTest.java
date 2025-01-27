package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedHashCodeTest {

    @Test
    public void hashCodeTest() {
        GrammaticalTermMapImpl<T> map1 = new GrammaticalTermMapImpl<>();
        GrammaticalTermMapImpl<T> map2 = new GrammaticalTermMapImpl<>();
        assertEquals(0, map1.hashCode());
        assertEquals(0, map2.hashCode());
    }

}