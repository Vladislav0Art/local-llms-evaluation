package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class GeneratedEntrySet_nonEmptyMap {

    private GrammaticalTermMapImpl<String> testMap;
    private MapSerializer mapSerializer = new MapSerializer();

    @Test
    public void entrySet_nonEmptyMap() {
        testMap = new GrammaticalTermMapImpl<>(new HashMap<>(), true);
        Set<Map.Entry<String, String>> entries = testMap.entrySet();
        assertTrue(entries.isEmpty());
    }

}