package com.force.i18n.grammar.impl;

import org.junit.Test;
import org.junit.Assert;

import java.util.HashMap;
import java.util.Map;

import org.mockito.Mockito;

public class GeneratedConstructorWithMapTest {

    @Test
    public void constructorWithMapTest() {
        Map<String, GrammaticalTerm> map = new HashMap<>();
        map.put("key1", Mockito.mock(GrammaticalTerm.class));

        GrammaticalTermMapImpl termMap = new GrammaticalTermMapImpl(map, true);
        Assert.assertFalse(termMap.isEmpty());
    }

}