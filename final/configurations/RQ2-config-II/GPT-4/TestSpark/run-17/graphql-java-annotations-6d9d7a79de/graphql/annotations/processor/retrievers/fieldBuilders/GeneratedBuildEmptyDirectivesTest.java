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

public class GeneratedBuildEmptyDirectivesTest {

    @Test
    public void buildEmptyDirectivesTest() {
        // Arrange
        Object object = new Object();
        ProcessingElementsContainer container = new ProcessingElementsContainer();
        DirectivesBuilder builder = new DirectivesBuilder(object, container);

        // Act
        GraphQLDirective[] directives = builder.build();

        // Assert
        assertNotNull(directives);
        assertEquals(0, directives.length);
    }

    @GraphQLDirectives(names = "sampleDirective")
    private void sampleMethod() {
    }

}