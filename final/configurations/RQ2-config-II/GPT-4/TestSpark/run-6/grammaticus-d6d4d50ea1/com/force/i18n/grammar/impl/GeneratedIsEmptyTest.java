package com.force.i18n.grammar.impl;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.mock;

public class GeneratedIsEmptyTest {

    @Test
    public void isEmptyTest() {
        GrammaticalTermMapImpl emptyTermMap = new GrammaticalTermMapImpl();
        assertTrue(emptyTermMap.isEmpty());
        GrammaticalTerm term = mock(GrammaticalTerm.class);
        Map<String, GrammaticalTerm> map = new HashMap<>();
        map.put("Term", term);
        GrammaticalTermMapImpl notEmptyTermMap = new GrammaticalTermMapImpl(map, false);
        assertFalse(notEmptyTermMap.isEmpty());
    }

}