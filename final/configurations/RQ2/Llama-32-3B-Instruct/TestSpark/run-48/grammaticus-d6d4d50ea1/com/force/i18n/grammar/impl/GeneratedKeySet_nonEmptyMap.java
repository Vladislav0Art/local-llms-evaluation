package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class GeneratedKeySet_nonEmptyMap {

    private GrammaticalTermMapImpl<String> testMap;
    private MapSerializer mapSerializer = new MapSerializer();

    @Test
    public void keySet_nonEmptyMap() {
        testMap = new GrammaticalTermMapImpl<>(new HashMap<>(), true);
        Set<String> keys = testMap.keySet();
        assertTrue(keys.isEmpty());
    }

}