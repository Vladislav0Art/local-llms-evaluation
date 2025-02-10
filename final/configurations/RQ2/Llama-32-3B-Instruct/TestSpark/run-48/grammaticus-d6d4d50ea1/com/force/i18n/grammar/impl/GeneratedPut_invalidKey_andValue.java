package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class GeneratedPut_invalidKey_andValue {

    private GrammaticalTermMapImpl<String> testMap;
    private MapSerializer mapSerializer = new MapSerializer();

    @Test
    public void put_invalidKey_andValue() {
        String invalidKey = "invalid";
        String invalidValue = "invalidValue";
        testMap.put(invalidKey, invalidValue);
        assertNull(testMap.get(invalidKey));
    }

}