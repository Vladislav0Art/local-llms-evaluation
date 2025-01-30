package graphql.annotations.processor.retrievers.fieldBuilders;

import org.junit.Test;
import org.mockito.Mockito;
import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.annotations.annotationTypes.GraphQLDirectiveDeclaration;
import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.annotations.processor.GraphQLAnnotations;
import graphql.annotations.processor.exceptions.GraphQLAnnotationsException;
import graphql.schema.GraphQLArgument;
import graphql.schema.GraphQLDirective;
import graphql.schema.GraphQLScalarType;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;

import static org.junit.Assert.assertArrayEquals;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class GeneratedTest {

    @GraphQLDirectiveDeclaration(name = "testDirective")
    private class TestDirective implements Annotation {
        public Class<? extends Annotation> annotationType() {
            return TestDirective.class;
        }
    }

    static class ProcessingContainerMock extends ProcessingElementsContainer {
        public ProcessingContainerMock() {
            super(new HashMap<>(), new GraphQLAnnotations());
        }
    }

    @Test
    public void buildWithNoExistingDirectiveTest() {
        Method method = Mockito.mock(Method.class);
        ProcessingElementsContainer container = new ProcessingContainerMock();
        DirectivesBuilder builder = new DirectivesBuilder(method, container);
        when(method.getAnnotations()).thenReturn(new Annotation[]{new TestDirective()});

        builder.build();
    }

    @Test
    public void buildWithExistingDirectiveTest() {
        Method method = Mockito.mock(Method.class);
        ProcessingElementsContainer container = new ProcessingContainerMock();
        DirectivesBuilder builder = new DirectivesBuilder(method, container);

        GraphQLDirective directive = Mockito.mock(GraphQLDirective.class);
        when(directive.getName()).thenReturn("testDirective");
        when(directive.getArguments()).thenReturn(Arrays.asList(Mockito.mock(GraphQLArgument.class)));

        container.getDirectiveRegistry().put("testDirective", new graphql.annotations.processor.typeBuilders.DirectiveBuilder(directive));

        when(method.getAnnotations()).thenReturn(new Annotation[]{new TestDirective()});
        builder.build();

        assertArrayEquals(new GraphQLDirective[]{directive}, builder.build());
    }

    @Test
    public void buildWithNonScalarArgumentTest() {
        Method method = Mockito.mock(Method.class);
        ProcessingElementsContainer container = new ProcessingContainerMock();
        DirectivesBuilder builder = new DirectivesBuilder(method, container);

        GraphQLArgument argument = Mockito.mock(GraphQLArgument.class);
        when(argument.getType()).thenReturn(Mockito.mock(GraphQLScalarType.class));

        GraphQLDirective directive = Mockito.mock(GraphQLDirective.class);
        when(directive.getName()).thenReturn("testDirective");
        when(directive.getArguments()).thenReturn(Arrays.asList(argument));

        container.getDirectiveRegistry().put("testDirective", new graphql.annotations.processor.typeBuilders.DirectiveBuilder(directive));

        when(method.getAnnotations()).thenReturn(new Annotation[]{new TestDirective()});
        builder.build();
    }

    @Test
    public void buildWithBadArgumentValueTest() {
        Method method = Mockito.mock(Method.class);
        ProcessingElementsContainer container = new ProcessingContainerMock();
        DirectivesBuilder builder = new DirectivesBuilder(method, container);

        GraphQLScalarType.Coercing coercing = Mockito.mock(GraphQLScalarType.Coercing.class);
        when(coercing.parseValue(any())).thenThrow(new RuntimeException());

        GraphQLScalarType scalarType = Mockito.mock(GraphQLScalarType.class);
        when(scalarType.getCoercing()).thenReturn(coercing);

        GraphQLArgument argument = Mockito.mock(GraphQLArgument.class);
        when(argument.getType()).thenReturn(scalarType);

        GraphQLDirective directive = Mockito.mock(GraphQLDirective.class);
        when(directive.getName()).thenReturn("testDirective");
        when(directive.getArguments()).thenReturn(Arrays.asList(argument));

        container.getDirectiveRegistry().put("testDirective", new graphql.annotations.processor.typeBuilders.DirectiveBuilder(directive));

        when(method.getAnnotations()).thenReturn(new Annotation[]{new TestDirective()});
        builder.build();
    }

    @Test
    public void buildWithGoodArgumentValueTest() {
        Method method = Mockito.mock(Method.class);
        ProcessingElementsContainer container = new ProcessingContainerMock();
        DirectivesBuilder builder = new DirectivesBuilder(method, container);

        GraphQLScalarType.Coercing coercing = Mockito.mock(GraphQLScalarType.Coercing.class);

        GraphQLScalarType scalarType = Mockito.mock(GraphQLScalarType.class);
        when(scalarType.getCoercing()).thenReturn(coercing);

        GraphQLArgument argument = Mockito.mock(GraphQLArgument.class);
        when(argument.getType()).thenReturn(scalarType);

        GraphQLDirective directive = Mockito.mock(GraphQLDirective.class);
        when(directive.getName()).thenReturn("testDirective");
        when(directive.getArguments()).thenReturn(Arrays.asList(argument));

        container.getDirectiveRegistry().put("testDirective", new graphql.annotations.processor.typeBuilders.DirectiveBuilder(directive));

        when(method.getAnnotations()).thenReturn(new Annotation[]{new TestDirective()});
        builder.build();

        verify(coercing).parseValue(anyString());
    }

}