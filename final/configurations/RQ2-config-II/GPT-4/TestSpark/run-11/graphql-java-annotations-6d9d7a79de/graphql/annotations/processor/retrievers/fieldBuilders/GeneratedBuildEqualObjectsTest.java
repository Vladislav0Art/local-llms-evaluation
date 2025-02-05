package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import org.junit.Test;
import org.mockito.Mockito;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import static org.junit.Assert.assertEquals;

public class GeneratedBuildEqualObjectsTest {

    @Test
    public void buildEqualObjectsTest() {
        // Arrange
        ProcessingElementsContainer container = Mockito.mock(ProcessingElementsContainer.class);
        Field field = Mockito.mock(Field.class);
        DirectivesBuilder builder1 = new DirectivesBuilder(field, container);
        DirectivesBuilder builder2 = new DirectivesBuilder(field, container);
        // Act
        GraphQLDirective[] result1 = builder1.build();
        GraphQLDirective[] result2 = builder2.build();
        // Assert
        assertEquals(result1, result2);
    }

}