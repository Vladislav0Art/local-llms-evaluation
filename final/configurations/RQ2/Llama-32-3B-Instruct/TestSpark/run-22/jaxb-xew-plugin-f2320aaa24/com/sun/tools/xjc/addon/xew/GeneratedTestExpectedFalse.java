package com.sun.tools.xjc.addon.xew;

public class GeneratedTestExpectedFalse {

    @Before
    public void setUp() {
        parametrisations = new HashSet<>();
        parametrisations.add("value1");
        parametrisations.add("value2");
    }

    @Test
    public void testExpectedFalse() {
        assertFalse(result);
    }

}