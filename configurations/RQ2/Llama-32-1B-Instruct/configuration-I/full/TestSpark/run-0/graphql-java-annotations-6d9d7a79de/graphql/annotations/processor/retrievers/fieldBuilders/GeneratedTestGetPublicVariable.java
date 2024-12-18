package graphql.annotations.processor.retrievers.fieldBuilders;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestGetPublicVariable {

    @Test
    public void testGetPublicVariable() {
        // Arrange
        String variableName = "public_variable";

        // Act
        Object result1 = TestClass.publicMethod(variableName);
        System.out.println(result1);

        Object result2 = TestClass.publicMethod("non_public_variable", 10);
        System.out.println(result2);

        Object result3 = TestClass.publicMethod(10, 20);
        System.out.println(result3);
    }

}