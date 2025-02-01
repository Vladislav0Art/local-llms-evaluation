package com.force.i18n.grammar.impl;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedWriteJsonEmptyTest {

    @Test
    public void writeJsonEmptyTest() throws IOException {
        GrammaticalTermMapImpl<String> termMap = new GrammaticalTermMapImpl<>();
        StringBuilder out = new StringBuilder();
        termMap.writeJson(out, null, null, null);
        assertEquals("{}", out.toString());
    }

}