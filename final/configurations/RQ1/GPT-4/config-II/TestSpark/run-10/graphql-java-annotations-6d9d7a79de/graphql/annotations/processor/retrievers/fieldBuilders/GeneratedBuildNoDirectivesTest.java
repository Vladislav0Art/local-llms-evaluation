package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.annotations.processor.exceptions.GraphQLAnnotationsException;
import graphql.schema.GraphQLScalarType;
import graphql.schema.GraphQLDirective;
import graphql.schema.GraphQLArgument;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.Collections;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedBuildNoDirectivesTest {

    @Test
    public void buildNoDirectivesTest() {
        Field field = mock(Field.class);
        ProcessingElementsContainer container = mock(ProcessingElementsContainer.class);

        DirectivesBuilder directivesBuilder = new DirectivesBuilder(field, container);
        GraphQLDirective[] result = directivesBuilder.build();

        assertEquals(0, result.length);
    }

}