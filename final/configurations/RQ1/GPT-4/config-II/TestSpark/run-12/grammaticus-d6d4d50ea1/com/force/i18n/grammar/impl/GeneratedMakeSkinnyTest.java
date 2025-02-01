package com.force.i18n.grammar.impl;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedMakeSkinnyTest {

    @Test
    public void makeSkinnyTest() {
        GrammaticalTermMapImpl<String> termMap = new GrammaticalTermMapImpl<>();
        assertTrue(termMap.makeSkinny().isSkinny());
    }

}