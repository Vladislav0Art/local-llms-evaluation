package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedConstructorWithInitialDataTest {

    @Test
    public void constructorWithInitialDataTest() {
        Map<String, GrammaticalTerm> map = new HashMap<>();
        GrammaticalTerm term = new GrammaticalTerm();
        map.put("key", term);
        GrammaticalTermMapImpl<T> gtm = new GrammaticalTermMapImpl<>(map, true);
    }

}