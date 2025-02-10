package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedPutStringTTest {

    @Test
    public void putStringTTest() {
        GrammaticalTermMapImpl<T> gtm = new GrammaticalTermMapImpl<>();
        gtm.put("key", new GrammaticalTerm());
        assertEquals(1, gtm.keySet().size());
    }

}