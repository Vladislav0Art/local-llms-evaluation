package com.force.i18n.grammar.impl;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestSize {

    @Test
    public void testSize() {
        GrammaticalTermMap map = new GrammaticalTermMap();
        assertEquals(0, map.size());

        map.addElement("term1");
        assertEquals(1, map.size());
    }

}