package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestEmptySet {

    @Test
    public void testEmptySet() {
        GrammaticalTermMapImpl grammaticalTermMap = new GrammaticalTermMapImpl();
        assertEquals(0, grammaticalTermMap.size());

        // Add terms to the map
        grammaticalTermMap.addElement("term1");
        grammaticalTermMap.addElement("term2");

        // Get the size of the set
        assertEquals(2, grammaticalTermMap.size());

        // Remove a term from the map
        grammaticalTermMap.removeElement("term1");

        // Check if the size is still 2
        assertEquals(1, grammaticalTermMap.size());
    }

}