package com.force.i18n.grammar.impl;

import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import java.util.HashMap;
import java.util.Map;

public class GeneratedPutAllTest {

    @Test
    public void putAllTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> map = new GrammaticalTermMapImpl<>();
        Map<String, GrammaticalTerm> tempMap = new HashMap<>();
        GrammaticalTerm term = new Noun() {
        };
        tempMap.put("test", term);
        map.putAll((GrammaticalTermMap<GrammaticalTerm>) tempMap);

        assertEquals(map.get("test"), term);
    }

}