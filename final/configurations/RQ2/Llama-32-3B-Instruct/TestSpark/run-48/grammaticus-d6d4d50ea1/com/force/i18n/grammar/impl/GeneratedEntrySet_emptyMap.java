package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class GeneratedEntrySet_emptyMap {

    private GrammaticalTermMapImpl<String> testMap;
    private MapSerializer mapSerializer = new MapSerializer();

    @Test
    public void entrySet_emptyMap() {
        GrammaticalTermMapImpl<String> map = new GrammaticalTermMapImpl<>();
        assertEquals(new HashSet<>(), map.entrySet());
    }

}