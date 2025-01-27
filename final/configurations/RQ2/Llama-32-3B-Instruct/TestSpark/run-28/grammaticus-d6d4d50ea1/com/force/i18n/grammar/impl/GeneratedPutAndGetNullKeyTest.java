package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class GeneratedPutAndGetNullKeyTest {

    @Test
    public void putAndGetNullKeyTest() {
        GrammaticalTerm term = new GrammaticalTerm();

        GrammaticalTermMapImpl<GrammaticalTerm> map = new GrammaticalTermMapImpl<>();
        assertThrows(NullPointerException.class, () -> map.put(null, term));
    }

}