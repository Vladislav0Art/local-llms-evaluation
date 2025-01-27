package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class GeneratedKeySetTest {

    @Test
    public void keySetTest() {
        GrammaticalTermMap<GrammaticalTerm> map = new HashMap<>();

        assertTrue(map.keySet().isEmpty());

        map.put("key", new GrammaticalTerm());
        assertEquals(1, map.keySet().size());
    }

}