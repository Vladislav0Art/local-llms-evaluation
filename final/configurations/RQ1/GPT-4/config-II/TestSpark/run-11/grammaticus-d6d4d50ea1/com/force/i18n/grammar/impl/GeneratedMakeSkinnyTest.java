package com.force.i18n.grammar.impl;

import org.junit.Test;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

import java.util.*;

public class GeneratedMakeSkinnyTest {

    @Test
    public void makeSkinnyTest() {
        Map<String, GrammaticalTerm> map = new HashMap<>();
        map.put("n1", new Noun() {
            @Override
            public String getName() {
                return "Noun1";
            }
        });
        GrammaticalTermMapImpl<GrammaticalTerm> originalTerMap = new GrammaticalTermMapImpl<>(map, false);
        GrammaticalTermMapImpl<GrammaticalTerm> skinnyMap = originalTerMap.makeSkinny();
        Assert.assertNotEquals(originalTerMap, skinnyMap);
        Assert.assertFalse(originalTerMap.isSkinny());
        Assert.assertTrue(skinnyMap.isSkinny());
    }

}