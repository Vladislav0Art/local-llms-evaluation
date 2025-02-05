package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.schema.GraphQLDirective;
import graphql.schema.GraphQLScalarType;

import java.lang.reflect.Method;

import org.junit.Test;
import org.mockito.Mockito;

import java.lang.reflect.Field;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedBuildDirectivesFromMethodTest {

    @Test
    public void buildDirectivesFromMethodTest() throws NoSuchMethodException {
        // Arrange
        Method method = DirectivesBuilderTest.class.getDeclaredMethod("sampleMethod");
        ProcessingElementsContainer container = new ProcessingElementsContainer();
        DirectivesBuilder builder = new DirectivesBuilder(method, container);

        // Act
        GraphQLDirective[] directives = builder.build();

        // Assert
        assertNotNull(directives);
        assertTrue(directives.length > 0);
    }

}