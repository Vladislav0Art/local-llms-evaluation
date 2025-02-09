package com.force.i18n.grammar.impl;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.*;

public class GeneratedConstructorWithArgsTest {

    @Test
    public void constructorWithArgsTest() {
        Map<String, Object> map = new HashMap<>();
        map.put("testKey", "testValue");
        GrammaticalTermMapImpl<Object> grammaticalTermMap = new GrammaticalTermMapImpl<>(map, false);
        Assert.assertFalse(grammaticalTermMap.isEmpty());
    }

}