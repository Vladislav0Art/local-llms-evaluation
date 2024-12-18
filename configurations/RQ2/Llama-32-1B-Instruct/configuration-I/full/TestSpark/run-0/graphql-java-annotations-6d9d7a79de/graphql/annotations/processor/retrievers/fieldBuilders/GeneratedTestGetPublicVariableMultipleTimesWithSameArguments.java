package graphql.annotations.processor.retrievers.fieldBuilders;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestGetPublicVariableMultipleTimesWithSameArguments {

    @Test
    public void testGetPublicVariableMultipleTimesWithSameArguments() {
        // Arrange
        String variableName = "public_variable";

        // Act
        Object result1 = TestClass.publicMethod(variableName, 10);
        Object result2 = TestClass.publicMethod(10, 20);

        System.out.println(result1);
        System.out.println(result2);
    }

    public static class TestClass {
        private String publicVariable;

        public TestClass() {
            this.publicVariable = "public_variable";
        }

        public Object publicMethod(String variableName) {
            if (variableName.equals("public_variable")) {
                return publicVariable;
            } else {
                return null;
            }
        }
    }

}