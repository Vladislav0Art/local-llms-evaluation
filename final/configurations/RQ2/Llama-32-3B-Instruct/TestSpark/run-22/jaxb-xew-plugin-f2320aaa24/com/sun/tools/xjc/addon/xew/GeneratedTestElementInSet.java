package com.sun.tools.xjc.addon.xew;

public class GeneratedTestElementInSet {

    @Test
    public void testElementInSet() {
        Set<String> parametrisations = new HashSet<>();
        parametrisations.add("value1");
        assertTrue(parametrisations.contains("value1"));
    }

}