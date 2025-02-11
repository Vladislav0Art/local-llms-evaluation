package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

import java.util.*;

public class GeneratedGivenNullWhenIsEmpty_thenFalse {

    @Test
    public void givenNullWhenIsEmpty_thenFalse() {
        GrammaticalTermMap<String> map = new GrammaticalTermMap<>();
        assertFalse(map.isEmpty());
    }

}