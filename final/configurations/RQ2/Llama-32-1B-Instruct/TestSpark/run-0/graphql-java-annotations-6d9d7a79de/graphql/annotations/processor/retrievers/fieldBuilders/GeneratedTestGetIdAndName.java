package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedTestGetIdAndName {

    private int id;
    private String name;

    // generate public constructor
    public TestClass(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // generate public method to get id and name
    public Object[] getIdAndName() {
        return new Object[]{id, name};
    }
}

// test 1
public class TestClassTest {

    @Test
    public void testGetIdAndName() {
        TestClass test = new TestClass(1, "John");
        Object[] result = test.getIdAndName();
        assertEquals("1", (String) result[0]);
        assertEquals("John", (String) result[1]);
    }

}