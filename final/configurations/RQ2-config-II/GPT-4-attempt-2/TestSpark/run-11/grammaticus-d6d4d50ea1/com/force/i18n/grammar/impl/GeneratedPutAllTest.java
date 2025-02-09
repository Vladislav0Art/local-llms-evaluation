package com.force.i18n.grammar.impl;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.*;

public class GeneratedPutAllTest {

    @Test
    public void putAllTest() {
        GrammaticalTermMapImpl<String> grammaticalTermMap1 = new GrammaticalTermMapImpl<>();
        grammaticalTermMap1.put("testKey1", "testValue1");
        GrammaticalTermMapImpl<String> grammaticalTermMap2 = new GrammaticalTermMapImpl<>();
        grammaticalTermMap2.put("testKey2", "testValue2");
        grammaticalTermMap1.putAll(grammaticalTermMap2);
        Assert.assertEquals("testValue2", grammaticalTermMap1.get("testKey2"));
    }

}