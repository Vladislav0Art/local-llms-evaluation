package com.force.i18n.grammar.impl;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class GeneratedPutAllTest {

    @Test
    public void putAllTest() {
        Map<String, GrammaticalTerm> map = new HashMap<>();
        map.put("test1", new Noun.Human("test1", "Test1", "Tests1"));
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>(map, false);
        GrammaticalTermMapImpl<GrammaticalTerm> newTermMap = new GrammaticalTermMapImpl<>();
        newTermMap.putAll(termMap);
        Assert.assertEquals("test1", newTermMap.get("test1").getSingularAlias());
    }

}