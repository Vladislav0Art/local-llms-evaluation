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

public class GeneratedBuildDirectivesFromFieldTest {

    @Test
    public void buildDirectivesFromFieldTest() throws NoSuchFieldException {
        // Arrange
        Field field = DirectivesBuilderTest.class.getDeclaredField("sampleField");
        ProcessingElementsContainer container = new ProcessingElementsContainer();
        DirectivesBuilder builder = new DirectivesBuilder(field, container);

        // Act
        builder.build();
    }

}