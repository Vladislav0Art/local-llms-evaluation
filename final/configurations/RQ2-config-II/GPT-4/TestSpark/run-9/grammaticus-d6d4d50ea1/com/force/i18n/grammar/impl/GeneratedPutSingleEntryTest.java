package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import com.force.i18n.grammar.Noun;
import com.google.common.collect.ImmutableMap;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedPutSingleEntryTest {

    // Testing put method

    @Test
    public void putSingleEntryTest() {
        GrammaticalTermMapImpl<Noun> termMap = new GrammaticalTermMapImpl<>();
        Noun noun = new Noun("singular", "plural");
        termMap.put("key", noun);
        assertTrue("Key is not present in map", termMap.containsKey("key"));
        assertEquals("Noun does not match", noun, termMap.get("key"));
    }

}