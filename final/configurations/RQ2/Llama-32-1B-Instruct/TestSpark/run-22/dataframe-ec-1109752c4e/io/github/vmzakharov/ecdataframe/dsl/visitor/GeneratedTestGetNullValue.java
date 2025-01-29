package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestGetNullValue {

    public String get(int index) {
        return null;
    }

    public void set(String value, int index) {
        // Not applicable for this example
    }

    public void add(String value, int index) {
        // Not applicable for this example
    }

    public int size() {
        return 0;
    }
}

public class DataFrameTests {

    private DataFrame df;

    @Before
    public void setUp() {
        df = new DataFrame();
    }

    public String getNullValue(int index) {
        return "null";
    }

    public void set(String value, int index) {
        if (index < 0 || index >= df.size()) {
            throw new IndexOutOfBoundsException("Index out of range");
        }
        df.set(value, index);
    }

    @Test
    public void testGetNullValue() {
        assertEquals(null, df.get(-1));
    }

}