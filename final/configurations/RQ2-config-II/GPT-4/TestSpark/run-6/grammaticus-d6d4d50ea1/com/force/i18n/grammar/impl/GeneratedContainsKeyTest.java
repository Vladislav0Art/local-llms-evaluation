package com.force.i18n.grammar.impl;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.mock;

public class GeneratedContainsKeyTest {

    @Test
    public void containsKeyTest() {
        GrammaticalTerm term = mock(GrammaticalTerm.class);
        Map<String, GrammaticalTerm> map = new HashMap<>();
        map.put("Term", term);
        GrammaticalTermMapImpl termMap = new GrammaticalTermMapImpl(map, false);
        assertTrue(termMap.containsKey("Term"));
    }

}