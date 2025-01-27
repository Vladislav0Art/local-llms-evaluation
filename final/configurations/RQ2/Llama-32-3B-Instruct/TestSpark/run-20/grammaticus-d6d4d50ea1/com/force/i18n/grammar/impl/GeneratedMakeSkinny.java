package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedMakeSkinny {

    @Test
    public void makeSkinny() {
        GrammaticalTermMapImpl<String> map = new GrammaticalTermMapImpl<>();
        assertTrue(map.isSkinny());
        assertFalse(map.makeSkinny().isSkinny());
    }

}