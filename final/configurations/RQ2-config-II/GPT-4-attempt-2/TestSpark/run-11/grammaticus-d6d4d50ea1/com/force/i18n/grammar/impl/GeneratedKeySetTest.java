package com.force.i18n.grammar.impl;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.*;

public class GeneratedKeySetTest {

    @Test
    public void keySetTest() {
        Map<String, Object> map = new HashMap<>();
        map.put("testKey", "testValue");
        GrammaticalTermMapImpl<Object> grammaticalTermMap = new GrammaticalTermMapImpl<>(map, false);
        Set<String> keySet = grammaticalTermMap.keySet();
        Assert.assertTrue(keySet.contains("testKey"));
    }

}