package com.force.i18n.grammar.impl;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedContainsKeyTest {

    @Test
    public void containsKeyTest() {
        GrammaticalTermMapImpl<String> termMap = new GrammaticalTermMapImpl<>();
        termMap.put("key", "value");
        assertTrue(termMap.containsKey("key"));
    }

}