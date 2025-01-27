package com.sun.tools.xjc.addon.xew;

public class GeneratedTestExpectedValue {

    @Before
    public void setUp() {
        parametrisations = new HashSet<>();
        parametrisations.add("value1");
        parametrisations.add("value2");
    }

    @Test
    public void testExpectedValue() {
        assertEquals(expected, actual);
    }
}

public class assertFalseTest {
    private boolean result;

    @Before
    public void setUp() {
        result = false;
    }

}