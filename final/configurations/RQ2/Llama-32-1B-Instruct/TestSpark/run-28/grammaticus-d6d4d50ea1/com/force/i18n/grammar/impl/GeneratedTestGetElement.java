package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestGetElement {

    @Test
    public void testGetElement() {
        GrammaticalTermMapImpl grammaticalTermMap = new GrammaticalTermMapImpl();
        String term1 = "term1";
        String term2 = "term2";

        // Add terms to the map
        grammaticalTermMap.addElement(term1);
        grammaticalTermMap.addElement(term2);

        // Check if elements are present in the map
        assertEquals(0, grammaticalTermMap.containsKey(term1));
        assertEquals(1, grammaticalTermMap.containsKey(term2));

        // Remove a term from the map
        grammaticalTermMap.removeElement(term1);

        // Check if elements are not present in the map after removal
        assertEquals(1, grammaticalTermMap.size());
    }

}