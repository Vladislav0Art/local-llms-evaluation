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

public class GeneratedBuild_DirectiveWithArgumentsReturnsDirectives {

    @Test
    public void build_DirectiveWithArgumentsReturnsDirectives() {
        AnnotatedElement object = mock(AnnotatedElement.class);
        ProcessingElementsContainer container = mock(ProcessingElementsContainer.class);

        DirectivesBuilder builder = new DirectivesBuilder(object, container);
        GraphQLDirective directive = mock(GraphQLDirective.class);
        when(directive.getName()).thenReturn("directivedName");
        List<GraphQLArgument> arguments = Arrays.asList(mock(GraphQLArgument.class), mock(GraphQLArgument.class));
        when(directive.getArguments()).thenReturn(arguments);
        GraphQLDirective[] directives = builder.build();
        assertEquals(1, directives.length);
        assertEquals(directive, directives[0]);
    }

}