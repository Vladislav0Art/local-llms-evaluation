package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.annotations.annotationTypes.directives.activation.GraphQLDirectives;
import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.annotations.processor.exceptions.GraphQLAnnotationsException;
import graphql.annotations.processor.util.DirectiveJavaAnnotationUtil;
import graphql.schema.GraphQLArgument;
import graphql.schema.GraphQLDirective;
import graphql.schema.GraphQLScalarType;
import graphql.schema.GraphQLType;

import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedBuildMethodThrowsExceptionWithNoDirectivesTest {

    @Test
    public void buildMethodThrowsExceptionWithNoDirectivesTest() {
        AnnotatedElement object = mock(AnnotatedElement.class);
        ProcessingElementsContainer container = mock(ProcessingElementsContainer.class);
        when(container.getGraphQLDirectives()).thenReturn(null);

        DirectivesBuilder builder = new DirectivesBuilder(object, container);

        try {
            GraphQLDirective[] directives = builder.build();
            fail("Expected exception not thrown");
        } catch (GraphQLAnnotationsException e) {
            assertEquals("Missing GraphQLDirectives", e.getMessage());
        }
    }

}