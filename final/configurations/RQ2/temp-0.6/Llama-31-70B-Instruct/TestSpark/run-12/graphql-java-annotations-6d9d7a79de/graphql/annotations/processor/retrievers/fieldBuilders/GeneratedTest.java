package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.annotationTypes.directives.activation.GraphQLDirectives;
import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.annotations.processor.exceptions.GraphQLAnnotationsException;
import graphql.annotations.processor.util.DirectiveJavaAnnotationUtil;
import graphql.schema.GraphQLArgument;
import graphql.schema.GraphQLDirective;
import graphql.schema.GraphQLScalarType;
import graphql.schema.GraphQLType;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static graphql.schema.GraphQLDirective.newDirective;

public class GeneratedTest {

    @Test
    public void testBuild() {
        // mocking
        AnnotatedElement mockAnnotatedElement = mock(AnnotatedElement.class);
        ProcessingElementsContainer mockContainer = mock(ProcessingElementsContainer.class);
        when(mockContainer.getDirectiveRegistry().containsKey("dummy")).thenReturn(true);
        GraphQLDirective mockDirective = mock(GraphQLDirective.class);
        when(mockContainer.getDirectiveRegistry().get("dummy").getDirective()).thenReturn(mockDirective);

        // Run test
        DirectivesBuilder directivesBuilder = new DirectivesBuilder(mockAnnotatedElement, mockContainer);
        GraphQLDirective[] result = directivesBuilder.build();

        // Verify results
        assertEquals(1, result.length);
        assertEquals(mockDirective, result[0]);
    }

}