package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class GeneratedEntrySetTest {

    @Test
    public void EntrySetTest() {
        Map<String, GrammaticalTerm> map = new HashMap<>();
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>(map, false);
        Set<Map.Entry<String, GrammaticalTerm>> entries = termMap.entrySet();
        assertEquals(0, entries.size());
    }

}