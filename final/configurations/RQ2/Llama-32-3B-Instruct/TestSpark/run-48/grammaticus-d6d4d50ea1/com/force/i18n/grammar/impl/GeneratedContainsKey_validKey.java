package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class GeneratedContainsKey_validKey {

    private GrammaticalTermMapImpl<String> testMap;
    private MapSerializer mapSerializer = new MapSerializer();

    @Test
    public void containsKey_validKey() {
        testMap = new GrammaticalTermMapImpl<>(new HashMap<>(), true);
        assertTrue(testMap.containsKey("key"));
    }

}