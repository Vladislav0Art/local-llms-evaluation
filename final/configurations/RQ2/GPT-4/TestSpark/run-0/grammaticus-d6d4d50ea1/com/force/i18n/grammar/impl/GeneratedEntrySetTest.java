package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import com.force.i18n.grammar.GrammaticalTerm;
import org.junit.Assert;
import org.junit.Test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class GeneratedEntrySetTest {

    @Test
    public void entrySetTest() {
        Map<String, GrammaticalTerm> map = new HashMap<>();
        map.put("test", null);
        GrammaticalTermMapImpl<GrammaticalTerm> termMap1 = new GrammaticalTermMapImpl<>(map, false);
        Set<Map.Entry<String, GrammaticalTerm>> entries = termMap1.entrySet();
        Assert.assertEquals(1, entries.size());
    }

}