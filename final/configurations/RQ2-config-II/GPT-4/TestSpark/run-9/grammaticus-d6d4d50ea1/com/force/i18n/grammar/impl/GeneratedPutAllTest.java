package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import com.force.i18n.grammar.Noun;
import com.google.common.collect.ImmutableMap;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedPutAllTest {

    // Testing put method

    @Test
    public void putAllTest() {
        GrammaticalTermMapImpl<Noun> termMap = new GrammaticalTermMapImpl<>();
        Map<String, Noun> map = new HashMap<>();
        Noun noun1 = new Noun("singular1", "plural1");
        Noun noun2 = new Noun("singular2", "plural2");
        map.put("key1", noun1);
        map.put("key2", noun2);
        termMap.putAll(map);
        assertTrue("Keys are not present in map", termMap.containsKey("key1") && termMap.containsKey("key2"));
        assertEquals("Nouns does not match", noun1, termMap.get("key1"));
        assertEquals("Nouns does not match", noun2, termMap.get("key2"));
    }

}