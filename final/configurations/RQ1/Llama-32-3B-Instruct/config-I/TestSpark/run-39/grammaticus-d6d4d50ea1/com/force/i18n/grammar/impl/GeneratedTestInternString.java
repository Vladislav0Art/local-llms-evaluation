package com.force.i18n.grammar.impl;

public class GeneratedTestInternString {

    public static void testIntern() {
        TermMapSerializer.initInterns();
        assertEquals(0, TermMapSerializer.interns.size());
    }

    public static void givenNullWhenGet_thenReturnNull() {
        String value = "test";
        assertNull(TermMapSerializer.interns.get(value));
    }
}

public class TestTermMapSerializer {

    @Test
    public void testInternString() {
        TermMapSerializer.initInterns();
        assertEquals(0, TermMapSerializer.interns.size());
        String interned = TermMapSerializer.intern("test");
        assertNotNull(iinterned);
    }

}