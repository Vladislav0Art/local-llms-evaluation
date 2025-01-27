package com.sun.tools.xjc.addon.xew;

public class GeneratedTestArrayListValues {

    @Before
    public void setUp() {
        parametrisations = new HashSet<>();
        parametrisations.add("value1");
        parametrisations.add("value2");
    }

    @Test
    public void testArrayListValues() {
        assertEquals(2, values.size());
    }
}

public class assertTrueTest {
    private boolean result;

    @Before
    public void setUp() {
        result = true;
    }

}