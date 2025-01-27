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

public class GeneratedBuildDirectivesWithMultipleArguments {

    @Test
    public void buildDirectivesWithMultipleArguments() {
        AnnotatedElement element = Mockito.mock(AnnotatedElement.class);
        ProcessingElementsContainer container = new ProcessingElementsContainer();
        when(element.getAnnotation(GraphQLDirectives.class)).thenReturn(new GraphQLDirectives("test", "value"));
        List<GraphQLArgument> arguments = Arrays.asList(
                new GraphQLArgument().setName("argName1"),
                new GraphQLArgument().setName("argName2")
        );
        when(element.getAnnotation(GraphQLDirectives.class)).thenReturn(new GraphQLDirectives("test", "value", arguments));
        GraphQLDirective[] directives = builder.build();
        assertEquals(3, directives.length);
    }

}