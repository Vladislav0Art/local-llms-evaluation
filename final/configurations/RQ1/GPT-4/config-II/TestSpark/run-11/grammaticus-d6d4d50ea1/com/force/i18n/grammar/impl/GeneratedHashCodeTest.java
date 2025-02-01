package com.force.i18n.grammar.impl;

import org.junit.Test;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

import java.util.*;

public class GeneratedHashCodeTest {

    @Test
    public void hashCodeTest() {
        Map<String, GrammaticalTerm> map = new HashMap<>();
        GrammaticalTermMapImpl<GrammaticalTerm> grammaticalTermMap = new GrammaticalTermMapImpl<>(map, true);
        int expectedHashcode = 37;
        Assert.assertEquals(expectedHashcode, grammaticalTermMap.hashCode());
    }

}