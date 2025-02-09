package com.force.i18n.grammar.impl;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.*;

public class GeneratedPutTest {

    @Test
    public void putTest() {
        GrammaticalTermMapImpl<Object> grammaticalTermMap = new GrammaticalTermMapImpl<>();
        grammaticalTermMap.put("testKey", "testValue");
        Assert.assertEquals("testValue", grammaticalTermMap.get("testKey"));
    }

}