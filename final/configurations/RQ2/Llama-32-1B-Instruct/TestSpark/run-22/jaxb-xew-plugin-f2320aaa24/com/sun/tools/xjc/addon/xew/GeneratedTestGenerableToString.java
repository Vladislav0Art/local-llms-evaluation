package com.sun.tools.xjc.addon.xew;

public class GeneratedTestGenerableToString {

    @Test
    public void testGenerableToString() {
        String s = generableToString(jclass, "testAttribute");
        assertEquals("testAttribute", s);
    }

}