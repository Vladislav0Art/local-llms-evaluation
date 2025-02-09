package com.force.i18n.grammar.impl;

import org.junit.Test;
import org.junit.Assert;
import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class GeneratedValuesTest {

    @Test
    public void valuesTest() {
        Map<String, String> map = new HashMap<>();
        map.put("TestKey", "TestValue");
        GrammaticalTermMapImpl<String> instance = new GrammaticalTermMapImpl<>(map, false);
        Assert.assertTrue(instance.values().contains("TestValue"));
    }

}