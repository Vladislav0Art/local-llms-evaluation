package com.force.i18n.grammar.impl;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.*;

public class GeneratedEntrySetTest {

    @Test
    public void entrySetTest() {
        Map<String, Object> map = new HashMap<>();
        map.put("testKey", "testValue");
        GrammaticalTermMapImpl<Object> grammaticalTermMap = new GrammaticalTermMapImpl<>(map, false);
        Set<Map.Entry<String, Object>> entries = grammaticalTermMap.entrySet();
        boolean foundEntry = entries.stream().anyMatch(entry -> entry.getKey().equals("testKey") && entry.getValue().equals("testValue"));
        Assert.assertTrue(foundEntry);
    }

}