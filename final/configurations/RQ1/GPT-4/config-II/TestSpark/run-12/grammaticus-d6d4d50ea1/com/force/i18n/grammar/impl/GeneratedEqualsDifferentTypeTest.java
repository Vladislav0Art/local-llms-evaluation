package com.force.i18n.grammar.impl;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedEqualsDifferentTypeTest {

    @Test
    public void equalsDifferentTypeTest() {
        GrammaticalTermMapImpl<String> termMapA = new GrammaticalTermMapImpl<>();
        assertFalse(termMapA.equals("test string"));
    }

}