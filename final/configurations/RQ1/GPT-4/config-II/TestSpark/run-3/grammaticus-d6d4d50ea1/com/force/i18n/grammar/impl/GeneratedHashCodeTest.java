package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import com.force.i18n.grammar.GrammaticalTerm;
import org.junit.Test;
import org.junit.Assert;

import java.util.HashMap;
import java.util.Map;

public class GeneratedHashCodeTest {

    @Test
    public void hashCodeTest() {
        Map<String, GrammaticalTerm> map = new HashMap<>();
        map.put("key", new GrammaticalTermImpl());
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>(map, false);
        Assert.assertEquals(termMap.hashCode(), map.hashCode());
    }

}