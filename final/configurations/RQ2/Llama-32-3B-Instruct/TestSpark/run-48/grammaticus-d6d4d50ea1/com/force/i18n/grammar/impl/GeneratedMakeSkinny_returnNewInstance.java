package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class GeneratedMakeSkinny_returnNewInstance {

    private GrammaticalTermMapImpl<String> testMap;
    private MapSerializer mapSerializer = new MapSerializer();

    @Test
    public void makeSkinny_returnNewInstance() {
        GrammaticalTermMapImpl<String> skinnyMap = testMap.makeSkinny();
        assertNotNull(skinnyMap);
    }

}