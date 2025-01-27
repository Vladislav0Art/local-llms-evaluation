package com.sun.tools.xjc.addon.xew;

public class GeneratedTest {

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

    @Test
    public void testExpectedTrue() {
        assertTrue(result);
    }

    @Test
    public void testExpectedFalse() {
        assertFalse(result);
    }
}

public class assertEqualsTest {
    private int expected;
    private int actual;

    @Before
    public void setUp() {
        expected = 2;
        actual = values.length;
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

    @Test
    public void testExpectedFalse() {
        assertFalse(result);
    }

}