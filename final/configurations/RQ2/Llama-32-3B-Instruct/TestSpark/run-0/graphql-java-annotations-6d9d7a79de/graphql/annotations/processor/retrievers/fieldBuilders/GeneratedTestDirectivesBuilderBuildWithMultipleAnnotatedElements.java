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

import static graphql.schema.GraphQLDirective.newDirective;
import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedTestDirectivesBuilderBuildWithMultipleAnnotatedElements {

    @Test
    public void testDirectivesBuilderBuildWithMultipleAnnotatedElements() {
        AnnotatedElement object1 = Mockito.mock(AnnotatedElement.class);
        AnnotatedElement object2 = Mockito.mock(AnnotatedElement.class);
        ProcessingElementsContainer container = new ProcessingElementsContainer();
        DirectivesBuilder builder = new DirectivesBuilder(object1, container);
        List<GraphQLDirective> directives = Arrays.asList(newDirective("testDirective"), newDirective("anotherTestDirective"));
        assertTrue(builder.build().length == 2);
    }

}