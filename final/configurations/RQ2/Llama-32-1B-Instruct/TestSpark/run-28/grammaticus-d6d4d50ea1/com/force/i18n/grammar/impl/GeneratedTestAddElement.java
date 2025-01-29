package com.force.i18n.grammar.impl;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestAddElement {

    @Test
    public void testAddElement() {
        GrammaticalTermMap map = new GrammaticalTermMap();
        map.addElement("term1");
        assertEquals(1, map.size());
    }

}