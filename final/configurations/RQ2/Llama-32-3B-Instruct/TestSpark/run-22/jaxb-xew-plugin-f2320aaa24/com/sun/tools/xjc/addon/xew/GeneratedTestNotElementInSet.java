package com.sun.tools.xjc.addon.xew;

public class GeneratedTestNotElementInSet {

    @Test
    public void testNotElementInSet() {
        Set<String> parametrisations = new HashSet<>();
        parametrisations.add("value1");
        assertFalse(parametrisations.contains("value2"));
    }

}