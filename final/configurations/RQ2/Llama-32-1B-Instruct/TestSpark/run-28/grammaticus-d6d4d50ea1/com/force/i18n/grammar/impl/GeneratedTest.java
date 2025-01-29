package com.force.i18n.grammar.impl;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTest {

    @Test
    public void testGetElement() {
        GrammaticalTermMapImpl grammaticalTermMap = new GrammaticalTermMapImpl();
        String term = "term";
        boolean found = grammaticalTermMap.containsKey(term);
        assertEquals(true, found);
    }

}