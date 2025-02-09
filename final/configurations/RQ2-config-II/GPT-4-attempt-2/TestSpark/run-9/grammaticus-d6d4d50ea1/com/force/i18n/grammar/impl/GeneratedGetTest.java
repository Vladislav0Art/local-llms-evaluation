package com.force.i18n.grammar.impl;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Map;

import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;

public class GeneratedGetTest {

    @Test
    public void getTest() {
        Noun testNoun = new Noun();
        Map<String, GrammaticalTerm> testMap = new HashMap<String, GrammaticalTerm>() {{
            put("test", testNoun);
        }};
        GrammaticalTermMapImpl map = new GrammaticalTermMapImpl(testMap, false);
        Assert.assertEquals(testNoun, map.get("test"));
    }

}