package com.sun.tools.xjc.addon.xew;

public class GeneratedTestArrayValues {

    @Before
    public void setUp() {
        parametrisations = new HashSet<>();
        parametrisations.add("value1");
        parametrisations.add("value2");
    }

    @Test
    public void testArrayValues() {
        assertEquals(2, values.length);
    }
}

public class ArraylistTest {
    private ArrayList<String> values;
    private Outline parametrisations;

    @Before
    public void setUp() {
        values = new ArrayList<>();
        values.add("value1");
        values.add("value2");
    }

}