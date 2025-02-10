package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class GeneratedEquals_differentObjects {

    private GrammaticalTermMapImpl<String> testMap;
    private MapSerializer mapSerializer = new MapSerializer();

    @Test
    public void equals_differentObjects() {
        testMap = new GrammaticalTermMapImpl<>();
        GrammaticalTermMapImpl<String> otherMap = new GrammaticalTermMapImpl<>();
        assertFalse(testMap.equals(otherMap));
    }

}