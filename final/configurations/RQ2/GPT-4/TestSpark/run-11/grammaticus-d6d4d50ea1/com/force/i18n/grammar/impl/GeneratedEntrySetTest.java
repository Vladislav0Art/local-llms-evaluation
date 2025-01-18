package com.force.i18n.grammar.impl;

import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

import java.io.IOException;
import java.util.*;

public class GeneratedEntrySetTest {

    @Test
    public void entrySetTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>();
        GrammaticalTerm term = mock(GrammaticalTerm.class);
        termMap.put("test", term);
        Set<Map.Entry<String, GrammaticalTerm>> entries = termMap.entrySet();
        assertEquals(1, entries.size());
        assertEquals(term, entries.iterator().next().getValue());
    }

}