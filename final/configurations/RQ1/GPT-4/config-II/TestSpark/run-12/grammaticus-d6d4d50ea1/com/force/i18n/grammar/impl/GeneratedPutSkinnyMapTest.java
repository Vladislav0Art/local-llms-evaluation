package com.force.i18n.grammar.impl;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedPutSkinnyMapTest {

    @Test
    public void putSkinnyMapTest() {
        GrammaticalTermMapImpl<String> termMap = new GrammaticalTermMapImpl<>(new HashMap<>(), true);
        termMap.put("key", "value");
    }

}