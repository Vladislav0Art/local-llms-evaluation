package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class GeneratedContainsKey_invalidKey {

    private GrammaticalTermMapImpl<String> testMap;
    private MapSerializer mapSerializer = new MapSerializer();

    @Test
    public void containsKey_invalidKey() {
        String invalidKey = "invalid";
        GrammaticalTermMapImpl<String> map = new GrammaticalTermMapImpl<>();
        assertFalse(map.containsKey(invalidKey));
    }

}