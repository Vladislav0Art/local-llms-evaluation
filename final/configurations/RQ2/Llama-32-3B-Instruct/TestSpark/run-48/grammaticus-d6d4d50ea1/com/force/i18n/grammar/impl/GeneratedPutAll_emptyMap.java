package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class GeneratedPutAll_emptyMap {

    private GrammaticalTermMapImpl<String> testMap;
    private MapSerializer mapSerializer = new MapSerializer();

    @Test
    public void putAll_emptyMap() {
        testMap = new GrammaticalTermMapImpl<>(new HashMap<>(), true);
        testMap.putAll(new GrammaticalTermMapImpl<>());
        assertEquals(0, testMap.size());
    }

}