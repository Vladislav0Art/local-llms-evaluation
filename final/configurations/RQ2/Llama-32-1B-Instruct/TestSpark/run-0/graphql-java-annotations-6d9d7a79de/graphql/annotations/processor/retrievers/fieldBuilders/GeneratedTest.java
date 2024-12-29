package graphql.annotations.processor.retrievers.fieldBuilders;

import java.util.Arrays;

public class GeneratedTest {

    private int id;
    private String name;

    public TestClass(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void testGetIdAndName() {
        System.out.println(Arrays.toString(getIdAndName()));
    }
}

class TestClassTest {
    public TestClassgetIdAndName() {
        return new TestClass(1, "John");
    }

}