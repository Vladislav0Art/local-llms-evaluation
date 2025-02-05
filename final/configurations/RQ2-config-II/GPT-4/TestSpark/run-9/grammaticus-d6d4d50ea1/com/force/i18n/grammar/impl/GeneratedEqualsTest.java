package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import com.force.i18n.grammar.Noun;
import com.google.common.collect.ImmutableMap;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedEqualsTest {

    // Testing put method

    @Test
    public void equalsTest() {
        Map<String, Noun> map = ImmutableMap.of("key", new Noun("singular", "plural"));
        GrammaticalTermMapImpl<Noun> termMap1 = new GrammaticalTermMapImpl<>(map, true);
        GrammaticalTermMapImpl<Noun> termMap2 = new GrammaticalTermMapImpl<>(map, true);
        assertEquals(termMap1, termMap2);
    }

}