package com.force.i18n.grammar.impl;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class GeneratedKeySetTest {

    @Test
    public void keySetTest() {
        Map<String, GrammaticalTerm> map = new HashMap<>();
        map.put("test1", new Noun.Human("test1", "Test1", "Tests1"));
        map.put("test2", new Noun.Human("test2", "Test2", "Tests2"));
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>(map, false);
        Set<String> keys = termMap.keySet();
        Assert.assertTrue(keys.contains("test1"));
        Assert.assertTrue(keys.contains("test2"));
        Assert.assertFalse(keys.contains("test3"));
    }

}