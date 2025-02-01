package com.force.i18n.grammar.impl;

import org.junit.Test;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

import java.util.*;

public class GeneratedEqualsTest {

    @Test
    public void equalsTest() {
        Map<String, GrammaticalTerm> map = new HashMap<>();
        GrammaticalTermMapImpl<GrammaticalTerm> grammaticalTermMap1 = new GrammaticalTermMapImpl<>(map, true);
        GrammaticalTermMapImpl<GrammaticalTerm> grammaticalTermMap2 = new GrammaticalTermMapImpl<>(map, true);
        Assert.assertEquals(grammaticalTermMap1, grammaticalTermMap2);
    }

}