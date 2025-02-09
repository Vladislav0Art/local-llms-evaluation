package com.force.i18n.grammar.impl;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.*;

public class GeneratedIsEmptyTest {

    @Test
    public void isEmptyTest() {
        GrammaticalTermMapImpl<Object> grammaticalTermMap = new GrammaticalTermMapImpl<>();
        Assert.assertTrue(grammaticalTermMap.isEmpty());
        grammaticalTermMap.put("testKey", "testValue");
        Assert.assertFalse(grammaticalTermMap.isEmpty());
    }

}