package graphql.annotations.processor.retrievers.fieldBuilders;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestPublicClass {

    @Test
    public void testPublicClass() {
        // Test that the code in this method works as expected.
        String result = new MyClass().myMethod();
        assertEquals("Test Result", result);
    }

    public void myMethod() {
        return "Test Method";
    }

}