package com.force.i18n.grammar.impl;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class GeneratedIsEmptyTest {

    @Test
    public void isEmptyTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>();
        Assert.assertTrue(termMap.isEmpty());
        termMap.put("test1", new Noun.Human("test", "Test", "Tests"));
        Assert.assertFalse(termMap.isEmpty());
    }

}