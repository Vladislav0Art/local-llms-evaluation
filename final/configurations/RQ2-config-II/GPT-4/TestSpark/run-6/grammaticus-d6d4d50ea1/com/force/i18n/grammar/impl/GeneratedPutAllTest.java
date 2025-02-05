package com.force.i18n.grammar.impl;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.mock;

public class GeneratedPutAllTest {

    @Test
    public void putAllTest() {
        GrammaticalTerm term = mock(GrammaticalTerm.class);
        Map<String, GrammaticalTerm> mapOne = new HashMap<>();
        mapOne.put("Term", term);
        Map<String, GrammaticalTerm> mapTwo = new HashMap<>();
        mapTwo.put("newTerm", term);
        GrammaticalTermMapImpl termMapOne = new GrammaticalTermMapImpl(mapOne, false);
        GrammaticalTermMapImpl termMapTwo = new GrammaticalTermMapImpl(mapTwo, false);
        termMapOne.putAll(termMapTwo);
        assertTrue(termMapOne.containsKey("newTerm"));
    }

}