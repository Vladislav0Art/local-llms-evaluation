package com.sun.tools.xjc.addon.xew;

public class GeneratedTestSetParametrisation {

    @Before
    public void setUp() {
        parametrisations = new HashSet<>();
        parametrisations.add("value1");
        parametrisations.add("value2");
    }

    @Test
    public void testSetParametrisation() {
        assertEquals(2, parametrisations.size());
    }
}

public class ListTest {
    @Before
    public void setUp() {
        values = new ArrayList<>();
        values.add("value1");
        values.add("value2");
    }

}