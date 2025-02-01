package com.force.i18n.grammar.impl;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsNotEmptyTest {

    @Test
    public void isNotEmptyTest() {
        GrammaticalTermMapImpl<String> termMap = new GrammaticalTermMapImpl<>();
        termMap.put("key", "value");
        assertFalse(termMap.isEmpty());
    }

}