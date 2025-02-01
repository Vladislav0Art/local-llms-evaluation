package com.force.i18n.grammar.impl;

import org.junit.Test;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

import java.util.*;

public class GeneratedIsEmptyReturnsTrueOnEmptyMapTest {

    @Test
    public void isEmptyReturnsTrueOnEmptyMapTest() {
        Map<String, GrammaticalTerm> map = new HashMap<>();
        GrammaticalTermMapImpl<GrammaticalTerm> grammaticalTermMap = new GrammaticalTermMapImpl<>(map, false);
        Assert.assertTrue(grammaticalTermMap.isEmpty());
    }

}