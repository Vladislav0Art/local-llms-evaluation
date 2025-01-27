package com.sun.tools.xjc.addon.xew;

public class GeneratedTestHashSetParametrisation {

    @Before
    public void setUp() {
        parametrisations = new HashSet<>();
        parametrisations.add("value1");
        parametrisations.add("value2");
    }

    @Test
    public void testHashSetParametrisation() {
        assertEquals(2, parametrisations.size());
    }
}

public class ArrayTest {
    private String[] values;
    private HashSet<String> parametrisations;

    @Before
    public void setUp() {
        values = new String[]{"value1", "value2"};
    }

}