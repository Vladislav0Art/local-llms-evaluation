package com.force.i18n.grammar.impl;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Map;

import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;

public class GeneratedContainsKeyTest {

    @Test
    public void containsKeyTest() {
        Map<String, GrammaticalTerm> testMap = new HashMap<String, GrammaticalTerm>() {{
            put("test", new Noun());
        }};
        GrammaticalTermMapImpl map = new GrammaticalTermMapImpl(testMap, false);
        Assert.assertTrue(map.containsKey("test"));
        Assert.assertFalse(map.containsKey("not_present_key"));
    }

}