package com.force.i18n.grammar.impl;

import org.junit.Test;
import org.junit.Assert;

import java.util.HashMap;
import java.util.Map;

import org.mockito.Mockito;

public class GeneratedMakeSkinnyTest {

    @Test
    public void makeSkinnyTest() {
        GrammaticalTermMapImpl termMap = new GrammaticalTermMapImpl();
        termMap = termMap.makeSkinny();
        Assert.assertTrue(termMap.isSkinny());
    }

}