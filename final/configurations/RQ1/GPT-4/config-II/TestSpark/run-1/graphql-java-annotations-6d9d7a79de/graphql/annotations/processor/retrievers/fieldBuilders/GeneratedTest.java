package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.schema.GraphQLArgument;
import graphql.schema.GraphQLDirective;
import graphql.schema.GraphQLScalarType;
import graphql.schema.Coercing;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.Matchers;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.lenient;
import static org.mockito.Mockito.when;

public class GeneratedTest {

    @Test
    public void buildIsNullTest() {
        DirectivesBuilder builder = new DirectivesBuilder(null, null);
        assertThat(builder.build(), is(null));
    }

    @Test
    public void buildDirectivesFromJavaAnnotationsTest() {
        AnnotatedElement object = Mockito.mock(AnnotatedElement.class);
        ProcessingElementsContainer container = Mockito.mock(ProcessingElementsContainer.class);
        GraphQLDirective directive = Mockito.mock(GraphQLDirective.class);
        Annotation annotation = Mockito.mock(Annotation.class);
        DirectivesBuilder builder = new DirectivesBuilder(object, container);

        lenient().when(container.getDirectiveRegistry()).thenReturn(Matchers.anyMap());
        lenient().when(container.getDirectiveRegistry().get(Matchers.anyString())).thenReturn(directive);
        lenient().when(directive.getArguments()).thenReturn(Arrays.asList(new GraphQLArgument("arg1", "description", new GraphQLScalarType("scalarType", "description", Mockito.mock(Coercing.class)), 1)));

        GraphQLDirective[] result = builder.build();
        assertThat(result[0], instanceOf(GraphQLDirective.class));
    }

    @Test
    public void transformArgsWithAnnotationAndNotEnoughArgsTest() {
        DirectivesBuilder builder = new DirectivesBuilder(Mockito.mock(AnnotatedElement.class), Mockito.mock(ProcessingElementsContainer.class));
        GraphQLDirective directive = Mockito.mock(GraphQLDirective.class);
        Annotation annotation = Mockito.mock(Annotation.class);
        when(annotation.annotationType().getDeclaredMethods()).thenReturn(new Method[]{});
        when(directive.getArguments()).thenReturn(Arrays.asList(Mockito.mock(GraphQLArgument.class)));

        try {
            builder.transformArgs(directive, annotation);
            fail("Expected an GraphQLAnnotationsException to be thrown");
        } catch (Exception e) {
            assertThat(e.getMessage(), is("Directive '" + directive.getName() + "' is supplied with more argument values than it supports"));
        }
    }

    @Test
    public void transformArgsWithArgumentValuesAndNotEnoughArgsTest() {
        DirectivesBuilder builder = new DirectivesBuilder(Mockito.mock(AnnotatedElement.class), Mockito.mock(ProcessingElementsContainer.class));
        GraphQLDirective directive = Mockito.mock(GraphQLDirective.class);
        when(directive.getArguments()).thenReturn(Arrays.asList(Mockito.mock(GraphQLArgument.class)));
        String[] argumentValues = {"value1"};

        try {
            builder.transformArgs(directive, argumentValues);
            fail("Expected an GraphQLAnnotationsException to be thrown");
        } catch (Exception e) {
            assertThat(e.getMessage(), is("Directive '" + directive.getName() + "' is supplied with more argument values than it supports"));
        }
    }

    @Test
    public void transformArgumentWithAnnotationAndArgumentTypeIsNotGraphQLTypeTest() {
        DirectivesBuilder builder = new DirectivesBuilder(Mockito.mock(AnnotatedElement.class), Mockito.mock(ProcessingElementsContainer.class));
        GraphQLDirective.Builder directiveBuilder = newDirective(Mockito.mock(GraphQLDirective.class));
        GraphQLArgument argument = Mockito.mock(GraphQLArgument.class);
        when(argument.getType()).thenReturn(Object.class);
        Annotation annotation = Mockito.mock(Annotation.class);

        try {
            builder.transformArgument(annotation, directiveBuilder, Arrays.asList(argument), 0);
            fail("Expected an GraphQLAnnotationsException to be thrown");
        } catch (Exception e) {
            assertThat(e.getMessage(), is("Directive argument type must be a scalar!"));
        }
    }

    @Test
    public void transformArgumentWithArgumentValuesAndArgumentTypeIsNotGraphQLTypeTest() {
        DirectivesBuilder builder = new DirectivesBuilder(Mockito.mock(AnnotatedElement.class), Mockito.mock(ProcessingElementsContainer.class));
        GraphQLDirective.Builder directiveBuilder = newDirective(Mockito.mock(GraphQLDirective.class));
        GraphQLArgument argument = Mockito.mock(GraphQLArgument.class);
        when(argument.getType()).thenReturn(Object.class);
        String[] argumentValues = {"value1"};

        try {
            builder.transformArgument(argumentValues, directiveBuilder, Arrays.asList(argument), 0);
            fail("Expected an GraphQLAnnotationsException to be thrown");
        } catch (Exception e) {
            assertThat(e.getMessage(), is("Directive argument type must be a scalar!"));
        }
    }

}