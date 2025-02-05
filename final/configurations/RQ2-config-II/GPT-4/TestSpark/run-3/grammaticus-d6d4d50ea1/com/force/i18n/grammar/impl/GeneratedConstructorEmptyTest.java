package com.force.i18n.grammar.impl;

import org.junit.Test;
import org.junit.Assert;

import java.util.HashMap;
import java.util.Map;

import org.mockito.Mockito;

public class GeneratedConstructorEmptyTest {

    @Test
    public void constructorEmptyTest() {
        GrammaticalTermMapImpl termMap = new GrammaticalTermMapImpl();
        Assert.assertTrue(termMap.isEmpty());
    }

}