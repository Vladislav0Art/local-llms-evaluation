package com.force.i18n.grammar.impl;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class GeneratedGrammaticalTermMapImplMapConstructorTest {

    @Test
    public void GrammaticalTermMapImplMapConstructorTest() {
        Map<String, GrammaticalTerm> map = new HashMap<>();
        map.put("test1", new Noun.Human("test", "Test", "Tests"));
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>(map, false);
        Assert.assertFalse(termMap.isEmpty());
    }

}