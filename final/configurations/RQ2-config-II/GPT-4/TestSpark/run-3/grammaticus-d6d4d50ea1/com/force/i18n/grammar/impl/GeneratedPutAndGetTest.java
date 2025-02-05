package com.force.i18n.grammar.impl;

import org.junit.Test;
import org.junit.Assert;

import java.util.HashMap;
import java.util.Map;

import org.mockito.Mockito;

public class GeneratedPutAndGetTest {

    @Test
    public void putAndGetTest() {
        GrammaticalTermMapImpl termMap = new GrammaticalTermMapImpl();
        GrammaticalTerm term = Mockito.mock(GrammaticalTerm.class);
        termMap.put("key1", term);
        Assert.assertEquals(term, termMap.get("key1"));
    }

}