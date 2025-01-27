package com.sun.tools.xjc.addon.xew;

public class GeneratedTestSetParametrisations {

    @Test
    public void testSetParametrisations() {
        Set<String> parametrisations = new HashSet<>();
        parametrisations.add("value1");
        parametrisations.add("value2");
        assertEquals(2, parametrisations.size());
    }

}