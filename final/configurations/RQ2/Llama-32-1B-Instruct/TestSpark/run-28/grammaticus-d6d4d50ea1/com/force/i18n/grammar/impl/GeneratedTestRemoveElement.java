package com.force.i18n.grammar.impl;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestRemoveElement {

    @Test
    public void testRemoveElement() {
        GrammaticalTermMap map = new GrammaticalTermMap();
        map.addElement("term1");
        map.addElement("term2");

        assertEquals(2, map.size());

        map.removeElement("term1");
        assertEquals(1, map.size());
    }

}