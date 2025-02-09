package com.force.i18n.grammar.impl;

import org.junit.Test;
import org.junit.Assert;
import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class GeneratedGetTest {

    @Test
    public void getTest() {
        Map<String, String> map = new HashMap<>();
        map.put("TestKey", "TestValue");
        GrammaticalTermMapImpl<String> instance = new GrammaticalTermMapImpl<>(map, false);
        String value = instance.get("TestKey");
        Assert.assertEquals("TestValue", value);
    }

}