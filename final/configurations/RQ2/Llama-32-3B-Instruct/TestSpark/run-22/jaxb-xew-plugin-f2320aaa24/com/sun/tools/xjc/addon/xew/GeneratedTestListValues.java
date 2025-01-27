package com.sun.tools.xjc.addon.xew;

public class GeneratedTestListValues {

    @Before
    public void setUp() {
        parametrisations = new HashSet<>();
        parametrisations.add("value1");
        parametrisations.add("value2");
    }

    @Test
    public void testListValues() {
        assertEquals(2, values.size());
    }
}

public class HashSetTest {
    @Before
    public void setUp() {
        parametrisations = new HashSet<>();
        parametrisations.add("value3");
        parametrisations.add("value4");
    }

}