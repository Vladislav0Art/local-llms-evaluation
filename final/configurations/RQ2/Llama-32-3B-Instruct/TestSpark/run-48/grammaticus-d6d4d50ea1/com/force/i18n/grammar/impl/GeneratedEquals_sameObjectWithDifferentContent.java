package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class GeneratedEquals_sameObjectWithDifferentContent {

    private GrammaticalTermMapImpl<String> testMap;
    private MapSerializer mapSerializer = new MapSerializer();

    @Test
    public void equals_sameObjectWithDifferentContent() {
        testMap = new GrammaticalTermMapImpl<>();
        GrammaticalTermMapImpl<String> otherMap = new GrammaticalTermMapImpl<>(new HashMap<>(), true);
        assertFalse(testMap.equals(otherMap));
    }

}