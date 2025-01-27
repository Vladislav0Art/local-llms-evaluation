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

import org.junit.Test;

import static org.mockito.Mockito.when;

public class GeneratedBuildDirectivesWithOneArgument {

    @Test
    public void buildDirectivesWithOneArgument() {
        AnnotatedElement element = Mockito.mock(AnnotatedElement.class);
        ProcessingElementsContainer container = new ProcessingElementsContainer();
        when(element.getAnnotation(GraphQLDirectives.class)).thenReturn(new GraphQLDirectives("test", "value"));
        GraphQLArgument argument = new GraphQLArgument();
        when(argument.getName()).thenReturn("argName");
        DirectivesBuilder builder = new DirectivesBuilder(element, container);
        List<GraphQLArgument> arguments = Arrays.asList(argument);
        when(element.getAnnotation(GraphQLDirectives.class)).thenReturn(new GraphQLDirectives("test", "value", Arrays.asList(argument)));
        GraphQLDirective[] directives = builder.build();
        assertEquals(1, directives.length);
    }

}