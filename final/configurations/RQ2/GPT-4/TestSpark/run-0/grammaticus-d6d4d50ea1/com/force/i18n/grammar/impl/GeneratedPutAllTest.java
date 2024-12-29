package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import com.force.i18n.grammar.GrammaticalTerm;
import org.junit.Assert;
import org.junit.Test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class GeneratedPutAllTest {

    @Test
    public void putAllTest() {
        Map<String, GrammaticalTerm> map = new HashMap<>();
        map.put("test", null);
        GrammaticalTermMapImpl<GrammaticalTerm> termMap1 = new GrammaticalTermMapImpl<>(map, false);
        GrammaticalTermMapImpl<GrammaticalTerm> termMap2 = new GrammaticalTermMapImpl<>();
        termMap2.putAll(termMap1);
        boolean result = termMap2.containsKey("test");
        Assert.assertTrue(result);
    }

}