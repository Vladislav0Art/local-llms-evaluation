package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Map;
import java.util.Set;

import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;

public class GeneratedEntrySetTest {

    @Test
    public void entrySetTest() {
        GrammaticalTermMapImpl map = new GrammaticalTermMapImpl<>();
        Set<Map.Entry<String, GrammaticalTerm>> entries = map.entrySet();
        assertTrue(entries.isEmpty());
    }

}