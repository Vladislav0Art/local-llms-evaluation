package com.force.i18n.grammar.impl;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsEmptyTest {

    @Test
    public void isEmptyTest() {
        GrammaticalTermMapImpl<String> termMap = new GrammaticalTermMapImpl<>();
        assertTrue(termMap.isEmpty());
    }

}