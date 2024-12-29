package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedGetNonExistentKeyTest {

    @Test
    public void getNonExistentKeyTest() {
        GrammaticalTermMapImpl<T> obj = new GrammaticalTermMapImpl<>(new HashMap<>());

        assertNull(obj.get("test"));
    }

}