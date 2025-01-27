package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class GeneratedContainsKeyTest {

    @Test
    public void containsKeyTest() {
        GrammaticalTerm term = new GrammaticalTerm();

        GrammaticalTermMap<GrammaticalTerm> map = new HashMap<>();
        map.put("key", term);

        assertTrue(map.containsKey("key"));
        assertFalse(map.containsKey("otherKey"));
    }

}