package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

import java.util.*;

public class GeneratedGivenStringWhenContainsKey_thenTrue {

    @Test
    public void givenStringWhenContainsKey_thenTrue() {
        GrammaticalTermMapImpl<String> map = new GrammaticalTermMapImpl<>();
        map.put("test", "value");
        assertTrue(map.containsKey("test"));
    }

}