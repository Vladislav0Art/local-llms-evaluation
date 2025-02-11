package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

import java.util.*;

public class GeneratedGivenDifferentMaps_whenEquals_thenFalse {

    @Test
    public void givenDifferentMaps_whenEquals_thenFalse() {
        GrammaticalTermMapImpl<String> map1 = new GrammaticalTermMapImpl<>();
        GrammaticalTermMapImpl<String> map2 = new GrammaticalTermMapImpl<>();
        map2.map.put("test", "value");
        assertFalse(map1.equals(map2));
    }

}