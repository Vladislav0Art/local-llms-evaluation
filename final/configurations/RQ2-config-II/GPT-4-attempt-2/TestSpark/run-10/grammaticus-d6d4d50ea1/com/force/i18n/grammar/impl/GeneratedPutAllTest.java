package com.force.i18n.grammar.impl;

import org.junit.Test;
import org.junit.Assert;
import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class GeneratedPutAllTest {

    @Test
    public void putAllTest() {
        Map<String, String> map = new HashMap<>();
        map.put("TestKey1", "TestValue1");
        GrammaticalTermMapImpl<String> instanceOne = new GrammaticalTermMapImpl<>(map, false);
        Map<String, String> mapTwo = new HashMap<>();
        map.put("TestKey2", "TestValue2");
        GrammaticalTermMapImpl<String> instanceTwo = new GrammaticalTermMapImpl<>(mapTwo, false);
        instanceOne.putAll(instanceTwo);
        Assert.assertTrue(instanceOne.containsKey("TestKey2"));
    }

}