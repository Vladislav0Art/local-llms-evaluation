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

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedBuild_DirectivesWithDifferentArgsTypesReturnsDirectives {

    @Test
    public void build_DirectivesWithDifferentArgsTypesReturnsDirectives() {
        AnnotatedElement object = mock(AnnotatedElement.class);
        ProcessingElementsContainer container = mock(ProcessingElementsContainer.class);

        DirectivesBuilder builder = new DirectivesBuilder(object, container);
        GraphQLDirective directive1 = mock(GraphQLDirective.class);
        GraphQLDirective directive2 = mock(GraphQLDirective.class);
        when(directive1.getName()).thenReturn("directivedName");
        List<GraphQLArgument> arguments1 = Arrays.asList(mock(GraphQLArgument.class), mock(GraphQLArgument.class));
        when(directive1.getArguments()).thenReturn(arguments1);
        when(directive2.getName()).thenReturn("directivedName");
        List<GraphQLArgument> arguments2 = Arrays.asList(mock(GraphQLArgument.class), mock(GraphQLArgument.class));
        when(directive2.getArguments()).thenReturn(arguments2);

        GraphQLDirective[] directives1 = builder.build();
        assertEquals(1, directives1.length);
        assertEquals(directive1, directives1[0]);

        GraphQLDirective[] directives2 = builder.build();
        assertEquals(1, directives2.length);
        assertEquals(directive2, directives2[0]);
    }

}