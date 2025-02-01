package com.force.i18n.grammar.impl;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedEqualsSameSkinnyTest {

    @Test
    public void equalsSameSkinnyTest() {
        GrammaticalTermMapImpl<String> termMapA = new GrammaticalTermMapImpl<>(new HashMap<>(), true);
        GrammaticalTermMapImpl<String> termMapB = new GrammaticalTermMapImpl<>(new HashMap<>(), true);
        assertTrue(termMapA.equals(termMapB));
    }

}