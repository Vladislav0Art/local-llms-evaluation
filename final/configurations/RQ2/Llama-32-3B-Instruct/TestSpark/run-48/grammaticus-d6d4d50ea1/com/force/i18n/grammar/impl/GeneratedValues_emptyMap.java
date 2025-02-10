package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class GeneratedValues_emptyMap {

    private GrammaticalTermMapImpl<String> testMap;
    private MapSerializer mapSerializer = new MapSerializer();

    @Test
    public void values_emptyMap() {
        GrammaticalTermMapImpl<String> map = new GrammaticalTermMapImpl<>();
        assertEquals(new HashSet<>(), map.values());
    }

}