package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class GeneratedIsEmptyTest {

    @Test
    public void isEmptyTest() {
        GrammaticalTermMap<GrammaticalTerm> map = new HashMap<>();

        assertTrue(map.isEmpty());
        assertFalse(map.isEmpty());

        map.put("key", new GrammaticalTerm());

        assertFalse(map.isEmpty());
        assertEquals(1, map.keySet().size());
    }

}