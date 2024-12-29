package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedIsSkinnyTrueTest {

    @Test
    public void isSkinnyTrueTest() {
        GrammaticalTermMapImpl<T> obj = new GrammaticalTermMapImpl<>(new HashMap<>(), true);

        assertTrue(obj.isSkinny());
    }

}