package com.force.i18n.grammar.impl;

public class GeneratedGivenDifferentStringsWhenIntern_thenReturnDiffentValue {

    @Test
    public void givenDifferentStringsWhenIntern_thenReturnDiffentValue() {
        String value1 = "test";
        String value2 = "different";
        String interned1 = TermMapSerializer.interns.get(value1);
        String interned2 = TermMapSerializer.interns.get(value2);
        assertNotEquals(iinterned1, interned2);
    }
}

}