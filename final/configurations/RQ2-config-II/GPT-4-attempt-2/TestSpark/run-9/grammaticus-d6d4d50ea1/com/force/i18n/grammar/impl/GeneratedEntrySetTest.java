package com.force.i18n.grammar.impl;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Map;

import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;

public class GeneratedEntrySetTest {

    @Test
    public void entrySetTest() {
        Map<String, GrammaticalTerm> testMap = new HashMap<String, GrammaticalTerm>() {{
            put("test", new Noun());
        }};
        GrammaticalTermMapImpl map = new GrammaticalTermMapImpl(testMap, false);
        Set<Map.Entry<String, GrammaticalTerm>> entries = map.entrySet();
        Assert.assertEquals(1, entries.size());
        Assert.assertEquals("test", entries.iterator().next().getKey());
    }

}