package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedIsSkinnyFalseTest {

    @Test
    public void isSkinnyFalseTest() {
        GrammaticalTermMapImpl<T> obj = new GrammaticalTermMapImpl<>(new HashMap<>());

        assertFalse(obj.isSkinny());
    }

}