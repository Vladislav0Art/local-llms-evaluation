package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedContainsKeyNonExistentKeyTest {

    @Test
    public void containsKeyNonExistentKeyTest() {
        GrammaticalTermMapImpl<T> obj = new GrammaticalTermMapImpl<>(new HashMap<>());

        assertFalse(obj.containsKey("test"));
    }

}