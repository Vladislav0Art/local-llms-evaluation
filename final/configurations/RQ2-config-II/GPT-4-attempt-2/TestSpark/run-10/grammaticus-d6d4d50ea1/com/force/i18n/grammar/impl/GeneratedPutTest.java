package com.force.i18n.grammar.impl;

import org.junit.Test;
import org.junit.Assert;
import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class GeneratedPutTest {

    @Test
    public void putTest() {
        GrammaticalTermMapImpl<String> instance = new GrammaticalTermMapImpl<>();
        instance.put("TestKey", "TestValue");
        Assert.assertTrue(instance.containsKey("TestKey"));
    }

}