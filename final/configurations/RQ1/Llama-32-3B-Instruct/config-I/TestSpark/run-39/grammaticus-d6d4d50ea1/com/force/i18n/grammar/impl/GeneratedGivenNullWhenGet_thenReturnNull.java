package com.force.i18n.grammar.impl;

public class GeneratedGivenNullWhenGet_thenReturnNull {

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
    public void givenNullWhenGet_thenReturnNull() {
        String value = "test";
        assertNull(TermMapSerializer.interns.get(value));
    }
}

public class TermMapSerializer {

    private static Map<String, String> interns;

    public static void initInterns() {
        if (interns == null) {
            interns = new HashMap<>();
        }
    }

    public static String intern(String value) {
        if (!interns.containsKey(value)) {
            interns.put(value, value);
        }
        return interns.get(value);
    }

}