package graphql.annotations.processor.retrievers.fieldBuilders;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestPublicClass {

    @Test
    public void testPublicClass() {
        // Arrange
        public class MyClass {
        }

        // Act and Assert
        assertTrue(classIsPublic(MyClass.class));
    }

}