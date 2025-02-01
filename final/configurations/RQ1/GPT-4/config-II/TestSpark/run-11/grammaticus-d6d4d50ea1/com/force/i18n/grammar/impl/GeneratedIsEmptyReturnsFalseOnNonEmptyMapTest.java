package com.force.i18n.grammar.impl;

import org.junit.Test;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

import java.util.*;

public class GeneratedIsEmptyReturnsFalseOnNonEmptyMapTest {

    @Test
    public void isEmptyReturnsFalseOnNonEmptyMapTest() {
        Map<String, GrammaticalTerm> map = new HashMap<>();
        map.put("n1", new Noun() {
            @Override
            public String getName() {
                return "Noun1";
            }
        });
        GrammaticalTermMapImpl<GrammaticalTerm> grammaticalTermMap = new GrammaticalTermMapImpl<>(map, false);
        Assert.assertFalse(grammaticalTermMap.isEmpty());
    }

}