package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

import java.util.*;

public class GeneratedGivenNullWhenEquals_thenFalse {

    @Test
    public void givenNullWhenEquals_thenFalse() {
        GrammaticalTermMapImpl<String> map = new GrammaticalTermMapImpl<>();
        assertNotEquals(null, map);
    }

}