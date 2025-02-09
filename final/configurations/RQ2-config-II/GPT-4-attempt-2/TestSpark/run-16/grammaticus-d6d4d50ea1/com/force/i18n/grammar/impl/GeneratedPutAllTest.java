package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class GeneratedPutAllTest {

    @Test
    public void PutAllTest() {
        Map<String, GrammaticalTerm> map1 = new HashMap<>();
        GrammaticalTermMapImpl<GrammaticalTerm> termMap1 = new GrammaticalTermMapImpl<>(map1, false);
        Map<String, GrammaticalTerm> map2 = new HashMap<>();
        map2.put("test", null);
        GrammaticalTermMapImpl<GrammaticalTerm> termMap2 = new GrammaticalTermMapImpl<>(map2, false);
        termMap1.putAll(termMap2);
        assertTrue(termMap1.containsKey("test"));
    }

}