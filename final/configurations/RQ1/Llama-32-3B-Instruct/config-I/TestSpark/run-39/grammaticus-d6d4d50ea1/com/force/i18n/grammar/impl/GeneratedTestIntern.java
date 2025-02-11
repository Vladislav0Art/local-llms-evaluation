package com.force.i18n.grammar.impl;

public class GeneratedTestIntern {

    @Test
    public void testIntern() {
        TermMapSerializer.initInterns();
        assertEquals(0, TermMapSerializer.interns.size());
    }

}