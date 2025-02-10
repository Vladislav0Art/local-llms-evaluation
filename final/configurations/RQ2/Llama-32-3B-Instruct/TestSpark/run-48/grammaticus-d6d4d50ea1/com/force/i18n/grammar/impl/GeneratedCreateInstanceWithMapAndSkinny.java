package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class GeneratedCreateInstanceWithMapAndSkinny {

    private GrammaticalTermMapImpl<String> testMap;
    private MapSerializer mapSerializer = new MapSerializer();

    @Test
    public void createInstanceWithMapAndSkinny() {
        testMap = new GrammaticalTermMapImpl<>(new HashMap<>(), true);
        assertNotNull(testMap);
    }

}