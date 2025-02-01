package com.force.i18n.grammar.impl;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedPutAllSkinnyMapTest {

    @Test
    public void putAllSkinnyMapTest() {
        GrammaticalTermMapImpl<String> termMapA = new GrammaticalTermMapImpl<>(new HashMap<>(), true);
        GrammaticalTermMapImpl<String> termMapB = new GrammaticalTermMapImpl<>();
        termMapA.putAll(termMapB);
    }

}