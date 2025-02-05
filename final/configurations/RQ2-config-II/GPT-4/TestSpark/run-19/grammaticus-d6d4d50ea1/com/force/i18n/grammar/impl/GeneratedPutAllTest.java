package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Map;
import java.util.Set;

import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;

public class GeneratedPutAllTest {

    @Test
    public void putAllTest() {
        GrammaticalTermMapImpl map1 = new GrammaticalTermMapImpl<>();
        GrammaticalTermMapImpl map2 = new GrammaticalTermMapImpl<>();
        map1.put("test", new GrammaticalTerm());
        map2.putAll(map1);
        assertTrue(map2.containsKey("test"));
    }

}