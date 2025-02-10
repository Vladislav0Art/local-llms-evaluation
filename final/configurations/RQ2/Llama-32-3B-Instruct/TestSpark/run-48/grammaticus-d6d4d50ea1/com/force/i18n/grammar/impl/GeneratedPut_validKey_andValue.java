package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class GeneratedPut_validKey_andValue {

    private GrammaticalTermMapImpl<String> testMap;
    private MapSerializer mapSerializer = new MapSerializer();

    @Test
    public void put_validKey_andValue() {
        testMap = new GrammaticalTermMapImpl<>(new HashMap<>(), true);
        testMap.put("key", "value");
        assertEquals("value", testMap.get("key"));
    }

}