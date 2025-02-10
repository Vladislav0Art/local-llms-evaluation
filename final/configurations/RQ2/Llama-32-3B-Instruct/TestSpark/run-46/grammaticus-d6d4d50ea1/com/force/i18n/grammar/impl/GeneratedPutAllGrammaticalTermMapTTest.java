package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedPutAllGrammaticalTermMapTTest {

    @Test
    public void putAllGrammaticalTermMapTTest() {
        Map<String, GrammaticalTerm> map = new HashMap<>();
        // setup test data
        GrammaticalTerm term = new GrammaticalTerm();
        map.put("key", term);
        GrammaticalTermMapImpl<T> gtm1 = new GrammaticalTermMapImpl<>(map, true);
        GrammaticalTermMapImpl<T> gtm2 = new GrammaticalTermMapImpl<>();
        gtm2.putAll(gtm1);
        assertEquals(map, gtm2);
    }

}