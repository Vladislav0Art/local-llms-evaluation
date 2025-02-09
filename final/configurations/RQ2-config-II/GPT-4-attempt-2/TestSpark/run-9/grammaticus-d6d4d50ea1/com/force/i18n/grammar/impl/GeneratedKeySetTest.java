package com.force.i18n.grammar.impl;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Map;

import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;

public class GeneratedKeySetTest {

    @Test
    public void keySetTest() {
        Map<String, GrammaticalTerm> testMap = new HashMap<String, GrammaticalTerm>() {{
            put("test", new Noun());
        }};
        GrammaticalTermMapImpl map = new GrammaticalTermMapImpl(testMap, false);
        Set<String> keys = map.keySet();
        Assert.assertEquals(1, keys.size());
        Assert.assertTrue(keys.contains("test"));
    }

}