package com.force.i18n.grammar.impl;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class GeneratedHashCodeTest {

    @Test
    public void hashCodeTest() {
        Map<String, GrammaticalTerm> map = new HashMap<>();
        map.put("test1", new Noun.Human("test1", "Test1", "Tests1"));
        Map<String, GrammaticalTerm> map2 = new HashMap<>();
        map2.put("test1", new Noun.Human("test1", "Test1", "Tests1"));
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>(map, false);
        GrammaticalTermMapImpl<GrammaticalTerm> termMap2 = new GrammaticalTermMapImpl<>(map2, false);
        Assert.assertEquals(termMap.hashCode(), termMap2.hashCode());
    }

}