package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class GeneratedHashCode_differentObjects {

    private GrammaticalTermMapImpl<String> testMap;
    private MapSerializer mapSerializer = new MapSerializer();

    @Test
    public void hashCode_differentObjects() {
        testMap = new GrammaticalTermMapImpl<>();
        GrammaticalTermMapImpl<String> otherMap = new GrammaticalTermMapImpl<>();
        assertNotEquals(testMap.hashCode(), otherMap.hashCode());
    }

}