package graphql.annotations.processor.retrievers.fieldBuilders;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTestGenerateMethod {

    @Test
    public void testGenerateMethod() {
        // Arrange
        String methodName = "testMethodName";
        int returnType = 1; // Test return type for simplicity

        // Act
        PublicMethod generateMethod (methodName, returnType);

        // Assert
        System.out.println(generateMethod.getReturnType());
    }
}

class FieldBuilder {
    public static class PublicClass {
        public static class PublicMethod {
            private Class<?> returnType;

            public void setReturnType(Class<?> type) {
                this.returnType = type;
            }

            public Class<?> getReturnType() {
                return returnType;
            }
        }

        public static PublicMethod generateMethod(String methodName, int returnType) {
            return new PublicMethod();
        }
    }
}

}