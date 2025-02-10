package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class GeneratedGet_invalidKey {

    private GrammaticalTermMapImpl<String> testMap;
    private MapSerializer mapSerializer = new MapSerializer();

    @Test
    public void get_invalidKey() {
        String invalidKey = "invalid";
        GrammaticalTermMapImpl<String> map = new GrammaticalTermMapImpl<>();
        assertNull(map.get(invalidKey));
    }

}