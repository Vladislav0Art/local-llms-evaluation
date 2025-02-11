package com.force.i18n.grammar.impl;

public class GeneratedGivenStringWhenInternThenReturnSameValue {

    @Test
    public void givenStringWhenInternThenReturnSameValue() {
        String value = "test";
        String interned = TermMapSerializer.interns.get(value);
        assertEquals(value, interned);
    }

}