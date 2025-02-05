package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import org.junit.Test;
import org.mockito.Mockito;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import static org.junit.Assert.assertEquals;

public class GeneratedBuildDifferentObjectsTest {

    @Test
    public void buildDifferentObjectsTest() {
        // Arrange
        ProcessingElementsContainer container1 = Mockito.mock(ProcessingElementsContainer.class);
        ProcessingElementsContainer container2 = Mockito.mock(ProcessingElementsContainer.class);
        Field field1 = Mockito.mock(Field.class);
        Field field2 = Mockito.mock(Field.class);
        DirectivesBuilder builder1 = new DirectivesBuilder(field1, container1);
        DirectivesBuilder builder2 = new DirectivesBuilder(field2, container2);
        // Act
        GraphQLDirective[] result1 = builder1.build();
        GraphQLDirective[] result2 = builder2.build();
        // Assert
        assertEquals(result1, result2);
    }

}