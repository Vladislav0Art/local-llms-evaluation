package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class GeneratedIsEmpty_default {

    private GrammaticalTermMapImpl<String> testMap;
    private MapSerializer mapSerializer = new MapSerializer();

    @Test
    public void isEmpty_default() {
        testMap = new GrammaticalTermMapImpl<>();
        assertTrue(testMap.isEmpty());
    }

}