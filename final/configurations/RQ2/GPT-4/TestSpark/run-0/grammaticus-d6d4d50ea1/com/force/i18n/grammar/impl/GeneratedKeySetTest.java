package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import com.force.i18n.grammar.GrammaticalTerm;
import org.junit.Assert;
import org.junit.Test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class GeneratedKeySetTest {

    @Test
    public void keySetTest() {
        Map<String, GrammaticalTerm> map = new HashMap<>();
        map.put("test", null);
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>(map, false);
        Set<String> keys = termMap.keySet();
        Assert.assertTrue(keys.contains("test"));
    }

}