package com.force.i18n.grammar.impl;

import org.junit.Test;
import org.junit.Assert;
import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class GeneratedEntrySetTest {

    @Test
    public void entrySetTest() {
        Map<String, String> map = new HashMap<>();
        map.put("TestKey", "TestValue");
        GrammaticalTermMapImpl<String> instance = new GrammaticalTermMapImpl<>(map, false);
        Set<Map.Entry<String, String>> entries = instance.entrySet();
        Assert.assertTrue(entries.size() == 1);
    }

}