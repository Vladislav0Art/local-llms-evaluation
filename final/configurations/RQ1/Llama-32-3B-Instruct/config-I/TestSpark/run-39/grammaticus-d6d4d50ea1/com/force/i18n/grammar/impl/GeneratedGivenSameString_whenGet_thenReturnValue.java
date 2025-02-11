package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

import java.util.*;

public class GeneratedGivenSameString_whenGet_thenReturnValue {

    @Test
    public void givenSameString_whenGet_thenReturnValue() {
        GrammaticalTermMapImpl<String> map = new GrammaticalTermMapImpl<>();
        map.put("test", "value");
        assertEquals("value", map.get("test"));
    }

}