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

public class GeneratedTest {

    @Test
    public void buildDirectivesFromAnnotation() {
        AnnotatedElement element = Mockito.mock(AnnotatedElement.class);
        ProcessingElementsContainer container = new ProcessingElementsContainer();
        when(element.getAnnotation(GraphQLDirectives.class)).thenReturn(new GraphQLDirectives());
        DirectivesBuilder builder = new DirectivesBuilder(element, container);
        GraphQLDirective[] directives = builder.build();
        assertNotNull(directives);
    }

    @Test
    public void buildDirectivesFromMethod() {
        AnnotatedElement element = Mockito.mock(AnnotatedElement.class);
        ProcessingElementsContainer container = new ProcessingElementsContainer();
        when(element.getMethod("testMethod")).thenReturn(Mockito.mock(Method.class));
        DirectivesBuilder builder = new DirectivesBuilder(element, container);
        GraphQLDirective[] directives = builder.build();
        assertNotNull(directives);
    }

    @Test
    public void buildDirectivesFromField() {
        AnnotatedElement element = Mockito.mock(AnnotatedElement.class);
        ProcessingElementsContainer container = new ProcessingElementsContainer();
        when(element.getField("testField")).thenReturn(Mockito.mock(Method.class));
        DirectivesBuilder builder = new DirectivesBuilder(element, container);
        GraphQLDirective[] directives = builder.build();
        assertNotNull(directives);
    }

    @Test
    public void buildDirectivesWithoutAnnotation() {
        AnnotatedElement element = Mockito.mock(AnnotatedElement.class);
        ProcessingElementsContainer container = new ProcessingElementsContainer();
        when(element.getAnnotation(GraphQLDirectives.class)).thenReturn(null);
        DirectivesBuilder builder = new DirectivesBuilder(element, container);
        GraphQLDirective[] directives = builder.build();
        assertTrue(directives.length == 0);
    }

    @Test
    public void buildDirectivesWithoutMethod() {
        AnnotatedElement element = Mockito.mock(AnnotatedElement.class);
        ProcessingElementsContainer container = new ProcessingElementsContainer();
        when(element.getMethod("testMethod")).thenReturn(null);
        DirectivesBuilder builder = new DirectivesBuilder(element, container);
        GraphQLDirective[] directives = builder.build();
        assertTrue(directives.length == 0);
    }

    @Test
    public void buildDirectivesWithoutField() {
        AnnotatedElement element = Mockito.mock(AnnotatedElement.class);
        ProcessingElementsContainer container = new ProcessingElementsContainer();
        when(element.getField("testField")).thenReturn(null);
        DirectivesBuilder builder = new DirectivesBuilder(element, container);
        GraphQLDirective[] directives = builder.build();
        assertTrue(directives.length == 0);
    }

    @Test
    public void buildDirectivesWithNoArguments() {
        AnnotatedElement element = Mockito.mock(AnnotatedElement.class);
        ProcessingElementsContainer container = new ProcessingElementsContainer();
        when(element.getAnnotation(GraphQLDirectives.class)).thenReturn(new GraphQLDirectives("test", "value"));
        DirectivesBuilder builder = new DirectivesBuilder(element, container);
        GraphQLDirective[] directives = builder.build();
        assertEquals(1, directives.length);
    }

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