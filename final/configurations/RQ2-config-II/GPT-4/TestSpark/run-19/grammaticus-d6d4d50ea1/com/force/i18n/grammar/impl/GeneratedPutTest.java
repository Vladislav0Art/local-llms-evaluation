package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Map;
import java.util.Set;

import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;

public class GeneratedPutTest {

    @Test
    public void putTest() {
        GrammaticalTermMapImpl map = new GrammaticalTermMapImpl<>();
        map.put("test", new GrammaticalTerm());
        assertTrue(map.containsKey("test"));
    }

}