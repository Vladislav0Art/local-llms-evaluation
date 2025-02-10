package graphql.annotations.processor.retrievers.fieldBuilders;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTestGenerateFieldWithMock {

    @Test
    public void testGenerateFieldWithMock() {
        // Arrange
        String fieldName = "testFieldName";
        int fieldType = 1; // Test type for simplicity
        Object mockInstance = Mockito.mock(Object.class);

        // Act
        FieldBuilder generateField (fieldName, fieldType, mockInstance);
        PublicClass publicClass = (PublicClass) generateField;
        PublicMethod publicMethod = (PublicMethod) publicClass.generateMethod();

        // Assert
        System.out.println(publicMethod.getReturnType());
    }

}