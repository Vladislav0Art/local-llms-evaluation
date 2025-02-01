package com.force.i18n.grammar.impl;

import org.junit.Test;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

import java.util.*;

public class GeneratedPutIsSkinnyFalseTest {

    @Test
    public void putIsSkinnyFalseTest() {
        Map<String, GrammaticalTerm> map = new HashMap<>();
        GrammaticalTermMapImpl<GrammaticalTerm> grammaticalTermMap = new GrammaticalTermMapImpl<>(map, false);
        grammaticalTermMap.put("key", new Noun() {
            @Override
            public String getName() {
                return "TestNoun";
            }
        });
        Assert.assertTrue(grammaticalTermMap.containsKey("key"));
    }

}