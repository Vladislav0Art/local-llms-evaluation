package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class GeneratedPutAllTest {

    @Test
    public void putAllTest() {
        GrammaticalTerm term1 = new GrammaticalTerm();
        GrammaticalTerm term2 = new GrammaticalTerm();

        GrammaticalTermMap<GrammaticalTerm> otherMap = new HashMap<>();
        otherMap.put("key", term1);
        otherMap.put("otherKey", term2);

        GrammaticalTermMapImpl<GrammaticalTerm> map = new GrammaticalTermMapImpl<>();
        map.putAll(otherMap);

        assertEquals(term1, map.get("key"));
        assertEquals(term2, map.get("otherKey"));
    }

}