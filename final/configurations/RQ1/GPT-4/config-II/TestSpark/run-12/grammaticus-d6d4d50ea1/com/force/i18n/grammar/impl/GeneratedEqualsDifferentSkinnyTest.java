package com.force.i18n.grammar.impl;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedEqualsDifferentSkinnyTest {

    @Test
    public void equalsDifferentSkinnyTest() {
        GrammaticalTermMapImpl<String> termMapA = new GrammaticalTermMapImpl<>();
        GrammaticalTermMapImpl<String> termMapB = new GrammaticalTermMapImpl<>(new HashMap<>(), true);
        assertFalse(termMapA.equals(termMapB));
    }

}