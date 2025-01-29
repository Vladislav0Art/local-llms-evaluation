package com.force.i18n.grammar.impl;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestRemoveElementNonExistent {

    @Test
    public void testRemoveElementNonExistent() {
        GrammaticalTermMap map = new GrammaticalTermMap();
        map.removeElement("term2");

        assertEquals(0, map.size());
    }

}