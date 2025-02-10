package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class GeneratedIsSkinny_default {

    private GrammaticalTermMapImpl<String> testMap;
    private MapSerializer mapSerializer = new MapSerializer();

    @Test
    public void isSkinny_default() {
        testMap = new GrammaticalTermMapImpl<>();
        assertTrue(testMap.isSkinny());
    }

}