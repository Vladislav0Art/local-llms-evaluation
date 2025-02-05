package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import com.force.i18n.grammar.Noun;
import com.google.common.collect.ImmutableMap;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedHashCodeTest {

    // Testing put method

    @Test
    public void hashCodeTest() {
        Map<String, Noun> map = ImmutableMap.of("key", new Noun("singular", "plural"));
        GrammaticalTermMapImpl<Noun> termMap = new GrammaticalTermMapImpl<>(map, true);
        int expectedHashCode = map.hashCode();
        int actualHashCode = termMap.hashCode();
        assertEquals(expectedHashCode, actualHashCode);
    }

}