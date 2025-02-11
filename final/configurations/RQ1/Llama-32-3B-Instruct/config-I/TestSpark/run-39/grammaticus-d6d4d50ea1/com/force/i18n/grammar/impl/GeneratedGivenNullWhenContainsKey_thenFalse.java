package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

import java.util.*;

public class GeneratedGivenNullWhenContainsKey_thenFalse {

    @Test
    public void givenNullWhenContainsKey_thenFalse() {
        GrammaticalTermMap<String> map = new GrammaticalTermMap<>();
        assertFalse(map.containsKey("test"));
    }

}