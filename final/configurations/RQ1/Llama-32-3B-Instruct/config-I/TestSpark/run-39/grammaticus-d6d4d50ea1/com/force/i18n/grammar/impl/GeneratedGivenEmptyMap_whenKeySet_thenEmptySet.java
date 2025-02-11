package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

import java.util.*;

public class GeneratedGivenEmptyMap_whenKeySet_thenEmptySet {

    @Test
    public void givenEmptyMap_whenKeySet_thenEmptySet() {
        GrammaticalTermMapImpl<String> map = new GrammaticalTermMapImpl<>();
        assertTrue(map.keySet().isEmpty());
    }

}